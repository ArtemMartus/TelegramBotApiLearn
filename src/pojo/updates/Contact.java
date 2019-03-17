package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contact implements Serializable {
    /*
    phone_number 	String 	Contact's phone number
first_name 	String 	Contact's first name
last_name 	String 	Optional. Contact's last name
user_id 	Integer 	Optional. Contact's user identifier in Telegram
vcard 	String 	Optional. Additional data about the contact in the form of a vCard
     */

    private final static long serialVersionUID = -5529777651038170875L;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("is_bot")
    @Expose
    private Boolean isBot;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("language_code")
    @Expose
    private String languageCode;
}
