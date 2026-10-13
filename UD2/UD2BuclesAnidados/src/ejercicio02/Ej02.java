package ejercicio02;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		System.out.println("Escribe el numero de filas y despues el de columnas:");
		Scanner sc = new Scanner(System.in);
		Integer fila = sc.nextInt();
		Integer columna = sc.nextInt();

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
		sc.close();
	}

}
