package pojo.updates.payments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public class EncryptedPassportElement implements Serializable {
    /*
    Done

type 	String 	Element type. One of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”, “phone_number”, “email”.
data 	String 	Optional. Base64-encoded encrypted Telegram Passport element data provided by the user, available for “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport” and “address” types. Can be decrypted and verified using the accompanying EncryptedCredentials.
phone_number 	String 	Optional. User's verified phone number, available only for “phone_number” type
email 	String 	Optional. User's verified email address, available only for “email” type
files 	Array of PassportFile 	Optional. Array of encrypted files with documents provided by the user, available for “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.
front_side 	PassportFile 	Optional. Encrypted file with the front side of the document, provided by the user. Available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
reverse_side 	PassportFile 	Optional. Encrypted file with the reverse side of the document, provided by the user. Available for “driver_license” and “identity_card”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
selfie 	PassportFile 	Optional. Encrypted file with the selfie of the user holding a document, provided by the user; available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
translation 	Array of PassportFile 	Optional. Array of encrypted files with translated versions of documents provided by the user. Available if requested for “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.
hash 	String 	Base64-encoded element hash for using in PassportElementErrorUnspecified
     */

    private final static long serialVersionUID = -14357866123912L;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("phone_number")
    @Expose
    private String phone_number;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("files")
    @Expose
    private List<PassportFile> files;
    @SerializedName("front_side")
    @Expose
    private PassportFile front_side;
    @SerializedName("reverse_side")
    @Expose
    private PassportFile reverse_side;
    @SerializedName("selfie")
    @Expose
    private PassportFile selfie;
    @SerializedName("translation")
    @Expose
    private List<PassportFile> translation;
    @SerializedName("hash")
    @Expose
    private String hash;

    public EncryptedPassportElement(String type, String data, String phone_number, String email, List<PassportFile> files, PassportFile front_side, PassportFile reverse_side, PassportFile selfie, List<PassportFile> translation, String hash) {
        this.type = type;
        this.data = data;
        this.phone_number = phone_number;
        this.email = email;
        this.files = files;
        this.front_side = front_side;
        this.reverse_side = reverse_side;
        this.selfie = selfie;
        this.translation = translation;
        this.hash = hash;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EncryptedPassportElement)) return false;
        EncryptedPassportElement that = (EncryptedPassportElement) o;
        return getType().equals(that.getType()) &&
                Objects.equals(getData(), that.getData()) &&
                Objects.equals(getPhone_number(), that.getPhone_number()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getFiles(), that.getFiles()) &&
                Objects.equals(getFront_side(), that.getFront_side()) &&
                Objects.equals(getReverse_side(), that.getReverse_side()) &&
                Objects.equals(getSelfie(), that.getSelfie()) &&
                Objects.equals(getTranslation(), that.getTranslation()) &&
                getHash().equals(that.getHash());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getData(), getPhone_number(), getEmail(), getFiles(), getFront_side(), getReverse_side(), getSelfie(), getTranslation(), getHash());
    }

    @Override
    public String toString() {
        return "EncryptedPassportElement{" +
                "type='" + type + '\'' +
                ", data='" + data + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", files=" + files +
                ", front_side=" + front_side +
                ", reverse_side=" + reverse_side +
                ", selfie=" + selfie +
                ", translation=" + translation +
                ", hash='" + hash + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PassportFile> getFiles() {
        return files;
    }

    public void setFiles(List<PassportFile> files) {
        this.files = files;
    }

    public PassportFile getFront_side() {
        return front_side;
    }

    public void setFront_side(PassportFile front_side) {
        this.front_side = front_side;
    }

    public PassportFile getReverse_side() {
        return reverse_side;
    }

    public void setReverse_side(PassportFile reverse_side) {
        this.reverse_side = reverse_side;
    }

    public PassportFile getSelfie() {
        return selfie;
    }

    public void setSelfie(PassportFile selfie) {
        this.selfie = selfie;
    }

    public List<PassportFile> getTranslation() {
        return translation;
    }

    public void setTranslation(List<PassportFile> translation) {
        this.translation = translation;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
