package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class EncryptedCredentials implements Serializable {
    /*
data 	String 	Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for EncryptedPassportElement decryption and authentication
hash 	String 	Base64-encoded data hash for data authentication
secret 	String 	Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
     */
    private final static long serialVersionUID = -6226668043902L;
    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("secret")
    @Expose
    private String secret;

    public EncryptedCredentials(String data, String hash, String secret) {
        this.data = data;
        this.hash = hash;
        this.secret = secret;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "EncryptedCredentials{" +
                "data='" + data + '\'' +
                ", hash='" + hash + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EncryptedCredentials)) return false;
        EncryptedCredentials that = (EncryptedCredentials) o;
        return getData().equals(that.getData()) &&
                getHash().equals(that.getHash()) &&
                getSecret().equals(that.getSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getHash(), getSecret());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
