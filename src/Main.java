import database.SqliteAdapter;
import model.*;
import pojo.senddata.SendMessagePack;
import pojo.senddata.SendMessageResult;
import processing.Bot;
import processing.UpdateProcessor;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        final String token = "646115516:AAHvFbiUdH4h1nUE_2-z3VwpUETcLFkl53I";
        SqliteAdapter database = new SqliteAdapter();


        Bot bot = new Bot(token);
        UpdateProcessor processor = new UpdateProcessor();
        List<Message> messages = new ArrayList<>();
        List<Update> updates = bot.getUpdates();


        if (updates == null) {
            System.out.println("No updates");
        } else {
            for (Update upd : updates) {

                messages.add(processor.extractMessage(upd));

                System.out.println("Update №" + upd.getId());
                System.out.println("\tGot message_type[" + upd.getMessage().getId() + "] " + Bot.unixToString(upd.getMessage().getDate()));
                System.out.println("\tUser " + upd.getMessage().getFrom().getUsername());
                if (upd.getMessage().getRepliedTo() != null) {
                    Message repl = upd.getMessage().getRepliedTo();
                    System.out.println("\tReplied to '" + repl.getFrom().getUsername() + "' : " + repl.getText());
                }
                if (upd.getMessage().getForwardedFrom() != null) {
                    User repl = upd.getMessage().getForwardedFrom();
                    System.out.println("\tForwarded from '" + repl.getUsername() + "' : " + repl.getUserType());
                }
                if (upd.getMessage().getForwardedFromChat() != null) {
                    Chat repl = upd.getMessage().getForwardedFromChat();
                    System.out.println("\tForwarded from chat '" + repl.getUsername() + "' : " + repl.getTitle());
                }

                String text = upd.getMessage().getText();
                if (text != null) {
                    if (text.length() > 255) {
                        text = text.substring(0, 253);
                        text += "...";
                    }
                    System.out.println("\tText " + text);
                }

                if (upd.getMessage().getEntities() != null && upd.getMessage().getEntities().size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (MessageEntity ent :
                            upd.getMessage().getEntities()) {
                        if (ent.getUrl() != null) {
                            sb.append(ent.getText()).append("->[");
                            sb.append(ent.getUrl()).append("] ");
                        } else
                            sb.append(ent.getText()).append(" ");
                    }
                    System.out.println("\tEntities {" + sb.toString() + "}");
                }
            }
        }
        /*System.out.println("Loading messages for 394756858");
        messages = database.loadMessagesFromUserWith(394756858L);
        System.out.println("Loaded\n");*/

        for (Message msg : messages) {
            System.out.println("\tLooking at message_type with id of " + msg.getId());
            Message message = database.loadMessage(msg.getId());


            if (message == null) {
                System.out.println("Could not find such message_type in database. Adding...");
                database.saveMessage(msg);
            } else {
                if (!message.equals(msg) && message.getDate() < msg.getDate()) {
                    System.out.println("Patching old message_type...");
                    System.out.println(message.getText() + " -> " + msg.getText());
                    database.updateMessage(msg);
                } else {
                    System.out.println("Database record is up to date");
                }
            }
            System.out.println();
        }

        for (Message message : messages) {
            System.out.println("Sending message back to " + message.getChat().getUsername());
            System.out.println("Chat id=" + message.getChat().getId() + "\tMessage id=" + message.getId());
            SendMessagePack pack = new SendMessagePack(message.getChat().getId(), "Welcome to the club, buddy", message.getId());
            SendMessageResult reply = bot.sendMessage(pack);
            System.out.println("Got reply");
            if (reply.getOk()) {
                System.out.println("Ok");
                System.out.println("Said " + reply.getResult().getText() + " to " + reply.getResult().getChat().getUsername());
            } else {
                System.out.println("Failed " + reply.getError_code());
                System.out.println(reply.getDescription());
                if (reply.getError_code() == 404)
                    System.out.println("Is it deleted?");
            }
            System.out.println(reply);
            System.out.println();
        }

        //TODO create inline buttons
        // TODO create session
    }
}
