module matt.fxquitfromdialogbug {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens matt.fxquitfromdialogbug to javafx.fxml;
    exports matt.fxquitfromdialogbug;
}