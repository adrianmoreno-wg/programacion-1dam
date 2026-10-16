package ejercicio19;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {

		do {
			System.out.println("===========================================================");
			System.out.println();
			System.out.println("1. Rectangulo Macizo");
			System.out.println("2. Rectangulo Hueco");
			System.out.println();
			System.out.println("===========================================================");
			System.out.println();
			System.out.println("Elige una de las dos opciones escribiendo su numero: ");
			Scanner sc = new Scanner(System.in);
			Integer n = sc.nextInt();
			
			switch (n) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Error: ");
			}
		} while (n !=3);
	}

}
