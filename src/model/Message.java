package model;

import pojo.updates.message_type.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Message implements Serializable {
    private final static long serialVersionUID = 1682075532188697845L;
    private String text;
    private Long date;
    private Long id;
    private List<MessageEntity> entities;
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

    public Message(pojo.updates.Message m) {
        this.text = m.getText();
        this.date = m.getDate();
        this.id = m.getMessageId();
        if (m.getFrom() != null && m.getChat() != null)
            this.from = new User(m.getFrom(), m.getChat());
        if (m.getForwardFrom() != null && m.getChat() != null)
            this.forwardedFrom = new User(m.getForwardFrom(), m.getChat());
        if (m.getReplyToMessage() != null)
            this.repliedTo = new Message(m.getReplyToMessage());
        if (m.getForwardFromChat() != null)
            this.forwardedFromChat = new Chat(m.getForwardFromChat());
        this.audio = m.getAudio();
        this.document = m.getDocument();
        this.animation = m.getAnimation();
        this.game = m.getGame();
        this.photo = m.getPhoto();
        this.sticker = m.getSticker();
        this.video = m.getVideo();
        this.voice = m.getVoice();
        this.video_note = m.getVideoNote();
        this.caption = m.getCaption();
        this.contact = m.getContact();
        this.location = m.getLocation();
        this.venue = m.getVenue();

        List<pojo.updates.MessageEntity> entities = m.getEntities();
        if (entities != null) {
            this.entities = new ArrayList<>();
            for (pojo.updates.MessageEntity messageEntity : entities)
                if (messageEntity != null)
                    this.entities.add(new MessageEntity(messageEntity, this));
        } else
            this.entities = null;
    }

    public Message(String text, Long date, Long id, List<MessageEntity> entities, User from, User forwardedFrom, Message repliedTo, Chat forwardedFromChat, Audio audio, Document document, Animation animation, Game game, List<PhotoSize> photo, Sticker sticker, Video video, Voice voice, VideoNote video_note, String caption, Contact contact, Location location, Venue venue) {
        this.text = text;
        this.date = date;
        this.id = id;
        this.entities = entities;
        this.from = from;
        this.forwardedFrom = forwardedFrom;
        this.repliedTo = repliedTo;
        this.forwardedFromChat = forwardedFromChat;
        this.audio = audio;
        this.document = document;
        this.animation = animation;
        this.game = game;
        this.photo = photo;
        this.sticker = sticker;
        this.video = video;
        this.voice = voice;
        this.video_note = video_note;
        this.caption = caption;
        this.contact = contact;
        this.location = location;
        this.venue = venue;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
                ", audio=" + audio +
                ", document=" + document +
                ", animation=" + animation +
                ", game=" + game +
                ", photo=" + photo +
                ", sticker=" + sticker +
                ", video=" + video +
                ", voice=" + voice +
                ", video_note=" + video_note +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", venue=" + venue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getText(), message.getText()) &&
                getDate().equals(message.getDate()) &&
                getId().equals(message.getId()) &&
                Objects.equals(getEntities(), message.getEntities()) &&
                getFrom().equals(message.getFrom()) &&
                Objects.equals(getForwardedFrom(), message.getForwardedFrom()) &&
                Objects.equals(getRepliedTo(), message.getRepliedTo()) &&
                Objects.equals(getForwardedFromChat(), message.getForwardedFromChat()) &&
                Objects.equals(getAudio(), message.getAudio()) &&
                Objects.equals(getDocument(), message.getDocument()) &&
                Objects.equals(getAnimation(), message.getAnimation()) &&
                Objects.equals(getGame(), message.getGame()) &&
                Objects.equals(getPhoto(), message.getPhoto()) &&
                Objects.equals(getSticker(), message.getSticker()) &&
                Objects.equals(getVideo(), message.getVideo()) &&
                Objects.equals(getVoice(), message.getVoice()) &&
                Objects.equals(getVideo_note(), message.getVideo_note()) &&
                Objects.equals(getCaption(), message.getCaption()) &&
                Objects.equals(getContact(), message.getContact()) &&
                Objects.equals(getLocation(), message.getLocation()) &&
                Objects.equals(getVenue(), message.getVenue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), getDate(), getId(), getEntities(), getFrom(), getForwardedFrom(), getRepliedTo(), getForwardedFromChat(), getAudio(), getDocument(), getAnimation(), getGame(), getPhoto(), getSticker(), getVideo(), getVoice(), getVideo_note(), getCaption(), getContact(), getLocation(), getVenue());
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

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
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

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public VideoNote getVideo_note() {
        return video_note;
    }

    public void setVideo_note(VideoNote video_note) {
        this.video_note = video_note;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
