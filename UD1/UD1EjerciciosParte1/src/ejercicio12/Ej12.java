package ejercicio12;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		
		Double manzanas, peras, total;
		
		System.out.println("Coloque el kilo de manzanas que vaya a comprar:");
		Scanner sc = new Scanner(System.in);
		manzanas = sc.nextDouble();
		System.out.println("Ahora coloque el kilo de peras que desee comprar:");
		peras = sc.nextDouble();
		total = (manzanas * 2.35) + (peras * 1.95);
		
		System.out.print("El importe total es de " + total + "€");
		
		sc.close();
	}
}
