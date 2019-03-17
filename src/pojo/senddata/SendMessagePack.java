package pojo.senddata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

public class SendMessagePack implements Serializable {
    /*
chat_id 	Integer or String 	Yes 	Unique identifier for the target chat or username of the target channel (in the format @channelusername)
text 	String 	Yes 	Text of the message to be sent
parse_mode 	String 	Optional 	Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message.
disable_web_page_preview 	Boolean 	Optional 	Disables link previews for links in this message
disable_notification 	Boolean 	Optional 	Sends the message silently. Users will receive a notification with no sound.
reply_to_message_id 	Integer 	Optional 	If the message is a reply, ID of the original message
reply_markup 	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
                Optional 	Additional interface options. A JSON-serialized object for an inline keyboard,
                custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    private final static long serialVersionUID = 161297593294899895L;
    @SerializedName("chat_id")
    @Expose
    private Long chat_id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("reply_to_message_id")
    @Expose
    private Long reply_to_message_id;

    public SendMessagePack(Long chat_id, String text, Long reply_to_message_id) {
        this.chat_id = chat_id;
        this.text = text;
        this.reply_to_message_id = reply_to_message_id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "chat_id=" + chat_id +
                "&text='" + text + '\'' +
                "&reply_to_message_id=" + reply_to_message_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SendMessagePack)) return false;
        SendMessagePack that = (SendMessagePack) o;
        return getChat_id().equals(that.getChat_id()) &&
                getText().equals(that.getText()) &&
                Objects.equals(getReply_to_message_id(), that.getReply_to_message_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChat_id(), getText(), getReply_to_message_id());
    }

    public Long getChat_id() {
        return chat_id;
    }

    public void setChat_id(Long chat_id) {
        this.chat_id = chat_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getReply_to_message_id() {
        return reply_to_message_id;
    }

    public void setReply_to_message_id(Long reply_to_message_id) {
        this.reply_to_message_id = reply_to_message_id;
    }
}
