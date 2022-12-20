
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Autosave__3 {

    @SerializedName("digital_twins")
    @Expose
    private Boolean digitalTwins;

    public Boolean getDigitalTwins() {
        return digitalTwins;
    }

    public void setDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
    }

    public Autosave__3 withDigitalTwins(Boolean digitalTwins) {
        this.digitalTwins = digitalTwins;
        return this;
    }

}
