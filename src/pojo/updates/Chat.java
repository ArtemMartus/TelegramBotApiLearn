package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import pojo.updates.message_type.ChatPhoto;

import java.io.Serializable;

public class Chat implements Serializable {
    /*
    Done

    id 	Integer 	Unique identifier for this chat. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
    type 	String 	Type of chat, can be either “private”, “group”, “supergroup” or “channel”
    title 	String 	Optional. Title, for supergroups, channels and group chats
    username 	String 	Optional. Username, for private chats, supergroups and channels if available
    first_name 	String 	Optional. First name of the other party in a private chat
    last_name 	String 	Optional. Last name of the other party in a private chat
    all_members_are_administrators 	Boolean 	Optional. True if a group has ‘All Members Are Admins’ enabled.
    photo 	ChatPhoto 	Optional. Chat photo. Returned only in getChat.
    description 	String 	Optional. Description, for supergroups and channel chats. Returned only in getChat.
    invite_link 	String 	Optional. Chat invite link, for supergroups and channel chats. Each administrator in a chat generates their own invite links, so the bot must first generate the link using exportChatInviteLink. Returned only in getChat.
    pinned_message 	Message 	Optional. Pinned message, for supergroups and channel chats. Returned only in getChat.
    sticker_set_name 	String 	Optional. For supergroups, name of group sticker set. Returned only in getChat.
    can_set_sticker_set 	Boolean 	Optional. True, if the bot can change the group sticker set. Returned only in getChat.
     */
    private final static long serialVersionUID = 4026320423182010145L;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("all_members_are_administrators")
    @Expose
    private Boolean all_members_are_administrators;
    @SerializedName("photo")
    @Expose
    private ChatPhoto photo;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("invite_link")
    @Expose
    private String invite_link;
    @SerializedName("pinned_message")
    @Expose
    private Message pinned_message;
    @SerializedName("sticker_set_name")
    @Expose
    private String sticker_set_name;
    @SerializedName("can_set_sticker_set")
    @Expose
    private Boolean can_set_sticker_set;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * No args constructor for use in serialization
     */


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getAll_members_are_administrators() {
        return all_members_are_administrators;
    }

    public void setAll_members_are_administrators(Boolean all_members_are_administrators) {
        this.all_members_are_administrators = all_members_are_administrators;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(ChatPhoto photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(String invite_link) {
        this.invite_link = invite_link;
    }

    public Message getPinned_message() {
        return pinned_message;
    }

    public void setPinned_message(Message pinned_message) {
        this.pinned_message = pinned_message;
    }

    public String getSticker_set_name() {
        return sticker_set_name;
    }

    public void setSticker_set_name(String sticker_set_name) {
        this.sticker_set_name = sticker_set_name;
    }

    public Boolean getCan_set_sticker_set() {
        return can_set_sticker_set;
    }

    public void setCan_set_sticker_set(Boolean can_set_sticker_set) {
        this.can_set_sticker_set = can_set_sticker_set;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", all_members_are_administrators=" + all_members_are_administrators +
                ", photo=" + photo +
                ", description='" + description + '\'' +
                ", invite_link='" + invite_link + '\'' +
                ", pinned_message=" + pinned_message +
                ", sticker_set_name='" + sticker_set_name + '\'' +
                ", can_set_sticker_set=" + can_set_sticker_set +
                '}';
    }

    public Chat(Long id, String type, String title, String username, String firstName, String lastName, Boolean all_members_are_administrators, ChatPhoto photo, String description, String invite_link, Message pinned_message, String sticker_set_name, Boolean can_set_sticker_set) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.all_members_are_administrators = all_members_are_administrators;
        this.photo = photo;
        this.description = description;
        this.invite_link = invite_link;
        this.pinned_message = pinned_message;
        this.sticker_set_name = sticker_set_name;
        this.can_set_sticker_set = can_set_sticker_set;
    }
}