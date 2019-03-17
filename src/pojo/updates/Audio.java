package pojo.updates;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Audio implements Serializable {
    private final static long serialVersionUID = -5716857625967100572L;
    /*
    Done

    file_id 	String 	Unique identifier for this file
    duration 	Integer 	Duration of the audio in seconds as defined by sender
    performer 	String 	Optional. Performer of the audio as defined by sender or by audio tags
    title 	String 	Optional. Title of the audio as defined by sender or by audio tags
    mime_type 	String 	Optional. MIME type of the file as defined by sender
    file_size 	Integer 	Optional. File size
    thumb 	PhotoSize 	Optional. Thumbnail of the album cover to which the music file belongs
     */
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("performer")
    @Expose
    private String performer;
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;

    /**
     * No args constructor for use in serialization
     */
    public Audio() {
    }

    /**
     * @param fileSize
     * @param fileId
     * @param title
     * @param duration
     * @param performer
     * @param mimeType
     */
    public Audio(Integer duration, String mimeType, String title, String performer, String fileId, Integer fileSize) {
        super();
        this.duration = duration;
        this.mimeType = mimeType;
        this.title = title;
        this.performer = performer;
        this.fileId = fileId;
        this.fileSize = fileSize;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("duration", duration).append("mimeType", mimeType).append("title", title).append("performer", performer).append("fileId", fileId).append("fileSize", fileSize).toString();
    }

}