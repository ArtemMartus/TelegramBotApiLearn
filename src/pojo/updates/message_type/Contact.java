package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Contact implements Serializable {
    /*
    Done

    phone_number 	String 	Contact's phone number
first_name 	String 	Contact's first name
last_name 	String 	Optional. Contact's last name
user_id 	Integer 	Optional. Contact's user identifier in Telegram
vcard 	String 	Optional. Additional data about the contact in the form of a vCard
     */

    private final static long serialVersionUID = -544977078038178975L;
    @SerializedName("phone_number")
    @Expose
    private String phone_number;
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("user_id")
    @Expose
    private Long user_id;
    @SerializedName("vcard")
    @Expose
    private String vcard;

    public Contact(String phone_number, String first_name, String last_name, Long user_id, String vcard) {
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_id = user_id;
        this.vcard = vcard;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone_number='" + phone_number + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", user_id=" + user_id +
                ", vcard='" + vcard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return getPhone_number().equals(contact.getPhone_number()) &&
                getFirst_name().equals(contact.getFirst_name()) &&
                Objects.equals(getLast_name(), contact.getLast_name()) &&
                getUser_id().equals(contact.getUser_id()) &&
                Objects.equals(getVcard(), contact.getVcard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhone_number(), getFirst_name(), getLast_name(), getUser_id(), getVcard());
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getVcard() {
        return vcard;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard;
    }
}
