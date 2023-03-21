module com.daw.practica14 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.daw.practica14 to javafx.fxml;
    exports com.daw.practica14;
}
