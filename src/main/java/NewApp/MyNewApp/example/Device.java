
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Device {

    @SerializedName("driver")
    @Expose
    private Driver driver;
    @SerializedName("driver_config")
    @Expose
    private DriverConfig driverConfig;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tag")
    @Expose
    private Tag tag;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Device withDriver(Driver driver) {
        this.driver = driver;
        return this;
    }

    public DriverConfig getDriverConfig() {
        return driverConfig;
    }

    public void setDriverConfig(DriverConfig driverConfig) {
        this.driverConfig = driverConfig;
    }

    public Device withDriverConfig(DriverConfig driverConfig) {
        this.driverConfig = driverConfig;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Device withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device withName(String name) {
        this.name = name;
        return this;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Device withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

}
