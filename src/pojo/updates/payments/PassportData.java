package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class PassportData implements Serializable {
    /*
    Done

    data 	Array of EncryptedPassportElement 	Array with information about documents and other
            Telegram Passport elements that was shared with the bot
credentials 	EncryptedCredentials 	Encrypted credentials required to decrypt the data
     */
    private final static long serialVersionUID = -17528866123812L;
    @SerializedName("data")
    @Expose
    private List<EncryptedPassportElement> data;
    @SerializedName("credentials")
    @Expose
    private EncryptedCredentials credentials;

    public PassportData(List<EncryptedPassportElement> data, EncryptedCredentials credentials) {
        this.data = data;
        this.credentials = credentials;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "PassportData{" +
                "data=" + data +
                ", credentials=" + credentials +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassportData)) return false;
        PassportData that = (PassportData) o;
        return getData().equals(that.getData()) &&
                getCredentials().equals(that.getCredentials());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getCredentials());
    }

    public List<EncryptedPassportElement> getData() {
        return data;
    }

    public void setData(List<EncryptedPassportElement> data) {
        this.data = data;
    }

    public EncryptedCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(EncryptedCredentials credentials) {
        this.credentials = credentials;
    }
}
