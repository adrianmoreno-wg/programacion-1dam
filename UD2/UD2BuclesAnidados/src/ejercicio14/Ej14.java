package ejercicio14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		System.out.println("Coloca el numero de filas(par) y columnas respectivamente: " );
		Scanner sc = new Scanner(System.in);
		Integer fila = sc.nextInt();
		Integer columna = sc.nextInt();
		
		for (Integer i = 0; i < fila; i++) {
			if (i < fila / 2) {
				for (Integer j = 0; j < columna; j++) {
					System.out.print("*");
				}
			} else {
				for (Integer j = 0; j < columna; j++) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
