
package ejercicio19;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {

        Integer n = 0;
        Integer fila;
        Integer columna;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("1. Rectangulo Macizo");
            System.out.println("2. Rectangulo Hueco");
            System.out.println("3. Salir");
            System.out.println();
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("Elige una de las dos opciones escribiendo su numero:");

            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Escribe el numero de filas y despues el de columnas:");
                    fila = sc.nextInt();
                    columna = sc.nextInt();

                    for (Integer i = 0; i < fila; i++) {
                        for (Integer j = 0; j < columna; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Escribe el numero de filas y despues el de columnas:");
                    fila = sc.nextInt();
                    columna = sc.nextInt();

                    for (Integer i = 1; i <= fila; i++) {
                        for (Integer j = 1; j <= columna; j++) {
                            if (i == 1 || i == fila || j == 1 || j == columna) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Fin de ejecucion");
                    break;

                default:
                    System.out.println("Error: Valor inesperado");
            }

        } while (n != 3);

        sc.close();
    }
}