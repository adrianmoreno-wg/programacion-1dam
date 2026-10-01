package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		System.out.println("Escriba un numero para redondearlo:");
		Scanner sc = new Scanner(System.in);
		Double n = sc.nextDouble();
		
		Integer total = (int) (n + 0.5);
		
		System.out.println("Numero redondeado: " + total);
		
		sc.close();
	}

}
