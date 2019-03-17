package pojo.updates;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User implements Serializable {

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

    /**
     * No args constructor for use in serialization
     */
    public User() {
    }

    /**
     * @param id
     * @param lastName
     * @param languageCode
     * @param username
     * @param isBot
     * @param firstName
     */
    public User(Long id, Boolean isBot, String firstName, String lastName, String username, String languageCode) {
        this.id = id;
        this.isBot = isBot;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.languageCode = languageCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIsBot() {
        return isBot;
    }

    public void setIsBot(boolean isBot) {
        this.isBot = isBot;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Boolean getBot() {
        return isBot;
    }

    public void setBot(Boolean bot) {
        isBot = bot;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("isBot", isBot).append("firstName", firstName).append("lastName", lastName).append("username", username).append("languageCode", languageCode).toString();
    }

}