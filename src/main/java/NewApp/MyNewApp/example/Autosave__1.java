
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Autosave__1 {

    @SerializedName("long_term_storage")
    @Expose
    private Boolean longTermStorage;
    @SerializedName("operational_storage")
    @Expose
    private Boolean operationalStorage;
    @SerializedName("digital_twins")
    @Expose
    private Boolean digitalTwins;

    public Boolean getLongTermStorage() {
        return longTermStorage;
    }

    public void setLongTermStorage(Boolean longTermStorage) {
        this.longTermStorage = longTermStorage;
    }

    public Autosave__1 withLongTermStorage(Boolean longTermStorage) {
        this.longTermStorage = longTermStorage;
        return this;
    }

    public Boolean getOperationalStorage() {
        return operationalStorage;
    }

    public void setOperationalStorage(Boolean operationalStorage) {
        this.operationalStorage = operationalStorage;
    }

    public Autosave__1 withOperationalStorage(Boolean operationalStorage) {
        this.operationalStorage = operationalStorage;
        return this;
    }

    public Boolean getDigitalTwins() {
        return digitalTwins;
    }

    public void setDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
    }

    public Autosave__1 withDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
        return this;
    }

}
