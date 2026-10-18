package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final Integer repeticion = 10;
		Integer N = null;
		Integer suma = 0;
		Double media;
		Integer sumaMedia = 0;
		Integer contadorMedia = 0;
		Integer contadorCero = 0;
		Integer contador = 0;
		
		System.out.println("Coloque 10 numeros enteros:");
		
		while (contador < repeticion) {
			N = sc.nextInt();
			if (N == 0) {
				contadorCero += 1;
			} else if (N > 0) {
				suma += N;
			} else {
				sumaMedia += N;
				contadorMedia++;
			}
			contador++;
		}
		
		media = (double) (sumaMedia / contadorMedia);
		
		System.out.println("Suma de los numeros positivos: " + suma);
		System.out.println("Media de los numeros negativos: " + media);
		System.out.println("Numero de veces que se ham escrito cero: " + contadorCero);
		
		sc.close();
	}

}
