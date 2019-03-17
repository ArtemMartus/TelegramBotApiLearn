package pojo.updates;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Animation implements Serializable {
    private final static long serialVersionUID = 3213178223686652395L;
    /*
    Done

    file_id 	String 	Unique file identifier
    width 	Integer 	Video width as defined by sender
    height 	Integer 	Video height as defined by sender
    duration 	Integer 	Duration of the video in seconds as defined by sender
    thumb 	PhotoSize 	Optional. Animation thumbnail as defined by sender
    file_name 	String 	Optional. Original animation filename as defined by sender
    mime_type 	String 	Optional. MIME type of the file as defined by sender
    file_size 	Integer 	Optional. File size
     */
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_name")
    @Expose
    private String file_name;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;

    /**
     * No args constructor for use in serialization
     */
    public Animation() {
    }

    public Animation(String mimeType, Integer duration, Integer width, Integer height, Thumb thumb, String fileId, String file_name, Integer fileSize) {
        this.mimeType = mimeType;
        this.duration = duration;
        this.width = width;
        this.height = height;
        this.thumb = thumb;
        this.fileId = fileId;
        this.file_name = file_name;
        this.fileSize = fileSize;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "mimeType='" + mimeType + '\'' +
                ", duration=" + duration +
                ", width=" + width +
                ", height=" + height +
                ", thumb=" + thumb +
                ", fileId='" + fileId + '\'' +
                ", file_name='" + file_name + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

}