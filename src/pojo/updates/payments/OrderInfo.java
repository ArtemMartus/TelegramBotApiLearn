package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("ALL")
public class OrderInfo implements Serializable {
    /*
    Done

    name 	String 	Optional. User name
phone_number 	String 	Optional. User's phone number
email 	String 	Optional. User email
shipping_address 	ShippingAddress 	Optional. User shipping address
     */
    private final static long serialVersionUID = -335209861239045L;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone_number")
    @Expose
    private String phone_number;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress shipping_address;

    public OrderInfo(String name, String phone_number, String email, ShippingAddress shipping_address) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.shipping_address = shipping_address;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", shipping_address=" + shipping_address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderInfo)) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return Objects.equals(getName(), orderInfo.getName()) &&
                Objects.equals(getPhone_number(), orderInfo.getPhone_number()) &&
                Objects.equals(getEmail(), orderInfo.getEmail()) &&
                Objects.equals(getShipping_address(), orderInfo.getShipping_address());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone_number(), getEmail(), getShipping_address());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShippingAddress getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(ShippingAddress shipping_address) {
        this.shipping_address = shipping_address;
    }
}
