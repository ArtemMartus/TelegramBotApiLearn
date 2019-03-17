import database.SqliteAdapter;
import model.*;
import processing.Bot;
import processing.UpdateProcessor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final String token = "646115516:AAHvFbiUdH4h1nUE_2-z3VwpUETcLFkl53I";
        SqliteAdapter database = new SqliteAdapter();

        Bot bot = new Bot(token);
        UpdateProcessor processor = new UpdateProcessor();

        List<Update> updates = bot.getUpdates();
        Set<User> users = new HashSet<>();
        List<Message> messages = new ArrayList<>();

        if (updates == null) {
            System.out.println("No updates");
        } else {
            for (Update upd : updates) {

                users.add(processor.extractUsers(upd));
                messages.add(processor.extractMessage(upd));

                System.out.println("Update №" + upd.getId());
                System.out.println("\tGot message[" + upd.getMessage().getId() + "] " + Bot.unixToString(upd.getMessage().getDate()));
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

                if (upd.getMessage().getEntities().size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (Entity ent :
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

        for (Message msg : messages) {
            System.out.println("\tLooking at message with id of " + msg.getId());
            Message message = database.loadMessage(msg.getId());


            if (message == null) {
                System.out.println("Could not find such message in database. Adding...");
                database.saveMessage(msg);
            } else {
                if (!message.equals(msg)) {
                    System.out.println("Patching old message...");
                    System.out.println(message.getText() + " -> " + msg.getText());
                    database.updateMessage(msg);
                } else {
                    System.out.println("Database record is up to date");
                }
            }
            System.out.println();
        }

    }
}
