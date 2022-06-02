module com.example.ejercicios_tema_8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios_tema_8 to javafx.fxml;
    exports com.example.ejercicios_tema_8;
}