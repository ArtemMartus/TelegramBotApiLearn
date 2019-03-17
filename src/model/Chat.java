package model;

import pojo.updates.message_type.ChatPhoto;

import java.io.Serializable;

public class Chat implements Serializable {
    private final static long serialVersionUID = -6516948573170655920L;
    private String type;
    private String username;
    private Long id;
    private String title;

    private String firstName;
    private String lastName;
    private Boolean all_members_are_administrators;
    private ChatPhoto photo;
    private String description;
    private String invite_link;
    private Message pinned_message;
    private String sticker_set_name;
    private Boolean can_set_sticker_set;



    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            Chat chat = (Chat) obj;
            return chat.id.equals(this.id);
        }
        return super.equals(obj);
    }

    public Chat(pojo.updates.Chat chat) {
        this.type = chat.getType();
        this.username = chat.getUsername();
        this.id = chat.getId();
        this.title = chat.getTitle();
        this.firstName = chat.getFirstName();
        this.lastName = chat.getLastName();
        this.all_members_are_administrators = chat.getAll_members_are_administrators();
        this.photo = chat.getPhoto();
        this.description = chat.getDescription();
        this.invite_link = chat.getInvite_link();
        if (chat.getPinned_message() != null)
            this.pinned_message = new Message(chat.getPinned_message());
        this.sticker_set_name = chat.getSticker_set_name();
        this.can_set_sticker_set = chat.getCan_set_sticker_set();
    }

    public Chat(String type, String username, Long id, String title, String firstName, String lastName, Boolean all_members_are_administrators, ChatPhoto photo, String description, String invite_link, Message pinned_message, String sticker_set_name, Boolean can_set_sticker_set) {
        this.type = type;
        this.username = username;
        this.id = id;
        this.title = title;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
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
}
