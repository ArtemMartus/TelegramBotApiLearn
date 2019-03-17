package pojo.updates;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Photo implements Serializable {

    private final static long serialVersionUID = 8012917534467544357L;
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_size")
    @Expose
    private int fileSize;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;

    /**
     * No args constructor for use in serialization
     */
    public Photo() {
    }

    /**
     * @param fileSize
     * @param fileId
     * @param height
     * @param width
     */
    public Photo(String fileId, int fileSize, int width, int height) {
        super();
        this.fileId = fileId;
        this.fileSize = fileSize;
        this.width = width;
        this.height = height;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fileId", fileId).append("fileSize", fileSize).append("width", width).append("height", height).toString();
    }

}