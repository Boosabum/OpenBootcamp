module com.example.ejercicios_tema_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios_tema_3 to javafx.fxml;
    exports com.example.ejercicios_tema_3;
}