
package NewApp.MyNewApp.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Agent__1 {

    @SerializedName("devices")
    @Expose
    private List<Device> devices = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tag")
    @Expose
    private Tag__1 tag;

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public Agent__1 withDevices(List<Device> devices) {
        this.devices = devices;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Agent__1 withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agent__1 withName(String name) {
        this.name = name;
        return this;
    }

    public Tag__1 getTag() {
        return tag;
    }

    public void setTag(Tag__1 tag) {
        this.tag = tag;
    }

    public Agent__1 withTag(Tag__1 tag) {
        this.tag = tag;
        return this;
    }

}
