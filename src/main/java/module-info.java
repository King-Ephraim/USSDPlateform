module com.ussd.ussdplateform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens com.ussd.ussdplateform to javafx.fxml;
    opens com.ussd.ussdplateform.entities to org.hibernate.orm.core,javafx.base ;
    exports com.ussd.ussdplateform;
}