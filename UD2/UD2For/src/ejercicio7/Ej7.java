package ejercicio7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		System.out.println("Coloca un numero: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 2; i < N; i++) {
			if (N % i == 0) {
				System.out.println("No es primo");
				System.exit(0);
			}
		}
		
		System.out.println("Es primo");
		
		sc.close();
	}

}
