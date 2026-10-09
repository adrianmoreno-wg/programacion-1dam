package ejercicio3;

import java.util.Scanner;

public class Ej3 {

//	El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene
//	a partir del número de la siguiente forma:
//		letra = número DNI módulo 23
//	Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla.
//	Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le
//	corresponde. Observa que un número de 8 dígitos está dentro del rango del tipo int.

	
	public static void main(String[] args) {

		System.out.println("Coloca tu DNI sin la ultima letra (8 digitos):");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Integer total = num % 23;
		String letra = null;
		
		if ( num < 10000000 || num > 99999999 ) {
			System.out.println("Has escrito mal el DNI (8 digitos)");
		} else {
			switch (total) {
			case 0:
				letra = "T";
			case 1:
				letra = "R";
			case 2:
				letra = "W";
			case 3:
				letra = "A";
			case 4:
				letra = "G";
			case 5:
				letra = "M";
			case 6:
				letra = "Y";
			case 7:
				letra = "F";
			case 8:
				letra = "P";
			case 9:
				letra = "D";
			case 10:
				letra = "X";
			case 11:
				letra = "B";
			case 12:
				letra = "N";
			case 13:
				letra = "J";
			case 14:
				letra = "Z";
			case 15:
				letra = "S";
			case 16:
				letra = "Q";
			case 17:
				letra = "V";
			case 18:
				letra = "H";
			case 19:
				letra = "L";
			case 20:
				letra = "C";
			case 21:
				letra = "K";
			case 22:
				letra = "E";
			}
		
		System.out.println("La letra de tu DNI es" + letra);	
		
		sc.close();
		
		}
	}

}
