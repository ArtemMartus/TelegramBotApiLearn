package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class SuccessfulPayment implements Serializable {
    /*
    Done

    currency 	String 	Three-letter ISO 4217 currency code
total_amount 	Integer 	Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
invoice_payload 	String 	Bot specified invoice payload
shipping_option_id 	String 	Optional. Identifier of the shipping option chosen by the user
order_info 	OrderInfo 	Optional. Order info provided by the user
telegram_payment_charge_id 	String 	Telegram payment identifier
provider_payment_charge_id 	String 	Provider payment identifier
     */
    private final static long serialVersionUID = -335206353829045L;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("total_amount")
    @Expose
    private Long total_amount;
    @SerializedName("invoice_payload")
    @Expose
    private String invoice_payload;
    @SerializedName("shipping_option_id")
    @Expose
    private String shipping_option_id;
    @SerializedName("order_info")
    @Expose
    private OrderInfo order_info;
    @SerializedName("telegram_payment_charge_id")
    @Expose
    private String telegram_payment_charge_id;
    @SerializedName("provider_payment_charge_id")
    @Expose
    private String provider_payment_charge_id;

    public SuccessfulPayment(String currency, Long total_amount, String invoice_payload, String shipping_option_id, OrderInfo order_info, String telegram_payment_charge_id, String provider_payment_charge_id) {
        this.currency = currency;
        this.total_amount = total_amount;
        this.invoice_payload = invoice_payload;
        this.shipping_option_id = shipping_option_id;
        this.order_info = order_info;
        this.telegram_payment_charge_id = telegram_payment_charge_id;
        this.provider_payment_charge_id = provider_payment_charge_id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "SuccessfulPayment{" +
                "currency='" + currency + '\'' +
                ", total_amount=" + total_amount +
                ", invoice_payload='" + invoice_payload + '\'' +
                ", shipping_option_id='" + shipping_option_id + '\'' +
                ", order_info=" + order_info +
                ", telegram_payment_charge_id='" + telegram_payment_charge_id + '\'' +
                ", provider_payment_charge_id='" + provider_payment_charge_id + '\'' +
                '}';
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Long total_amount) {
        this.total_amount = total_amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuccessfulPayment)) return false;
        SuccessfulPayment that = (SuccessfulPayment) o;
        return Objects.equals(getCurrency(), that.getCurrency()) &&
                Objects.equals(getTotal_amount(), that.getTotal_amount()) &&
                Objects.equals(getInvoice_payload(), that.getInvoice_payload()) &&
                getShipping_option_id().equals(that.getShipping_option_id()) &&
                getOrder_info().equals(that.getOrder_info()) &&
                Objects.equals(getTelegram_payment_charge_id(), that.getTelegram_payment_charge_id()) &&
                Objects.equals(getProvider_payment_charge_id(), that.getProvider_payment_charge_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrency(), getTotal_amount(), getInvoice_payload(), getShipping_option_id(), getOrder_info(), getTelegram_payment_charge_id(), getProvider_payment_charge_id());
    }

    public String getInvoice_payload() {
        return invoice_payload;
    }

    public void setInvoice_payload(String invoice_payload) {
        this.invoice_payload = invoice_payload;
    }

    public String getShipping_option_id() {
        return shipping_option_id;
    }

    public void setShipping_option_id(String shipping_option_id) {
        this.shipping_option_id = shipping_option_id;
    }

    public OrderInfo getOrder_info() {
        return order_info;
    }

    public void setOrder_info(OrderInfo order_info) {
        this.order_info = order_info;
    }

    public String getTelegram_payment_charge_id() {
        return telegram_payment_charge_id;
    }

    public void setTelegram_payment_charge_id(String telegram_payment_charge_id) {
        this.telegram_payment_charge_id = telegram_payment_charge_id;
    }

    public String getProvider_payment_charge_id() {
        return provider_payment_charge_id;
    }

    public void setProvider_payment_charge_id(String provider_payment_charge_id) {
        this.provider_payment_charge_id = provider_payment_charge_id;
    }
}
