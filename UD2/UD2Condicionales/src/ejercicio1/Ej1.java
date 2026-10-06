package ejercicio1;

import java.util.Scanner;

public class Ej1 {

//	Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
//	La aplicación tendrá que indicar si el número introducido es capicúa. Un número es capicúa
//	si se lee igual de izquierda a derecha que de derecha a izquierda.

	
	public static void main(String[] args) {

		System.out.println("Escribe un numero entre 0 y 99.999: ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		Boolean esCapicua = false;
		Integer a1 = null;
		Integer a2 = null;
		Integer a3 = null;
		Integer a4 = null;
		Integer a5 = null;
		
		if (i < 0 || i > 99999) {
			System.out.println("No me seas subnormal y escribeme el numero bien");
			System.exit(0);
		} else if (i >= 0 && i <= 9) {
			System.out.println("Tu numero tiene 1 cifra");
			esCapicua = true;
		} else if (i >= 10 && i <= 99) {
			System.out.println("Tu numero tiene 2 cifras");
			a1 = i / 10;
			a2 = i % 10;
			if (a1 == a2) {
				esCapicua = true;
			}
		} else if (i >= 100 && i <= 999) {
			System.out.println("Tu numero tiene 3 cifra");
			a1 = i / 100;
			a3 = (i % 100) % 10;
			if (a1 == a3) {
				esCapicua = true;
			}
		} else if (i >= 1000 && i <= 9999) {
			System.out.println("Tu numero tiene 4 cifra");
			a1 = i / 1000;
			a2 = (i % 1000) / 100;
			a3 = ((i % 1000) % 100) / 10;
			a4 = ((i % 1000) % 100) % 10;
			if (a1 == a4 && a2 == a3) {
				esCapicua = true;
			}
		} else if (i >= 10000 && i <= 99999) {
			System.out.println("Tu numero tiene 1 cifra");
			a1 = i / 10000;
			a2 = (i % 10000) / 1000;
			a4 = (((i % 10000) % 1000) % 100) / 10;
			a5 = (((i % 10000) % 1000) % 100) % 10;
			if (a1 == a5 && a2 == a4) {
				esCapicua = true;
			}
		}
		
		if (esCapicua == true) {
			System.out.println("Es capicua");
		}
		
		sc.close();
	}

}
