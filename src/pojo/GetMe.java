package pojo;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetMe implements Serializable {

    private final static long serialVersionUID = 5974844238732396798L;
    @SerializedName("ok")
    @Expose
    private boolean ok;
    @SerializedName("result")
    @Expose
    private Result result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
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