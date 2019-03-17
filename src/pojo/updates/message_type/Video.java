package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Video implements Serializable {
    private final static long serialVersionUID = 801223434469944357L;
    /*
    Done

file_id 	String 	Unique identifier for this file
width 	Integer 	Video width as defined by sender
height 	Integer 	Video height as defined by sender
duration 	Integer 	Duration of the video in seconds as defined by sender
thumb 	PhotoSize 	Optional. Video thumbnail
mime_type 	String 	Optional. Mime type of a file as defined by sender
file_size 	Integer 	Optional. File size
     */
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("thumb")
    @Expose
    private PhotoSize thumb;
    @SerializedName("mime_type")
    @Expose
    private String mime_type;
    @SerializedName("file_size")
    @Expose
    private Integer file_size;

    public Video(String fileId, Integer width, Integer height, Integer duration, PhotoSize thumb, String mime_type, Integer file_size) {
        this.fileId = fileId;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumb = thumb;
        this.mime_type = mime_type;
        this.file_size = file_size;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Video{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", mime_type='" + mime_type + '\'' +
                ", file_size=" + file_size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return getFileId().equals(video.getFileId()) &&
                getWidth().equals(video.getWidth()) &&
                getHeight().equals(video.getHeight()) &&
                getDuration().equals(video.getDuration()) &&
                Objects.equals(getThumb(), video.getThumb()) &&
                Objects.equals(getMime_type(), video.getMime_type()) &&
                Objects.equals(getFile_size(), video.getFile_size());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFileId(), getWidth(), getHeight(), getDuration(), getThumb(), getMime_type(), getFile_size());
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public Integer getFile_size() {
        return file_size;
    }

    public void setFile_size(Integer file_size) {
        this.file_size = file_size;
    }
}
