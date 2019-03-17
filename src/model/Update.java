package model;

import java.io.Serializable;

public class Update implements Serializable {
    private final static long serialVersionUID = -6813180937449748244L;
    private Message message;
    private Long id;

    public Update(Message message, Long id) {
        this.message = message;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            Update update = (Update) obj;
            return this.id.equals(update.id);
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Update{" +
                "message_type=" + message +
                ", id=" + id +
                '}';
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
