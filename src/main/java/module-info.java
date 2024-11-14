module tv.safte.teamgitexperiene1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens tv.safte.teamgitexperiene1 to javafx.fxml;
    exports tv.safte.teamgitexperiene1;
}