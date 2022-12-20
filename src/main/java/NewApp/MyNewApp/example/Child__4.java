
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Child__4 {

    @SerializedName("attrs")
    @Expose
    private Attrs__6 attrs;
    @SerializedName("children")
    @Expose
    private Object children;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("properties")
    @Expose
    private Properties__3 properties;
    @SerializedName("type")
    @Expose
    private Type__3 type;

    public Attrs__6 getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs__6 attrs) {
        this.attrs = attrs;
    }

    public Child__4 withAttrs(Attrs__6 attrs) {
        this.attrs = attrs;
        return this;
    }

    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }

    public Child__4 withChildren(Object children) {
        this.children = children;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Child__4 withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child__4 withName(String name) {
        this.name = name;
        return this;
    }

    public Properties__3 getProperties() {
        return properties;
    }

    public void setProperties(Properties__3 properties) {
        this.properties = properties;
    }

    public Child__4 withProperties(Properties__3 properties) {
        this.properties = properties;
        return this;
    }

    public Type__3 getType() {
        return type;
    }

    public void setType(Type__3 type) {
        this.type = type;
    }

    public Child__4 withType(Type__3 type) {
        this.type = type;
        return this;
    }

}
