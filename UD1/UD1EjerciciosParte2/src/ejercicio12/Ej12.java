package ejercicio12;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		System.out.println("Coloque su edad: ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		Double j = (i >= 18) ? 9.5 : 6.5;
		
		System.out.println("El precio de su entrada es de " + j + "€");
		
		sc.close();
	}

}
