package model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private final static long serialVersionUID = -8835573978340503037L;
    private Boolean isBot;
    private String firstName;
    private String lastName;
    private String username;
    private Long id;
    private String langCode;
    private String userType;

    public User(Boolean isBot, String firstName, String lastName, String username, Long id, String langCode, String userType) {
        this.isBot = isBot;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = id;
        this.langCode = langCode;
        this.userType = userType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            User user = (User) obj;
            return this.id.equals(user.id);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBot, firstName, lastName, username, id, langCode, userType);
    }

    @Override
    public String toString() {
        return "User{" +
                "isBot=" + isBot +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", langCode='" + langCode + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public Boolean getBot() {
        return isBot;
    }

    public void setBot(Boolean bot) {
        isBot = bot;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
