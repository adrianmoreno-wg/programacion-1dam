package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Double N = 0.;
		Double alturaMaxima = 0.;
		
		System.out.println("Escribe la altura de cada arbol(cm). Cuando desees finalizar, coloque -1 (Otros valores negativos no contaran para finalizar la ejecucion): ");
		
		while (N != -1) {
			N = sc.nextDouble();
			if (N >= 0) {
				if (N > alturaMaxima) {
					alturaMaxima = N;
				}
			}
		}
		
		System.out.println("Altura maxima del arbol mas alto: " + alturaMaxima);
		
		sc.close();
	}

}
