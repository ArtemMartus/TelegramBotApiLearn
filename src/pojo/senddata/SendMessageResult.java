package pojo.senddata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import pojo.updates.Message;

import java.io.Serializable;

public class SendMessageResult implements Serializable {
    private final static long serialVersionUID = 5974333387323222798L;
    @SerializedName("ok")
    @Expose
    private Boolean ok;
    @SerializedName("result")
    @Expose
    private Message result;
    @SerializedName("error_code")
    @Expose
    private Long error_code;
    @SerializedName("description")
    @Expose
    private String description;

    public SendMessageResult(Boolean ok, Message result, Long error_code, String description) {
        this.ok = ok;
        this.result = result;
        this.error_code = error_code;
        this.description = description;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Message getResult() {
        return result;
    }

    public void setResult(Message result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SendMessageResult{" +
                "ok=" + ok +
                ", result=" + result +
                ", error_code='" + error_code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Long getError_code() {
        return error_code;
    }

    public void setError_code(Long error_code) {
        this.error_code = error_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
