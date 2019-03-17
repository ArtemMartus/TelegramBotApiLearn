package pojo.updates;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Update implements Serializable {

    private final static long serialVersionUID = 5729256284282085119L;
    @SerializedName("ok")
    @Expose
    private boolean ok;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    /**
     * No args constructor for use in serialization
     */
    public Update() {
    }

    /**
     * @param result
     * @param ok
     */
    public Update(boolean ok, List<Result> result) {
        super();
        this.ok = ok;
        this.result = result;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ok", ok).append("result", result).toString();
    }

}