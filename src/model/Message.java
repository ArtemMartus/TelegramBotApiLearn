package model;

import pojo.updates.*;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Message implements Serializable {
    private final static long serialVersionUID = 1682075532188697845L;
    private String text;
    private Long date;
    private Long id;
    private List<Entity> entities;
    private User from;
    private User forwardedFrom;
    private Message repliedTo;
    private Chat forwardedFromChat;
    private Audio audio;
    private Document document;
    private Animation animation;
    private Game game;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    private VideoNote video_note;
    private String caption;
    private Contact contact;
    private Location location;
    private Venue venue;

    public Message(String text, Long date, Long id, List<Entity> entities, User from, User forwardedFrom, Message repliedTo, Chat forwardedFromChat) {
        this.text = text;
        this.date = date;
        this.id = id;
        this.entities = entities;
        this.from = from;
        this.forwardedFrom = forwardedFrom;
        this.repliedTo = repliedTo;
        this.forwardedFromChat = forwardedFromChat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getText(), message.getText()) &&
                getDate().equals(message.getDate()) &&
                getId().equals(message.getId()) &&
                getEntities().equals(message.getEntities()) &&
                getFrom().equals(message.getFrom()) &&
                Objects.equals(getForwardedFrom(), message.getForwardedFrom()) &&
                Objects.equals(getRepliedTo(), message.getRepliedTo()) &&
                Objects.equals(getForwardedFromChat(), message.getForwardedFromChat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), getDate(), getId(), getEntities(), getFrom(), getForwardedFrom(), getRepliedTo(), getForwardedFromChat());
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", id=" + id +
                ", entities=" + entities +
                ", from=" + from +
                ", forwardedFrom=" + forwardedFrom +
                ", repliedTo=" + repliedTo +
                ", forwardedFromChat=" + forwardedFromChat +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getForwardedFrom() {
        return forwardedFrom;
    }

    public void setForwardedFrom(User forwardedFrom) {
        this.forwardedFrom = forwardedFrom;
    }

    public Message getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(Message repliedTo) {
        this.repliedTo = repliedTo;
    }

    public Chat getForwardedFromChat() {
        return forwardedFromChat;
    }

    public void setForwardedFromChat(Chat forwardedFromChat) {
        this.forwardedFromChat = forwardedFromChat;
    }
}
