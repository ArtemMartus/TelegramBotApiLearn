package pojo.updates;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sticker implements Serializable {
    private final static long serialVersionUID = 7174164000068710591L;
    /*
    file_id 	String 	Unique identifier for this file
    width 	Integer 	Sticker width
    height 	Integer 	Sticker height
    thumb 	PhotoSize 	Optional. Sticker thumbnail in the .webp or .jpg format
    emoji 	String 	Optional. Emoji associated with the sticker
    set_name 	String 	Optional. Name of the sticker set to which the sticker belongs
    mask_position 	MaskPosition 	Optional. For mask stickers, the position where the mask should be placed
    file_size 	Integer 	Optional. File size
     */
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("emoji")
    @Expose
    private String emoji;
    @SerializedName("set_name")
    @Expose
    private String setName;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_size")
    @Expose
    private Integer fileSize;
    @SerializedName("mask_position")
    @Expose
    private MaskPosition mask_position;

    /**
     * No args constructor for use in serialization
     */
    public Sticker() {
    }

    /**
     * @param fileSize
     * @param fileId
     * @param height
     * @param width
     * @param emoji
     * @param setName
     * @param thumb
     */
    public Sticker(Integer width, Integer height, String emoji, String setName, Thumb thumb, String fileId, Integer fileSize) {
        super();
        this.width = width;
        this.height = height;
        this.emoji = emoji;
        this.setName = setName;
        this.thumb = thumb;
        this.fileId = fileId;
        this.fileSize = fileSize;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("width", width).append("height", height).append("emoji", emoji).append("setName", setName).append("thumb", thumb).append("fileId", fileId).append("fileSize", fileSize).toString();
    }

}