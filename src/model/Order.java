package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order implements Serializable {
    private final static long serialVersionUID = 1382023542109697845L;
    private String name;
    private String addons;
    private Integer price;
    private Long dateOrdered;
    private Long datePaid;
    private Long dateMade;
    private Boolean paidFor;
    private Boolean done;

    public Order(String name, String addons, Integer price, Long dateOrdered, Long datePaid, Long dateMade, Boolean paidFor, Boolean done) {
        this.name = name;
        this.addons = addons;
        this.price = price;
        this.dateOrdered = dateOrdered;
        this.datePaid = datePaid;
        this.dateMade = dateMade;
        this.paidFor = paidFor;
        this.done = done;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String unixToString(Long unix) {
        Date date = new Date(unix * 1000);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return df.format(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddons() {
        return addons;
    }

    public void setAddons(String addons) {
        this.addons = addons;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Long dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Long getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Long datePaid) {
        this.datePaid = datePaid;
    }

    public Long getDateMade() {
        return dateMade;
    }

    public void setDateMade(Long dateMade) {
        this.dateMade = dateMade;
    }

    public Boolean getPaidFor() {
        return paidFor;
    }

    public void setPaidFor(Boolean paidFor) {
        this.paidFor = paidFor;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", addons='" + addons + '\'' +
                ", price=" + price +
                ", dateOrdered=" + dateOrdered +
                ", datePaid=" + datePaid +
                ", dateMade=" + dateMade +
                ", paidFor=" + paidFor +
                ", done=" + done +
                '}';
    }
}
