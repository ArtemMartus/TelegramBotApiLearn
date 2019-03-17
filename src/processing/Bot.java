package processing;

import com.google.gson.Gson;
import pojo.GetMe;
import pojo.updates.Message;
import pojo.updates.Result;
import pojo.updates.Update;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class that handles bot api calls
 */
public class Bot {
    private final String token;
    private final Gson gson;
    /**
     * Basic information about bot
     * whose token we are using
     */
    @SuppressWarnings("FieldCanBeLocal")
    private GetMe botInfo;

    /**
     * @param token Token you've got from BotFather
     */
    public Bot(String token) {
        this.token = token;
        gson = new Gson();
        System.out.println("Retrieving bot info...");
        try {
            botInfo = gson.fromJson(runFunction("getMe"), GetMe.class);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        if (botInfo.isOk()) {
            System.out.println("Successfully initialized bot");
            System.out.println(botInfo);
        } else {
            System.out.println("Failed to initialize bot metadata");
        }
    }

    /**
     * @param unix Unix timestamp that will be converted to human readable date
     * @return [String] human readable date
     */
    public static String unixToString(Long unix) {
        Date date = new Date(unix * 1000);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return df.format(date);
    }


    /**
     * @param name
     * Run telegram/token/(name)
     * @return
     * JSON answer as String
     * @throws Exception
     * Exceptions about Internet and I\O
     */
    private String runFunction(String name) throws Exception {
        URL url = new URL("https://api.telegram.org/bot" + token + "/" + name);
        URLConnection connection = url.openConnection();
        InputStreamReader isr = new InputStreamReader(connection.getInputStream());
        BufferedReader reader = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        while (reader.ready())
            sb.append(reader.readLine());
        return sb.toString();

    }

    /**
     * @return
     * Returns JSON from runFunction("getUpdates")
     */
    private Update getUpdate() {
        try {
            return gson.fromJson(runFunction("getUpdates"), Update.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*private List<model.MessageEntity> findEntities(Message message) {
        List<MessageEntity> entities = message.getEntities();
        List<model.MessageEntity> ret = new ArrayList<>();

        if (entities != null)
            for (MessageEntity entity : entities) {
                model.MessageEntity ent = new model.MessageEntity(
                        message.getText().substring(entity.getOffset(), entity.getOffset() + entity.getLength()),
                        entity.getType(),
                        entity.getUrl(),
                        entity.getUser()
                );
                ret.add(ent);
            }
        return ret;
    }*/

    /**
     * @param message  Filled Message POJO from JSON
     * @param updateId Current update Id to correctly form model.Update
     * @return model.Update Filled object
     */
    private model.Update pushUpdate(Message message, Long updateId) {

        model.Message updMessage = new model.Message(message);

        return new model.Update(
                updMessage,
                updateId
        );
    }


    /**
     * @return
     * List of updates we got from server
     */
    public List<model.Update> getUpdates() {
        Update upd = getUpdate();
        System.out.println("Got updates. Parsing...");

        List<model.Update> updates = new ArrayList<>();

        if (upd == null || upd.getResult() == null)//Null check
            return null;

        for (Result res : upd.getResult()) {

            if (res.getMessage() == null && res.getEditedMessage() != null) {

                System.out.println("Update " + res.getUpdateId() + " contains edited message_type");
                updates.add(pushUpdate(res.getEditedMessage(), res.getUpdateId()));

            } else if (res.getMessage() != null) {

                System.out.println("Update " + res.getUpdateId() + " has message_type");
                updates.add(pushUpdate(res.getMessage(), res.getUpdateId()));

            } else {
                System.out.println("Update " + res.getUpdateId() + " has message_type:" + res.getMessage() + " editedMessage:" + res.getEditedMessage());
                System.out.println("Continuing parse...");
            }

        }

        return updates;
    }

    /*public String getBotUserName() {
        return botInfo.getResult().getUsername();
    }

    public Long getBotID() {
        return botInfo.getResult().getId();
    }

    public String getBotName() {
        return botInfo.getResult().getFirstName();
    }*/
}
