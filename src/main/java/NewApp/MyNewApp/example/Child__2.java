
package NewApp.MyNewApp.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Child__2 {

    @SerializedName("attrs")
    @Expose
    private Attrs__4 attrs;
    @SerializedName("children")
    @Expose
    private List<Child__3> children = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("properties")
    @Expose
    private Properties__5 properties;
    @SerializedName("type")
    @Expose
    private Type__5 type;

    public Attrs__4 getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs__4 attrs) {
        this.attrs = attrs;
    }

    public Child__2 withAttrs(Attrs__4 attrs) {
        this.attrs = attrs;
        return this;
    }

    public List<Child__3> getChildren() {
        return children;
    }

    public void setChildren(List<Child__3> children) {
        this.children = children;
    }

    public Child__2 withChildren(List<Child__3> children) {
        this.children = children;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Child__2 withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child__2 withName(String name) {
        this.name = name;
        return this;
    }

    public Properties__5 getProperties() {
        return properties;
    }

    public void setProperties(Properties__5 properties) {
        this.properties = properties;
    }

    public Child__2 withProperties(Properties__5 properties) {
        this.properties = properties;
        return this;
    }

    public Type__5 getType() {
        return type;
    }

    public void setType(Type__5 type) {
        this.type = type;
    }

    public Child__2 withType(Type__5 type) {
        this.type = type;
        return this;
    }

}
