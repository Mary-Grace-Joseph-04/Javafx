module ars.main.airline2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    opens ars.main.airline2 to javafx.fxml;
    exports ars.main.airline2;
    exports ars.main.airline2.application;
    opens ars.main.airline2.application to javafx.fxml;
}