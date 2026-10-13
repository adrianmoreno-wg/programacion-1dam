package ejercicio01;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		System.out.println("Escribe el numero de filas y despues el de columnas:");
		Scanner sc = new Scanner(System.in);
		Integer fila = sc.nextInt();
		Integer columna = sc.nextInt();
		
		for (Integer i = 0; i < fila; i++) {
			for (Integer j = 0; j < columna; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
