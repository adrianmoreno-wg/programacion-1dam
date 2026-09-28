package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		System.out.println("Escribe el año que desee comporbar si es bisiesto: ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		Boolean j = (i % 4 == 0 || i % 100 != 0) && i % 400 == 0;
		
		if (j == true) {
			System.out.println("Es año bisiesto");
		} else {
			System.out.println("No es año bisiesto");
		}
		
		sc.close();
	}

}
