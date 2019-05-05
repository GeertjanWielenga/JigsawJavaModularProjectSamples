module org.wordlibrary.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.wordlibrary.hellofx to javafx.fxml;
    exports org.wordlibrary.hellofx;
}