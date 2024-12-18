module GUIProject {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.media;
    requires javafx.swing;

    exports hust.soict.dsai.javafx;
    opens hust.soict.dsai.javafx to javafx.fxml;
}