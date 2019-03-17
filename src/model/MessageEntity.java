package model;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("ALL")
public class MessageEntity implements Serializable {
    private final static long serialVersionUID = 7104251902488981382L;
    private String text;
    private String type;
    private String url;
    private pojo.updates.User user;


    MessageEntity(pojo.updates.MessageEntity e, Message msg) {
        this.text = msg.getText().substring(e.getOffset(), e.getOffset() + e.getLength());
        this.type = e.getType();
        this.url = e.getUrl();
        this.user = e.getUser();
    }

    public MessageEntity(String text, String type, String url, pojo.updates.User user) {
        this.text = text;
        this.type = type;
        this.url = url;
        this.user = user;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return getText().equals(that.getText()) &&
                getType().equals(that.getType()) &&
                Objects.equals(getUrl(), that.getUrl()) &&
                Objects.equals(getUser(), that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), getType(), getUrl(), getUser());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public pojo.updates.User getUser() {
        return user;
    }

    public void setUser(pojo.updates.User user) {
        this.user = user;
    }
}
