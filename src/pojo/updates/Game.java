package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Game implements Serializable {
    /*

    Done

title 	String 	Title of the game
description 	String 	Description of the game
photo 	Array of PhotoSize 	Photo that will be displayed in the game message in chats.
text 	String 	Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore, or manually edited using editMessageText. 0-4096 characters.
text_entities 	Array of MessageEntity 	Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
animation 	Animation 	Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
     */

    private final static long serialVersionUID = -5597723503666975L;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("photo")
    @Expose
    private PhotoSize photo;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("text_entities")
    @Expose
    private List<MessageEntity> text_entities;
    @SerializedName("animation")
    @Expose
    private Animation animation;

    public Game(String title, String description, PhotoSize photo, String text, List<MessageEntity> text_entities, Animation animation) {
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.text = text;
        this.text_entities = text_entities;
        this.animation = animation;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return getTitle().equals(game.getTitle()) &&
                getDescription().equals(game.getDescription()) &&
                getPhoto().equals(game.getPhoto()) &&
                Objects.equals(getText(), game.getText()) &&
                Objects.equals(getText_entities(), game.getText_entities()) &&
                Objects.equals(getAnimation(), game.getAnimation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getPhoto(), getText(), getText_entities(), getAnimation());
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + photo +
                ", text='" + text + '\'' +
                ", text_entities=" + text_entities +
                ", animation=" + animation +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PhotoSize getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoSize photo) {
        this.photo = photo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getText_entities() {
        return text_entities;
    }

    public void setText_entities(List<MessageEntity> text_entities) {
        this.text_entities = text_entities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
