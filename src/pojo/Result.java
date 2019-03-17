package pojo;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable {

    private final static long serialVersionUID = 8176851673873442063L;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("is_bot")
    @Expose
    private boolean isBot;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("username")
    @Expose
    private String username;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", isBot=" + isBot +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}