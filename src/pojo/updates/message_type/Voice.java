package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Voice implements Serializable {
    private final static long serialVersionUID = -3546589386684418568L;
    /*
    Done

    file_id 	String 	Unique identifier for this file
    duration 	Integer 	Duration of the audio in seconds as defined by sender
    mime_type 	String 	Optional. MIME type of the file as defined by sender
    file_size 	Integer 	Optional. File size
     */
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;

    /**
     * No args constructor for use in serialization
     */
    public Voice() {
    }

    /**
     * @param fileSize
     * @param fileId
     * @param duration
     * @param mimeType
     */
    public Voice(Integer duration, String mimeType, String fileId, Integer fileSize) {
        super();
        this.duration = duration;
        this.mimeType = mimeType;
        this.fileId = fileId;
        this.fileSize = fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voice)) return false;
        Voice voice = (Voice) o;
        return getFileId().equals(voice.getFileId()) &&
                getDuration().equals(voice.getDuration()) &&
                Objects.equals(getMimeType(), voice.getMimeType()) &&
                Objects.equals(getFileSize(), voice.getFileSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFileId(), getDuration(), getMimeType(), getFileSize());
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
        return new ToStringBuilder(this).append("duration", duration).append("mimeType", mimeType).append("fileId", fileId).append("fileSize", fileSize).toString();
    }

}