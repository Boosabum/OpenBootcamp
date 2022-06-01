package com.example.ejercicios_tema_4;

public class Main {

    public static void main(String[] args) {
        int numeroIf = -4;
        int numeroWhile = -1;
        String estacion = "PRIMAVERA";
        System.out.println(numeroIf);
        System.out.println(numeroWhile);

        if (numeroIf == 0) {
            System.out.println("El número es cero");
        } else if (numeroIf > 0) {
            System.out.println("El número es mayor que cero");
        } else {
            System.out.println("El número es menor que cero");
        }

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
                    }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while(numeroWhile == 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        switch(estacion) {
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Eso no es ninguna estación");
        }
    }
}

