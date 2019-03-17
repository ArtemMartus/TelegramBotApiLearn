package model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Order implements Serializable {
    private final static long serialVersionUID = 1382023542109697845L;
    private String name;
    private String addons;
    private Long price;
    private Long dateOrdered;
    private Long datePaid;
    private Long dateMade;
    private Boolean paidFor;
    private Boolean done;
    private List<Message> comments;

    public Order(String name, String addons, Long price, Long dateOrdered, Long datePaid, Long dateMade, Boolean paidFor, Boolean done, List<Message> comments) {
        this.name = name;
        this.addons = addons;
        this.price = price;
        this.dateOrdered = dateOrdered;
        this.datePaid = datePaid;
        this.dateMade = dateMade;
        this.paidFor = paidFor;
        this.done = done;
        this.comments = comments;
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
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getName().equals(order.getName()) &&
                getAddons().equals(order.getAddons()) &&
                getPrice().equals(order.getPrice()) &&
                getDateOrdered().equals(order.getDateOrdered()) &&
                getDatePaid().equals(order.getDatePaid()) &&
                getDateMade().equals(order.getDateMade()) &&
                getPaidFor().equals(order.getPaidFor()) &&
                getDone().equals(order.getDone()) &&
                Objects.equals(getComments(), order.getComments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddons(), getPrice(), getDateOrdered(), getDatePaid(), getDateMade(), getPaidFor(), getDone(), getComments());
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
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

    public List<Message> getComments() {
        return comments;
    }

    public void setComments(List<Message> comments) {
        this.comments = comments;
    }
}
