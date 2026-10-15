package ejercicio13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		System.out.println("Coloca el numero de filas y columnas(par) respectivamente: " );
		Scanner sc = new Scanner(System.in);
		Integer fila = sc.nextInt();
		Integer columna = sc.nextInt();
		
		for (Integer i = 0; i < fila; i++) {
			for (Integer j = 0; j < columna; j++) {
				if (j < columna / 2) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
