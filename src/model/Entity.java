package model;

import java.io.Serializable;

public class Entity implements Serializable {
    private final static long serialVersionUID = 7104251902488981382L;
    private String text;
    private String type;
    /*
user 	User 	Optional. For “text_mention” only, the mentioned user
     */
    private String url;

    public Entity(String text, String type, String url) {
        this.text = text;
        this.type = type;
        this.url = url;
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

    @Override
    public String toString() {
        return "MessageEntity{" +
                "text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
