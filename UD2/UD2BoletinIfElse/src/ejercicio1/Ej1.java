package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		System.out.println("Escribe un numero y te dire si es par o impar: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();

		if (i % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		sc.close();
	}

}
