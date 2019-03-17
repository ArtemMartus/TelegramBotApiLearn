package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Venue implements Serializable {
    /*
    location 	Location 	Venue location
title 	String 	Name of the venue
address 	String 	Address of the venue
foursquare_id 	String 	Optional. Foursquare identifier of the venue
foursquare_type 	String 	Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    private final static long serialVersionUID = -2357776583810075L;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("foursquare_id")
    @Expose
    private String foursquare_id;
    @SerializedName("foursquare_type")
    @Expose
    private String foursquare_type;

    public Venue(Location location, String title, String address, String foursquare_id, String foursquare_type) {
        this.location = location;
        this.title = title;
        this.address = address;
        this.foursquare_id = foursquare_id;
        this.foursquare_type = foursquare_type;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "location=" + location +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", foursquare_id='" + foursquare_id + '\'' +
                ", foursquare_type='" + foursquare_type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venue)) return false;
        Venue venue = (Venue) o;
        return getLocation().equals(venue.getLocation()) &&
                getTitle().equals(venue.getTitle()) &&
                getAddress().equals(venue.getAddress()) &&
                Objects.equals(getFoursquare_id(), venue.getFoursquare_id()) &&
                Objects.equals(getFoursquare_type(), venue.getFoursquare_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocation(), getTitle(), getAddress(), getFoursquare_id(), getFoursquare_type());
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoursquare_id() {
        return foursquare_id;
    }

    public void setFoursquare_id(String foursquare_id) {
        this.foursquare_id = foursquare_id;
    }

    public String getFoursquare_type() {
        return foursquare_type;
    }

    public void setFoursquare_type(String foursquare_type) {
        this.foursquare_type = foursquare_type;
    }
}
