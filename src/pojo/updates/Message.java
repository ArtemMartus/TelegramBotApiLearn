package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import pojo.updates.message_type.*;
import pojo.updates.payments.Invoice;
import pojo.updates.payments.PassportData;
import pojo.updates.payments.SuccessfulPayment;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Message implements Serializable {
    /*

    Done

     */
    private final static long serialVersionUID = -5244698191495365876L;
    @SerializedName("pinned_message")
    @Expose
    private Message pinned_message;
    @SerializedName("edit_date")
    @Expose
    private Long edit_date;
    @SerializedName("media_group_id")
    @Expose
    private String media_group_id;
    @SerializedName("author_signature")
    @Expose
    private String author_signature;
    @SerializedName("invoice")
    @Expose
    private Invoice invoice;
    @SerializedName("successful_payment")
    @Expose
    private SuccessfulPayment successful_payment;
    @SerializedName("connected_website")
    @Expose
    private String connected_website;
    @SerializedName("passport_data")
    @Expose
    private PassportData passport_data;
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
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("new_chat_title")
    @Expose
    private String new_chat_title;
    @SerializedName("new_chat_photo")
    @Expose
    private List<PhotoSize> new_chat_photo;
    @SerializedName("delete_chat_photo")
    @Expose
    private Boolean delete_chat_photo;
    @SerializedName("group_chat_created")
    @Expose
    private Boolean group_chat_created;
    @SerializedName("supergroup_chat_created")
    @Expose
    private Boolean supergroup_chat_created;
    @SerializedName("channel_chat_created")
    @Expose
    private Boolean channel_chat_created;
    @SerializedName("migrate_to_chat_id")
    @Expose
    private Long migrate_to_chat_id;
    @SerializedName("migrate_from_chat_id")
    @Expose
    private Long migrate_from_chat_id;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("new_chat_members")
    @Expose
    private List<User> new_chat_members = null;
    @SerializedName("left_chat_member")
    @Expose
    private User left_chat_member;
    @SerializedName("entities")
    @Expose
    private List<MessageEntity> entities = null;
    @SerializedName("caption_entities")
    @Expose
    private List<MessageEntity> caption_entities = null;
    @SerializedName("reply_to_message")
    @Expose
    private Message replyToMessage;
    @SerializedName("voice")
    @Expose
    private Voice voice;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("photo")
    @Expose
    private List<PhotoSize> photo = null;
    @SerializedName("sticker")
    @Expose
    private Sticker sticker;
    @SerializedName("animation")
    @Expose
    private Animation animation;
    @SerializedName("game")
    @Expose
    private Game game;
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

    public Message(Message pinned_message, Long edit_date, String media_group_id, String author_signature, Invoice invoice, SuccessfulPayment successful_payment, String connected_website, PassportData passport_data, Long messageId, User from, Chat chat, Long date, String text, String caption, Contact contact, String new_chat_title, List<PhotoSize> new_chat_photo, Boolean delete_chat_photo, Boolean group_chat_created, Boolean supergroup_chat_created, Boolean channel_chat_created, Long migrate_to_chat_id, Long migrate_from_chat_id, Location location, Venue venue, List<User> new_chat_members, User left_chat_member, List<MessageEntity> entities, List<MessageEntity> caption_entities, Message replyToMessage, Voice voice, Video video, List<PhotoSize> photo, Sticker sticker, Animation animation, Game game, Document document, User forwardFrom, Long forwardDate, Chat forwardFromChat, Long forwardFromMessageId, Audio audio, VideoNote videoNote) {
        this.pinned_message = pinned_message;
        this.edit_date = edit_date;
        this.media_group_id = media_group_id;
        this.author_signature = author_signature;
        this.invoice = invoice;
        this.successful_payment = successful_payment;
        this.connected_website = connected_website;
        this.passport_data = passport_data;
        this.messageId = messageId;
        this.from = from;
        this.chat = chat;
        this.date = date;
        this.text = text;
        this.caption = caption;
        this.contact = contact;
        this.new_chat_title = new_chat_title;
        this.new_chat_photo = new_chat_photo;
        this.delete_chat_photo = delete_chat_photo;
        this.group_chat_created = group_chat_created;
        this.supergroup_chat_created = supergroup_chat_created;
        this.channel_chat_created = channel_chat_created;
        this.migrate_to_chat_id = migrate_to_chat_id;
        this.migrate_from_chat_id = migrate_from_chat_id;
        this.location = location;
        this.venue = venue;
        this.new_chat_members = new_chat_members;
        this.left_chat_member = left_chat_member;
        this.entities = entities;
        this.caption_entities = caption_entities;
        this.replyToMessage = replyToMessage;
        this.voice = voice;
        this.video = video;
        this.photo = photo;
        this.sticker = sticker;
        this.animation = animation;
        this.game = game;
        this.document = document;
        this.forwardFrom = forwardFrom;
        this.forwardDate = forwardDate;
        this.forwardFromChat = forwardFromChat;
        this.forwardFromMessageId = forwardFromMessageId;
        this.audio = audio;
        this.videoNote = videoNote;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getPinned_message(), message.getPinned_message()) &&
                Objects.equals(getEdit_date(), message.getEdit_date()) &&
                Objects.equals(getMedia_group_id(), message.getMedia_group_id()) &&
                Objects.equals(getAuthor_signature(), message.getAuthor_signature()) &&
                Objects.equals(getInvoice(), message.getInvoice()) &&
                Objects.equals(getSuccessful_payment(), message.getSuccessful_payment()) &&
                Objects.equals(getConnected_website(), message.getConnected_website()) &&
                Objects.equals(getPassport_data(), message.getPassport_data()) &&
                getMessageId().equals(message.getMessageId()) &&
                getFrom().equals(message.getFrom()) &&
                getChat().equals(message.getChat()) &&
                getDate().equals(message.getDate()) &&
                Objects.equals(getText(), message.getText()) &&
                Objects.equals(getCaption(), message.getCaption()) &&
                Objects.equals(getContact(), message.getContact()) &&
                Objects.equals(getNew_chat_title(), message.getNew_chat_title()) &&
                Objects.equals(getNew_chat_photo(), message.getNew_chat_photo()) &&
                Objects.equals(getDelete_chat_photo(), message.getDelete_chat_photo()) &&
                Objects.equals(getGroup_chat_created(), message.getGroup_chat_created()) &&
                Objects.equals(getSupergroup_chat_created(), message.getSupergroup_chat_created()) &&
                Objects.equals(getChannel_chat_created(), message.getChannel_chat_created()) &&
                Objects.equals(getMigrate_to_chat_id(), message.getMigrate_to_chat_id()) &&
                Objects.equals(getMigrate_from_chat_id(), message.getMigrate_from_chat_id()) &&
                Objects.equals(getLocation(), message.getLocation()) &&
                Objects.equals(getVenue(), message.getVenue()) &&
                Objects.equals(getNew_chat_members(), message.getNew_chat_members()) &&
                Objects.equals(getLeft_chat_member(), message.getLeft_chat_member()) &&
                Objects.equals(getEntities(), message.getEntities()) &&
                Objects.equals(getCaption_entities(), message.getCaption_entities()) &&
                Objects.equals(getReplyToMessage(), message.getReplyToMessage()) &&
                Objects.equals(getVoice(), message.getVoice()) &&
                Objects.equals(getVideo(), message.getVideo()) &&
                Objects.equals(getPhoto(), message.getPhoto()) &&
                Objects.equals(getSticker(), message.getSticker()) &&
                Objects.equals(getAnimation(), message.getAnimation()) &&
                Objects.equals(getGame(), message.getGame()) &&
                Objects.equals(getDocument(), message.getDocument()) &&
                Objects.equals(getForwardFrom(), message.getForwardFrom()) &&
                Objects.equals(getForwardDate(), message.getForwardDate()) &&
                Objects.equals(getForwardFromChat(), message.getForwardFromChat()) &&
                Objects.equals(getForwardFromMessageId(), message.getForwardFromMessageId()) &&
                Objects.equals(getAudio(), message.getAudio()) &&
                Objects.equals(getVideoNote(), message.getVideoNote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPinned_message(), getEdit_date(), getMedia_group_id(), getAuthor_signature(), getInvoice(), getSuccessful_payment(), getConnected_website(), getPassport_data(), getMessageId(), getFrom(), getChat(), getDate(), getText(), getCaption(), getContact(), getNew_chat_title(), getNew_chat_photo(), getDelete_chat_photo(), getGroup_chat_created(), getSupergroup_chat_created(), getChannel_chat_created(), getMigrate_to_chat_id(), getMigrate_from_chat_id(), getLocation(), getVenue(), getNew_chat_members(), getLeft_chat_member(), getEntities(), getCaption_entities(), getReplyToMessage(), getVoice(), getVideo(), getPhoto(), getSticker(), getAnimation(), getGame(), getDocument(), getForwardFrom(), getForwardDate(), getForwardFromChat(), getForwardFromMessageId(), getAudio(), getVideoNote());
    }

    @Override
    public String toString() {
        return "Message{" +
                "pinned_message=" + pinned_message +
                ", edit_date=" + edit_date +
                ", media_group_id='" + media_group_id + '\'' +
                ", author_signature='" + author_signature + '\'' +
                ", invoice=" + invoice +
                ", successful_payment=" + successful_payment +
                ", connected_website='" + connected_website + '\'' +
                ", passport_data=" + passport_data +
                ", messageId=" + messageId +
                ", from=" + from +
                ", chat=" + chat +
                ", date=" + date +
                ", text='" + text + '\'' +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", new_chat_title='" + new_chat_title + '\'' +
                ", new_chat_photo=" + new_chat_photo +
                ", delete_chat_photo=" + delete_chat_photo +
                ", group_chat_created=" + group_chat_created +
                ", supergroup_chat_created=" + supergroup_chat_created +
                ", channel_chat_created=" + channel_chat_created +
                ", migrate_to_chat_id=" + migrate_to_chat_id +
                ", migrate_from_chat_id=" + migrate_from_chat_id +
                ", location=" + location +
                ", venue=" + venue +
                ", new_chat_members=" + new_chat_members +
                ", left_chat_member=" + left_chat_member +
                ", entities=" + entities +
                ", caption_entities=" + caption_entities +
                ", replyToMessage=" + replyToMessage +
                ", voice=" + voice +
                ", video=" + video +
                ", photo=" + photo +
                ", sticker=" + sticker +
                ", animation=" + animation +
                ", game=" + game +
                ", document=" + document +
                ", forwardFrom=" + forwardFrom +
                ", forwardDate=" + forwardDate +
                ", forwardFromChat=" + forwardFromChat +
                ", forwardFromMessageId=" + forwardFromMessageId +
                ", audio=" + audio +
                ", videoNote=" + videoNote +
                '}';
    }

    public Message getPinned_message() {
        return pinned_message;
    }

    public void setPinned_message(Message pinned_message) {
        this.pinned_message = pinned_message;
    }

    public Long getEdit_date() {
        return edit_date;
    }

    public void setEdit_date(Long edit_date) {
        this.edit_date = edit_date;
    }

    public String getMedia_group_id() {
        return media_group_id;
    }

    public void setMedia_group_id(String media_group_id) {
        this.media_group_id = media_group_id;
    }

    public String getAuthor_signature() {
        return author_signature;
    }

    public void setAuthor_signature(String author_signature) {
        this.author_signature = author_signature;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public SuccessfulPayment getSuccessful_payment() {
        return successful_payment;
    }

    public void setSuccessful_payment(SuccessfulPayment successful_payment) {
        this.successful_payment = successful_payment;
    }

    public String getConnected_website() {
        return connected_website;
    }

    public void setConnected_website(String connected_website) {
        this.connected_website = connected_website;
    }

    public PassportData getPassport_data() {
        return passport_data;
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

    public void setPassport_data(PassportData passport_data) {
        this.passport_data = passport_data;
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

    public String getNew_chat_title() {
        return new_chat_title;
    }

    public void setNew_chat_title(String new_chat_title) {
        this.new_chat_title = new_chat_title;
    }

    public List<PhotoSize> getNew_chat_photo() {
        return new_chat_photo;
    }

    public void setNew_chat_photo(List<PhotoSize> new_chat_photo) {
        this.new_chat_photo = new_chat_photo;
    }

    public Boolean getDelete_chat_photo() {
        return delete_chat_photo;
    }

    public void setDelete_chat_photo(Boolean delete_chat_photo) {
        this.delete_chat_photo = delete_chat_photo;
    }

    public Boolean getGroup_chat_created() {
        return group_chat_created;
    }

    public void setGroup_chat_created(Boolean group_chat_created) {
        this.group_chat_created = group_chat_created;
    }

    public Boolean getSupergroup_chat_created() {
        return supergroup_chat_created;
    }

    public void setSupergroup_chat_created(Boolean supergroup_chat_created) {
        this.supergroup_chat_created = supergroup_chat_created;
    }

    public Boolean getChannel_chat_created() {
        return channel_chat_created;
    }

    public void setChannel_chat_created(Boolean channel_chat_created) {
        this.channel_chat_created = channel_chat_created;
    }

    public Long getMigrate_to_chat_id() {
        return migrate_to_chat_id;
    }

    public void setMigrate_to_chat_id(Long migrate_to_chat_id) {
        this.migrate_to_chat_id = migrate_to_chat_id;
    }

    public Long getMigrate_from_chat_id() {
        return migrate_from_chat_id;
    }

    public void setMigrate_from_chat_id(Long migrate_from_chat_id) {
        this.migrate_from_chat_id = migrate_from_chat_id;
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

    public List<User> getNew_chat_members() {
        return new_chat_members;
    }

    public void setNew_chat_members(List<User> new_chat_members) {
        this.new_chat_members = new_chat_members;
    }

    public User getLeft_chat_member() {
        return left_chat_member;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public void setLeft_chat_member(User left_chat_member) {
        this.left_chat_member = left_chat_member;
    }

    public List<MessageEntity> getCaption_entities() {
        return caption_entities;
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

    public void setCaption_entities(List<MessageEntity> caption_entities) {
        this.caption_entities = caption_entities;
    }

    public Video getVideo() {
        return video;
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

    public void setVideo(Video video) {
        this.video = video;
    }

    public Game getGame() {
        return game;
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

    public void setGame(Game game) {
        this.game = game;
    }
}