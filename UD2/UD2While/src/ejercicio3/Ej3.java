package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Integer N = 0;
		Integer contador = 0;
		Integer total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte numeros. Cuando quiera parar coloque uno negativo:");
		
		while (N >= 0) {
			N = sc.nextInt();
			if ( N >= 0) {
				total += N;
				contador += 1;
			}
		}
		
		Double media = (double) total / contador;
		
		System.out.println("La media de los numeros positivos es: " + media);
		
		sc.close();
	}

}
