package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class ChatPhoto implements Serializable {

    /*
    Done

    small_file_id 	String 	Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download.
big_file_id 	String 	Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    private final static long serialVersionUID = -514857625907700572L;
    @SerializedName("small_file_id")
    @Expose
    private String small_file_id;
    @SerializedName("big_file_id")
    @Expose
    private String big_file_id;

    public ChatPhoto(String small_file_id, String big_file_id) {
        this.small_file_id = small_file_id;
        this.big_file_id = big_file_id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "ChatPhoto{" +
                "small_file_id='" + small_file_id + '\'' +
                ", big_file_id='" + big_file_id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatPhoto)) return false;
        ChatPhoto chatPhoto = (ChatPhoto) o;
        return getSmall_file_id().equals(chatPhoto.getSmall_file_id()) &&
                getBig_file_id().equals(chatPhoto.getBig_file_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSmall_file_id(), getBig_file_id());
    }

    public String getSmall_file_id() {
        return small_file_id;
    }

    public void setSmall_file_id(String small_file_id) {
        this.small_file_id = small_file_id;
    }

    public String getBig_file_id() {
        return big_file_id;
    }

    public void setBig_file_id(String big_file_id) {
        this.big_file_id = big_file_id;
    }
}
