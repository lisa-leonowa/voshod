
package NewApp.MyNewApp.example;

//simport javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Autosave__2 {

    @SerializedName("digital_twins")
    @Expose
    private Boolean digitalTwins;
    @SerializedName("operational_storage")
    @Expose
    private Boolean operationalStorage;

    public Boolean getDigitalTwins() {
        return digitalTwins;
    }

    public void setDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
    }

    public Autosave__2 withDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
        return this;
    }

    public Boolean getOperationalStorage() {
        return operationalStorage;
    }

    public void setOperationalStorage(Boolean operationalStorage) {
        this.operationalStorage = operationalStorage;
    }

    public Autosave__2 withOperationalStorage(Boolean operationalStorage) {
        this.operationalStorage = operationalStorage;
        return this;
    }

}
