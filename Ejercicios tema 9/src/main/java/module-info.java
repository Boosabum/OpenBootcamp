module com.example.ejercicios_tema_9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios_tema_9 to javafx.fxml;
    exports com.example.ejercicios_tema_9;
}