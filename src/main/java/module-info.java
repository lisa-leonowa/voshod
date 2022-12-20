module NewApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
	requires com.google.gson;
	requires datetime.picker.javafx;
	requires javafx.base;
	//requires example;
	requires com.fasterxml.jackson.databind;
	requires java.sql;
	//requires io.github.bajins;
    opens NewApp.MyNewApp to javafx.fxml;
    opens NewApp.MyNewApp.example to com.google.gson; 
    exports NewApp.MyNewApp;
}