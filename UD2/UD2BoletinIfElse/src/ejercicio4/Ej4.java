package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero decimal: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		
		if (i == 0 || i >= 1 || i <= -1) {
			System.out.println("No es un numero casi-cero");
		} else {
			System.out.println("Es un numero casi-cero");
		}
		
		sc.close();
	}

}
