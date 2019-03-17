package processing;

import model.Message;
import model.Update;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UpdateProcessor {
    public UpdateProcessor() {
    }

    public User extractUsers(Update update) {
        Message message = update.getMessage();
        return message.getFrom();
    }

    public Message extractMessage(Update update) {
        return update.getMessage();
    }
}
