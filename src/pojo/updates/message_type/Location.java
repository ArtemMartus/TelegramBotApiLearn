package pojo.updates.message_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Location implements Serializable {
    /*
    Done

    longitude 	Float 	Longitude as defined by sender
latitude 	Float 	Latitude as defined by sender
     */
    private final static long serialVersionUID = -3359712361038179975L;
    @SerializedName("longitude")
    @Expose
    private Float longitude;
    @SerializedName("latitude")
    @Expose
    private Float latitude;

    public Location(Float longitude, Float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getLongitude().equals(location.getLongitude()) &&
                getLatitude().equals(location.getLatitude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLongitude(), getLatitude());
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
}
