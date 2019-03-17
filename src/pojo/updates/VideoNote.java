package pojo.updates;

import java.io.Serializable;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class VideoNote implements Serializable {
    private final static long serialVersionUID = -808550735677070624L;
    /*
    Done

    file_id 	String 	Unique identifier for this file
    length 	Integer 	Video width and height (diameter of the video message) as defined by sender
    duration 	Integer 	Duration of the video in seconds as defined by sender
    thumb 	PhotoSize 	Optional. Video thumbnail
    file_size 	Integer 	Optional. File size
     */
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("thumb")
    @Expose
    private PhotoSize thumb;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;

    /**
     * No args constructor for use in serialization
     */
    public VideoNote(String fileId, Integer length, Integer duration, PhotoSize thumb, Integer fileSize) {
        this.fileId = fileId;
        this.length = length;
        this.duration = duration;
        this.thumb = thumb;
        this.fileSize = fileSize;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "VideoNote{" +
                "fileId='" + fileId + '\'' +
                ", length=" + length +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", fileSize=" + fileSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoNote)) return false;
        VideoNote videoNote = (VideoNote) o;
        return getFileId().equals(videoNote.getFileId()) &&
                getLength().equals(videoNote.getLength()) &&
                getDuration().equals(videoNote.getDuration()) &&
                Objects.equals(getThumb(), videoNote.getThumb()) &&
                Objects.equals(getFileSize(), videoNote.getFileSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFileId(), getLength(), getDuration(), getThumb(), getFileSize());
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}