package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import pojo.updates.User;

import java.io.Serializable;

public class GetMe implements Serializable {

    private final static long serialVersionUID = 5974844238732396798L;
    @SerializedName("ok")
    @Expose
    private boolean ok;
    @SerializedName("result")
    @Expose
    private User result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public User getResult() {
        return result;
    }

    public void setResult(User result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GetMe{" +
                "ok=" + ok +
                ", result=" + result +
                '}';
    }
}