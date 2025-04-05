module com.ussd.ussdplateform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.ussd.ussdplateform to javafx.fxml;
    exports com.ussd.ussdplateform;
}