package pojo.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

public class MaskPosition implements Serializable {
    private final static long serialVersionUID = 1682123458697995L;
    /*
    Done

point 	String 	The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
x_shift 	Float number 	Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask position.
y_shift 	Float number 	Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.
scale 	Float number 	Mask scaling coefficient. For example, 2.0 means double size.
     */
    @SerializedName("point")
    @Expose
    private String point;
    @SerializedName("x_shift")
    @Expose
    private Float x_shift;
    @SerializedName("y_shift")
    @Expose
    private Float y_shift;
    @SerializedName("scale")
    @Expose
    private Float scale;

    public MaskPosition(String point, Float x_shift, Float y_shift, Float scale) {
        this.point = point;
        this.x_shift = x_shift;
        this.y_shift = y_shift;
        this.scale = scale;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Float getX_shift() {
        return x_shift;
    }

    public void setX_shift(Float x_shift) {
        this.x_shift = x_shift;
    }

    public Float getY_shift() {
        return y_shift;
    }

    public void setY_shift(Float y_shift) {
        this.y_shift = y_shift;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaskPosition)) return false;
        MaskPosition that = (MaskPosition) o;
        return point.equals(that.point) &&
                x_shift.equals(that.x_shift) &&
                y_shift.equals(that.y_shift) &&
                scale.equals(that.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, x_shift, y_shift, scale);
    }

    @Override
    public String toString() {
        return "MaskPosition{" +
                "point='" + point + '\'' +
                ", x_shift=" + x_shift +
                ", y_shift=" + y_shift +
                ", scale=" + scale +
                '}';
    }
}
