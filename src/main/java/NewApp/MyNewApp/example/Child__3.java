
package NewApp.MyNewApp.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Child__3 {

    @SerializedName("attrs")
    @Expose
    private Attrs__5 attrs;
    @SerializedName("children")
    @Expose
    private List<Child__4> children = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("properties")
    @Expose
    private Properties__4 properties;
    @SerializedName("type")
    @Expose
    private Type__4 type;

    public Attrs__5 getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs__5 attrs) {
        this.attrs = attrs;
    }

    public Child__3 withAttrs(Attrs__5 attrs) {
        this.attrs = attrs;
        return this;
    }

    public List<Child__4> getChildren() {
        return children;
    }

    public void setChildren(List<Child__4> children) {
        this.children = children;
    }

    public Child__3 withChildren(List<Child__4> children) {
        this.children = children;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Child__3 withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child__3 withName(String name) {
        this.name = name;
        return this;
    }

    public Properties__4 getProperties() {
        return properties;
    }

    public void setProperties(Properties__4 properties) {
        this.properties = properties;
    }

    public Child__3 withProperties(Properties__4 properties) {
        this.properties = properties;
        return this;
    }

    public Type__4 getType() {
        return type;
    }

    public void setType(Type__4 type) {
        this.type = type;
    }

    public Child__3 withType(Type__4 type) {
        this.type = type;
        return this;
    }

}
