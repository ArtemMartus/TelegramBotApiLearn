package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class ShippingAddress implements Serializable {
    /*
    Done

    country_code 	String 	ISO 3166-1 alpha-2 country code
state 	String 	State, if applicable
city 	String 	City
street_line1 	String 	First line for the address
street_line2 	String 	Second line for the address
post_code 	String 	Address post code
     */
    private final static long serialVersionUID = -335204277790145L;
    @SerializedName("country_code")
    @Expose
    private String country_code;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("street_line1")
    @Expose
    private String street_line1;
    @SerializedName("street_line2")
    @Expose
    private String street_line2;
    @SerializedName("post_code")
    @Expose
    private String post_code;

    public ShippingAddress(String country_code, String state, String city, String street_line1, String street_line2, String post_code) {
        this.country_code = country_code;
        this.state = state;
        this.city = city;
        this.street_line1 = street_line1;
        this.street_line2 = street_line2;
        this.post_code = post_code;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "country_code='" + country_code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street_line1='" + street_line1 + '\'' +
                ", street_line2='" + street_line2 + '\'' +
                ", post_code='" + post_code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShippingAddress)) return false;
        ShippingAddress that = (ShippingAddress) o;
        return getCountry_code().equals(that.getCountry_code()) &&
                getState().equals(that.getState()) &&
                getCity().equals(that.getCity()) &&
                getStreet_line1().equals(that.getStreet_line1()) &&
                getStreet_line2().equals(that.getStreet_line2()) &&
                getPost_code().equals(that.getPost_code());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry_code(), getState(), getCity(), getStreet_line1(), getStreet_line2(), getPost_code());
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet_line1() {
        return street_line1;
    }

    public void setStreet_line1(String street_line1) {
        this.street_line1 = street_line1;
    }

    public String getStreet_line2() {
        return street_line2;
    }

    public void setStreet_line2(String street_line2) {
        this.street_line2 = street_line2;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }
}
