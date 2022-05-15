module com.tomczyk.zpksend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tomczyk.zpksend to javafx.fxml;
    exports com.tomczyk.zpksend;
}