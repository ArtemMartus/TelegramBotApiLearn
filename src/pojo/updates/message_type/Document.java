package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pojo.updates.Thumb;

import java.io.Serializable;

public class Document implements Serializable {
    private final static long serialVersionUID = 4002195550769258149L;
    /*
    file_id 	String 	Unique file identifier
    thumb 	PhotoSize 	Optional. Document thumbnail as defined by sender
    file_name 	String 	Optional. Original filename as defined by sender
    mime_type 	String 	Optional. MIME type of the file as defined by sender
    file_size 	Integer 	Optional. File size
     */
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;
    @SerializedName("file_name")
    @Expose
    private String fileName;

    /**
     * No args constructor for use in serialization
     */
    public Document() {
    }

    /**
     * @param fileSize
     * @param fileId
     * @param fileName
     * @param thumb
     * @param mimeType
     */
    public Document(String mimeType, Thumb thumb, String fileId, Integer fileSize, String fileName) {
        super();
        this.mimeType = mimeType;
        this.thumb = thumb;
        this.fileId = fileId;
        this.fileSize = fileSize;
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mimeType", mimeType).append("thumb", thumb).append("fileId", fileId).append("fileSize", fileSize).append("fileName", fileName).toString();
    }

}