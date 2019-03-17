package database;

import model.Message;
import model.Order;
import model.User;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class SqliteAdapter {

    private Connection c = null;

    public SqliteAdapter() {

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            System.out.println("Opened database successfully");

            Statement stmt = c.createStatement();
            //stmt.executeUpdate("DROP TABLE  active_users");
            //stmt.executeUpdate("DROP TABLE  messages");

            String sql = "CREATE TABLE IF NOT EXISTS active_users " +
                    "(ID INT NOT NULL UNIQUE,DATA TEXT NOT NULL,ORDERS TEXT)";
            stmt.executeUpdate(sql);
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS messages (ID INT NOT NULL UNIQUE,DATA TEXT NOT NULL," +
                    "USER INTEGER NOT NULL)");
            System.out.println("Table active_users and messages opened successfully");

            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    private static Object fromString(String s) throws IOException,
            ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(data));
        Object o = ois.readObject();
        ois.close();
        return o;
    }

    /**
     * Write the object to a Base64 string.
     */
    private static String toString(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o);
        oos.close();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

    public User loadUser(Long id) {
        User user = null;
        Statement stmt = null;
        String data = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DATA FROM active_users WHERE ID=" + id.toString());

            if (rs.next()) {
                data = rs.getString("DATA");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        if (data == null) {
            System.out.println("No users found with that id");
            return null;
        }
        try {
            user = (User) fromString(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        System.out.println("Loading user done successfully");
        System.out.println(user.getUsername() + " loaded successfully");
        return user;
    }

    public List<Order> loadOrders(Long userId) {
        List<Order> order = null;
        Statement stmt = null;
        String data = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ORDER FROM active_users WHERE ID=" + userId);

            if (rs.next()) {
                data = rs.getString("ORDER");
                System.out.println("Raw order loaded for user with id of " + userId);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        if (data == null) {
            System.out.println("No orders found for user with id of " + userId);
            return null;
        }
        try {
            order = (List<Order>) fromString(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        System.out.println("Found " + order.size() + " orders for user with id of " + userId);
        System.out.println("Loading order done successfully");
        return order;
    }

    public boolean saveUser(User user, List<Order> orders) {
        Statement stmt = null;
        try {
            System.out.println("Inserting...");
            stmt = c.createStatement();
            String sql = "INSERT INTO active_users (ID,DATA,ORDERS) " +
                    "VALUES (" + user.getId() + ",'" + toString(user) + "','" + toString(orders) + "')";
            stmt.executeUpdate(sql);
            System.out.println("Done");

            stmt.close();
            //c.commit(); database in auto-commit mode

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateUser(User user, List<Order> orders) {
        Statement stmt = null;
        try {
            System.out.println("Updating user " + user.getId());
            stmt = c.createStatement();
            String sql = "UPDATE active_users set ORDERS = '" + toString(orders) + "' where ID='" + user.getId() + "'";
            stmt.executeUpdate(sql);
            System.out.println("Done");

            stmt.close();
            //c.commit(); database in auto-commit mode

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateMessage(Message message) {
        Statement stmt = null;
        try {
            System.out.println("Updating message " + message.getId());
            stmt = c.createStatement();
            String sql = "UPDATE messages set DATA = '" + toString(message) + "' where ID='" + message.getId() + "'";
            stmt.executeUpdate(sql);
            System.out.println("Done");

            stmt.close();
            //c.commit(); database in auto-commit mode

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Message loadMessage(Long messageId) {
        Message message = null;
        Statement stmt = null;
        String data = null;
        Long userId = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM messages WHERE ID=" + messageId.toString());

            if (rs.next()) {
                data = rs.getString("DATA");
                userId = rs.getLong("USER");
                System.out.println("Message from " + userId);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        if (data == null) {
            System.out.println("No messages found with id of " + messageId);
            return null;
        }
        try {
            message = (Message) fromString(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        System.out.println("Loading message done successfully");
        System.out.println("Message from " + message.getFrom().getUsername() + " loaded successfully");
        return message;
    }

    public List<Message> loadMessagesFromUserWith(Long userId) {
        List<Message> messages = new ArrayList<>();
        Statement stmt = null;
        String data = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM messages WHERE USER=" + userId);

            while (rs.next()) {
                data = rs.getString("DATA");
                try {
                    messages.add((Message) fromString(data));
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        if (messages.size() == 0) {
            System.out.println("No messages found from user with id of " + userId);
            return null;
        }


        System.out.println("Loading messages done successfully");
        System.out.println("Loaded " + messages.size() + " messages from user with id of " + userId);
        return messages;
    }

    public boolean saveMessage(Message message) {
        Statement stmt = null;
        try {
            System.out.println("Inserting...");
            stmt = c.createStatement();
            String sql = "INSERT INTO messages (ID,DATA,USER) " +
                    "VALUES (" + message.getId() + ",'" + toString(message) + "','" + message.getFrom().getId() + "')";
            stmt.executeUpdate(sql);
            System.out.println("Done");

            stmt.close();
            //c.commit(); database in auto-commit mode

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
