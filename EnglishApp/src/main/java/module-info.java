module com.tvn.englishapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tvn.englishapp to javafx.fxml;
    exports com.tvn.englishapp;
}
