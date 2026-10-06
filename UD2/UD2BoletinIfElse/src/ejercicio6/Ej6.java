package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		System.out.println("Escribe un numero entre 0 y 99.999: ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		if (i < 0 || i > 99999) {
			System.out.println("No me seas subnormal y escribeme el numero bien");
		} else if (i >= 0 && i <= 9) {
			System.out.println("Tu numero tiene 1 cifra");
		} else if (i >= 10 && i <= 99) {
			System.out.println("Tu numero tiene 2 cifras");
		} else if (i >= 100 && i <= 999) {
			System.out.println("Tu numero tiene 3 cifra");
		} else if (i >= 1000 && i <= 9999) {
			System.out.println("Tu numero tiene 4 cifra");
		} else if (i >= 10000 && i <= 99999) {
			System.out.println("Tu numero tiene 1 cifra");
		}
		
		sc.close();
	}

}
