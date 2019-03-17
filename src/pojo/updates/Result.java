package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Result implements Serializable {

    private final static long serialVersionUID = 1275236551988453019L;
    @SerializedName("update_id")
    @Expose
    private Long updateId;
    @SerializedName("message_type")
    @Expose
    private Message message;
    @SerializedName("edited_message")
    @Expose
    private Message editedMessage;

    /**
     * No args constructor for use in serialization
     */
    public Result() {
    }

    public Result(Long updateId, Message message, Message editedMessage) {
        super();
        this.updateId = updateId;
        this.message = message;
        this.editedMessage = editedMessage;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("updateId", updateId).append("message_type", message).append("editedMessage", editedMessage).toString();
    }

}