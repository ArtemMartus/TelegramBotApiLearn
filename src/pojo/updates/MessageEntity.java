package pojo.updates;

import java.io.Serializable;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageEntity implements Serializable {
    private final static long serialVersionUID = -2084008542999613122L;
    /*
    Done

    type 	String 	Type of the entity. Can be mention (@username), hashtag, cashtag, bot_command, url, email, phone_number, bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block), text_link (for clickable text URLs), text_mention (for users without usernames)
    offset 	Integer 	Offset in UTF-16 code units to the start of the entity
    length 	Integer 	Length of the entity in UTF-16 code units
    url 	String 	Optional. For “text_link” only, url that will be opened after user taps on the text
    user 	User 	Optional. For “text_mention” only, the mentioned user
     */
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("user")
    @Expose
    private User user;

    /**
     * No args constructor for use in serialization
     */
    public MessageEntity() {
    }

    public MessageEntity(Integer offset, Integer length, String type, String url, User user) {
        this.offset = offset;
        this.length = length;
        this.type = type;
        this.url = url;
        this.user = user;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return getOffset().equals(that.getOffset()) &&
                getLength().equals(that.getLength()) &&
                getType().equals(that.getType()) &&
                Objects.equals(getUrl(), that.getUrl()) &&
                Objects.equals(getUser(), that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOffset(), getLength(), getType(), getUrl(), getUser());
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "offset=" + offset +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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

}