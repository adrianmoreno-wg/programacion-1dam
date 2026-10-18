package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer N = 0;
		Integer contador = 0;
		Integer sumEdad = 0;
		Double mediaEdad;
		Integer contadorMas18 = 0;
		
		System.out.println("Escribe la edad de cada uno de los alumnos. Para finalizar coloque un numero negativo: ");

		while (N >= 0) {
			N = sc.nextInt();
			if (N >= 0) {
				sumEdad += N;
				if (N >= 18) {
					contadorMas18++;
				}
				contador++;
			}
		}

		mediaEdad = (double) (sumEdad / contador);
		
		System.out.println("Suma de todas las edades: " + sumEdad);
		System.out.println("Media de todas las edades: " + mediaEdad);
		System.out.println("Numero de alumnos: " + contador);
		System.out.println("Numero de alumnos mayores de edad: " + contadorMas18);
		
		sc.close();
	}

}
