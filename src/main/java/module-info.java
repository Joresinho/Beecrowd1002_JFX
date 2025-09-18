module com.mycompany.java {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.java to javafx.fxml;
    exports com.mycompany.java;
}
