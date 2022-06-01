package com.example.ejercicios_tema_3;

public class Main {

    public static void main(String[] args) {
        suma( 10 , 30, 50 );
        Coche miCoche = new Coche ();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }
}

class Coche {
    public int puertas = 0;

    public void SumarPuerta() {
        this.puertas++;
    }

}