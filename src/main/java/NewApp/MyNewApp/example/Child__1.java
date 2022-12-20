
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Child__1 {

    @SerializedName("attrs")
    @Expose
    private Attrs__2 attrs;
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
    private Properties properties;
    @SerializedName("type")
    @Expose
    private Type type;

    public Attrs__2 getAttrs() {
        return attrs;
    }

    public void setAttrs(Attrs__2 attrs) {
        this.attrs = attrs;
    }

    public Child__1 withAttrs(Attrs__2 attrs) {
        this.attrs = attrs;
        return this;
    }

    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }

    public Child__1 withChildren(Object children) {
        this.children = children;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Child__1 withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child__1 withName(String name) {
        this.name = name;
        return this;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Child__1 withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Child__1 withType(Type type) {
        this.type = type;
        return this;
    }

}
