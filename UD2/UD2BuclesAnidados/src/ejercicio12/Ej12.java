package ejercicio12;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		System.out.println("Coloca el numero de filas y de columnas respectivamente: ");
		Scanner sc = new Scanner(System.in);
		Integer fila = sc.nextInt();
		Integer columna = sc.nextInt();
		
		for (Integer i = 0; i < fila; i++) {
			for (Integer j = 0; j < columna; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print("#");
					} else {
						System.out.print("*");
					}
				}

			}
			System.out.println();
		}
		
		sc.close();
	}

}
