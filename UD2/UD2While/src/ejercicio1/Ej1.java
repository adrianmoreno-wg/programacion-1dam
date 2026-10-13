package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Integer N = 0;
		Integer total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte numeros. Cuando quiera parar coloque uno negativo:");
		
		while (N >= 0) {
			N = sc.nextInt();
			total += N;
		}
		
		System.out.println("La suma es: " + total);
		
		sc.close();
	}

}
