module com.example.ejercicios_tema_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios_tema_4 to javafx.fxml;
    exports com.example.ejercicios_tema_4;
}