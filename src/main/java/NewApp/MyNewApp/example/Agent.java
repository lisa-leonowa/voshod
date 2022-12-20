
package NewApp.MyNewApp.example;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Agent {

    @SerializedName("agent")
    @Expose
    public Agent__1 agent;

    public Agent__1 getAgent() {
        return agent;
    }

    public void setAgent(Agent__1 agent) {
        this.agent = agent;
    }

    public Agent withAgent(Agent__1 agent) {
        this.agent = agent;
        return this;
    }

}
