package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Invoice implements Serializable {
    /*
    Done

    title 	String 	Product name
    description 	String 	Product description
    start_parameter 	String 	Unique bot deep-linking parameter that can be used to generate this invoice
    currency 	String 	Three-letter ISO 4217 currency code
    total_amount 	Integer 	Total price in the smallest units of the currency (integer, not float/double). For example,
            for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
            it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    private final static long serialVersionUID = -33520429898290145L;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("start_parameter")
    @Expose
    private String start_parameter;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("total_amount")
    @Expose
    private Long total_amount;

    public Invoice(String title, String description, String start_parameter, String currency, Long total_amount) {
        this.title = title;
        this.description = description;
        this.start_parameter = start_parameter;
        this.currency = currency;
        this.total_amount = total_amount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", start_parameter='" + start_parameter + '\'' +
                ", currency='" + currency + '\'' +
                ", total_amount=" + total_amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice)) return false;
        Invoice invoice = (Invoice) o;
        return getTitle().equals(invoice.getTitle()) &&
                getDescription().equals(invoice.getDescription()) &&
                getStart_parameter().equals(invoice.getStart_parameter()) &&
                getCurrency().equals(invoice.getCurrency()) &&
                getTotal_amount().equals(invoice.getTotal_amount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getStart_parameter(), getCurrency(), getTotal_amount());
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

    public String getStart_parameter() {
        return start_parameter;
    }

    public void setStart_parameter(String start_parameter) {
        this.start_parameter = start_parameter;
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
}
