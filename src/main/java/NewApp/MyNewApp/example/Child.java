
package NewApp.MyNewApp.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Child {

    @SerializedName("attrs")
    @Expose
    private Attrs__1 attrs;
    @SerializedName("children")
    @Expose
    private List<Child__1> children = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("properties")
    @Expose
    private Properties__1 properties;
    @SerializedName("type")
    @Expose
    private Type__1 type;

    public Attrs__1 getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs__1 attrs) {
        this.attrs = attrs;
    }

    public Child withAttrs(Attrs__1 attrs) {
        this.attrs = attrs;
        return this;
    }

    public List<Child__1> getChildren() {
        return children;
    }

    public void setChildren(List<Child__1> children) {
        this.children = children;
    }

    public Child withChildren(List<Child__1> children) {
        this.children = children;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Child withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child withName(String name) {
        this.name = name;
        return this;
    }

    public Properties__1 getProperties() {
        return properties;
    }

    public void setProperties(Properties__1 properties) {
        this.properties = properties;
    }

    public Child withProperties(Properties__1 properties) {
        this.properties = properties;
        return this;
    }

    public Type__1 getType() {
        return type;
    }

    public void setType(Type__1 type) {
        this.type = type;
    }

    public Child withType(Type__1 type) {
        this.type = type;
        return this;
    }

}
