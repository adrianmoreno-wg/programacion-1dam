package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Integer N = 0;
		Integer total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte numeros. Cuando quiera parar coloque uno negativo:");
		
		while (N >= 0) {
			N = sc.nextInt();
			if (N >= 0) {
				total += 1;
			}
		}
		
		System.out.println("Has escrito un totaL de " + total + " numeros positivos");
		
		sc.close();
	}

}
