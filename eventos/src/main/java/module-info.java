module com.example.eventos {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.eventos to javafx.fxml;
    exports com.example.eventos;
}