package processing;

import com.google.gson.Gson;
import pojo.GetMe;
import pojo.updates.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bot {
    private final String token;
    private Gson gson;
    private GetMe botInfo;

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

    public static String unixToString(Long unix) {
        Date date = new Date(unix * 1000);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return df.format(date);
    }

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

    private Update getUpdate() {
        try {
            return gson.fromJson(runFunction("getUpdates"), Update.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<model.Entity> findEntities(Message message) {
        List<MessageEntity> entities = message.getEntities();
        List<model.Entity> ret = new ArrayList<>();

        if (entities != null)
            for (MessageEntity entity : entities) {
                model.Entity ent = new model.Entity(
                        message.getText().substring(entity.getOffset(), entity.getOffset() + entity.getLength()),
                        entity.getType(),
                        entity.getUrl()
                );
                ret.add(ent);
            }
        return ret;
    }

    private model.Update pushUpdate(Message message, Long updateId) {
        List<model.Entity> entities = findEntities(message);


        model.User from = new model.User(
                message.getFrom().isIsBot(),
                message.getChat().getFirstName(),
                message.getChat().getLastName(),
                message.getChat().getUsername(),
                message.getFrom().getId(),
                message.getFrom().getLanguageCode(),
                message.getChat().getType()
        );

        model.User forwardedFrom = null;    //Initialize forwarded from person DATA
        if (message.getForwardFrom() != null) {
            User forwardedFromUser = message.getForwardFrom();
            forwardedFrom = new model.User(
                    forwardedFromUser.isIsBot(),
                    forwardedFromUser.getFirstName(),
                    forwardedFromUser.getLastName(),
                    forwardedFromUser.getUsername(),
                    forwardedFromUser.getId(),
                    message.getFrom().getLanguageCode(),
                    message.getChat().getType()
            );
        }

        model.Chat forwardedFromChat = null;    //Initialize forwarded from chat DATA
        if (message.getForwardFromChat() != null) {
            Chat forwardedChat = message.getForwardFromChat();
            forwardedFromChat = new model.Chat(
                    forwardedChat.getType(),
                    forwardedChat.getUsername(),
                    forwardedChat.getId(),
                    forwardedChat.getTitle()
            );
        }

        model.Message repliedTo = null;     //Get reply details
        if (message.getReplyToMessage() != null) {
            Message replyToMessage = message.getReplyToMessage();
            //Look for commands or hashtags inside replied message
            List<model.Entity> repliedEntities = findEntities(replyToMessage);

            model.User personWhoSaidThat = new model.User(
                    replyToMessage.getFrom().isIsBot(),
                    replyToMessage.getFrom().getFirstName(),
                    replyToMessage.getChat().getLastName(),
                    replyToMessage.getChat().getUsername(),
                    replyToMessage.getFrom().getId(),
                    replyToMessage.getFrom().getLanguageCode(),
                    replyToMessage.getChat().getType()
            );

            repliedTo = new model.Message(
                    replyToMessage.getText(),
                    replyToMessage.getDate(),
                    replyToMessage.getMessageId(),
                    repliedEntities,
                    personWhoSaidThat,
                    null,
                    null,
                    null
            );
        }

        model.Message updMessage = new model.Message(
                message.getText(),
                message.getDate(),
                message.getMessageId(),
                entities,
                from,
                forwardedFrom,
                repliedTo,
                forwardedFromChat
        );

        return new model.Update(
                updMessage,
                updateId
        );
    }

    public List<model.Update> getUpdates() {
        Update upd = getUpdate();
        System.out.println("Got updates. Parsing...");
        //System.out.println(upd);

        List<model.Update> updates = new ArrayList<>();

        if (upd == null || upd.getResult() == null)//Null check
            return null;

        for (Result res : upd.getResult()) {

            if (res.getMessage() == null && res.getEditedMessage() != null) {

                System.out.println("Update " + res.getUpdateId() + " contains edited message");
                updates.add(pushUpdate(res.getEditedMessage(), res.getUpdateId()));

            } else if (res.getMessage() != null) {

                System.out.println("Update " + res.getUpdateId() + " has message");
                updates.add(pushUpdate(res.getMessage(), res.getUpdateId()));

            } else {
                System.out.println("Update " + res.getUpdateId() + " has message:" + res.getMessage() + " editedMessage:" + res.getEditedMessage());
                System.out.println("Continuing parse...");
            }

        }

        return updates;
    }

    public String getBotUserName() {
        return botInfo.getResult().getUsername();
    }

    public Long getBotID() {
        return botInfo.getResult().getId();
    }

    public String getBotName() {
        return botInfo.getResult().getFirstName();
    }
}
