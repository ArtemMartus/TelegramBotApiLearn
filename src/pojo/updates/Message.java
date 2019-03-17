package pojo.updates;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Message implements Serializable {

    private final static long serialVersionUID = -5244698191485368876L;
    @SerializedName("message_id")
    @Expose
    private Long messageId;
    @SerializedName("from")
    @Expose
    private User from;
    @SerializedName("chat")
    @Expose
    private Chat chat;
    @SerializedName("date")
    @Expose
    private Long date;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("entities")
    @Expose
    private List<MessageEntity> entities = null;
    @SerializedName("reply_to_message")
    @Expose
    private Message replyToMessage;
    @SerializedName("voice")
    @Expose
    private Voice voice;
    @SerializedName("photo")
    @Expose
    private List<PhotoSize> photo = null;
    @SerializedName("sticker")
    @Expose
    private Sticker sticker;
    @SerializedName("animation")
    @Expose
    private Animation animation;
    @SerializedName("document")
    @Expose
    private Document document;
    @SerializedName("forward_from")
    @Expose
    private User forwardFrom;
    @SerializedName("forward_date")
    @Expose
    private Long forwardDate;
    @SerializedName("forward_from_chat")
    @Expose
    private Chat forwardFromChat;
    @SerializedName("forward_from_message_id")
    @Expose
    private Long forwardFromMessageId;
    @SerializedName("audio")
    @Expose
    private Audio audio;
    @SerializedName("video_note")
    @Expose
    private VideoNote videoNote;

    /**
     * No args constructor for use in serialization
     */
    public Message() {
    }

    /**
     * @param text
     * @param audio
     * @param voice
     * @param animation
     * @param forwardFromChat
     * @param from
     * @param chat
     * @param date
     * @param entities
     * @param photo
     * @param forwardFromMessageId
     * @param forwardDate
     * @param document
     * @param forwardFrom
     * @param replyToMessage
     * @param sticker
     * @param videoNote
     * @param messageId
     */
    public Message(Long messageId, User from, Chat chat, Long date, String text, List<MessageEntity> entities, Message replyToMessage,
                   Voice voice, List<PhotoSize> photo, Sticker sticker, Animation animation, Document document, User forwardFrom, Long forwardDate,
                   Chat forwardFromChat, Long forwardFromMessageId, Audio audio, VideoNote videoNote) {
        super();
        this.messageId = messageId;
        this.from = from;
        this.chat = chat;
        this.date = date;
        this.text = text;
        this.entities = entities;
        this.replyToMessage = replyToMessage;
        this.voice = voice;
        this.photo = photo;
        this.sticker = sticker;
        this.animation = animation;
        this.document = document;
        this.forwardFrom = forwardFrom;
        this.forwardDate = forwardDate;
        this.forwardFromChat = forwardFromChat;
        this.forwardFromMessageId = forwardFromMessageId;
        this.audio = audio;
        this.videoNote = videoNote;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public void setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
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

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    public Long getForwardDate() {
        return forwardDate;
    }

    public void setForwardDate(Long forwardDate) {
        this.forwardDate = forwardDate;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    public Long getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public void setForwardFromMessageId(Long forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("messageId", messageId).append("from", from).append("chat", chat).append("date", date).append("text", text).append("entities", entities).append("replyToMessage", replyToMessage).append("voice", voice).append("photo", photo).append("sticker", sticker).append("animation", animation).append("document", document).append("forwardFrom", forwardFrom).append("forwardDate", forwardDate).append("forwardFromChat", forwardFromChat).append("forwardFromMessageId", forwardFromMessageId).append("audio", audio).append("videoNote", videoNote).toString();
    }

}