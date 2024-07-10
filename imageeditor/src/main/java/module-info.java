module org.example.imageeditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.imageeditor to javafx.fxml;
    exports org.example.imageeditor;
}