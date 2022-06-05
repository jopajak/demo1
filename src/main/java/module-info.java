module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires leveldb.api;
    requires leveldb;
    requires java.logging;
    requires org.json;
    requires org.apache.commons.codec;


    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}