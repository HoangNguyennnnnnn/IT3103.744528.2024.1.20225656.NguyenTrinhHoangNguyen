module AimsProject {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.media;
    requires javafx.swing;

    exports hust.soict.dsai.aims.screen;
    opens hust.soict.dsai.aims.screen to javafx.fxml;
    opens hust.soict.dsai.aims.media to javafx.base;

}