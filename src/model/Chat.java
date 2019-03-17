package model;

import java.io.Serializable;

public class Chat implements Serializable {
    private final static long serialVersionUID = -6516948573170655920L;
    private String type;
    private String username;
    private Long id;
    private String title;

    public Chat(String type, String username, Long id, String title) {
        this.type = type;
        this.username = username;
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            Chat chat = (Chat) obj;
            return chat.id.equals(this.id);
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
