package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class PassportFile implements Serializable {
    /*
    Done


    file_id 	String 	Unique identifier for this file
file_size 	Integer 	File size
file_date 	Integer 	Unix time when the file was uploaded
     */
    private final static long serialVersionUID = -44520124898000145L;
    @SerializedName("file_id")
    @Expose
    private String file_id;
    @SerializedName("file_size")
    @Expose
    private Long file_size;
    @SerializedName("file_date")
    @Expose
    private Long file_date;

    public PassportFile(String file_id, Long file_size, Long file_date) {
        this.file_id = file_id;
        this.file_size = file_size;
        this.file_date = file_date;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "PassportFile{" +
                "file_id='" + file_id + '\'' +
                ", file_size=" + file_size +
                ", file_date=" + file_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassportFile)) return false;
        PassportFile that = (PassportFile) o;
        return getFile_id().equals(that.getFile_id()) &&
                getFile_size().equals(that.getFile_size()) &&
                getFile_date().equals(that.getFile_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFile_id(), getFile_size(), getFile_date());
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public Long getFile_size() {
        return file_size;
    }

    public void setFile_size(Long file_size) {
        this.file_size = file_size;
    }

    public Long getFile_date() {
        return file_date;
    }

    public void setFile_date(Long file_date) {
        this.file_date = file_date;
    }
}
