package NewApp.MyNewApp;

import java.util.List;

class Device {
	public List<Devices> agent;
	public int id;
	public String name;
	public List<String> tag;

}

class Devices {
	public List<Driver> driver;
	public boolean driver_config;
	public int id;
	public String name;
	public List<Tag2> tag;

}

class Tag2 {
	public List<Attrs> attrs;
	public List<Children> children;
	public int id;
	public String name;
	public List<String> properties;
	public List<String> type;
}

class Children {
	public List<String> attrs;
	public List<String> children;
	public int id;
	public String name;
	public List<String> properties;
	public List<String> type;
	
	
}
class Attrs {
	public String adress;
	public String devEUI;
	public List<DeviseConfig> device_config;
	public String lat;
	public String lng;
}

class DeviseConfig {
	public List<String> configuration_file;
	public String data_transmit_frequency;
	public String sensor_request_frequency;
}

class Driver {
	public int id;
	public String name;
}

