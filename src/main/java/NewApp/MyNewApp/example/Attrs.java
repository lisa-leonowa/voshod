
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Attrs {

    @SerializedName("adress")
    @Expose
    private String adress;
    @SerializedName("devEUI")
    @Expose
    private String devEUI;
    @SerializedName("device_config")
    @Expose
    private DeviceConfig deviceConfig;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Attrs withAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getDevEUI() {
        return devEUI;
    }

    public void setDevEUI(String devEUI) {
        this.devEUI = devEUI;
    }

    public Attrs withDevEUI(String devEUI) {
        this.devEUI = devEUI;
        return this;
    }

    public DeviceConfig getDeviceConfig() {
        return deviceConfig;
    }

    public void setDeviceConfig(DeviceConfig deviceConfig) {
        this.deviceConfig = deviceConfig;
    }

    public Attrs withDeviceConfig(DeviceConfig deviceConfig) {
        this.deviceConfig = deviceConfig;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Attrs withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Attrs withLng(String lng) {
        this.lng = lng;
        return this;
    }

}
