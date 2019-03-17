package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PhotoSize implements Serializable {
    private final static long serialVersionUID = -2290023503667675L;
    /*

    Done

file_id 	String 	Unique identifier for this file
width 	Integer 	Photo width
height 	Integer 	Photo height
file_size 	Integer 	Optional. File size
     */
    @SerializedName("file_id")
    @Expose
    private String file_id;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("file_size")
    @Expose
    private Integer file_size;

    public PhotoSize(String file_id, Integer width, Integer height, Integer file_size) {
        this.file_id = file_id;
        this.width = width;
        this.height = height;
        this.file_size = file_size;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "PhotoSize{" +
                "file_id='" + file_id + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", file_size=" + file_size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotoSize)) return false;
        PhotoSize photoSize = (PhotoSize) o;
        return getFile_id().equals(photoSize.getFile_id()) &&
                getWidth().equals(photoSize.getWidth()) &&
                getHeight().equals(photoSize.getHeight()) &&
                Objects.equals(getFile_size(), photoSize.getFile_size());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFile_id(), getWidth(), getHeight(), getFile_size());
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
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

    public Integer getFile_size() {
        return file_size;
    }

    public void setFile_size(Integer file_size) {
        this.file_size = file_size;
    }
}
