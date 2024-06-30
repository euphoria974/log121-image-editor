module imageeditor {
    requires javafx.controls;
    requires javafx.fxml;

    opens imageeditor to javafx.fxml;
    exports imageeditor;
}
