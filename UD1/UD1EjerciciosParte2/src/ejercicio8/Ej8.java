package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		System.out.println("Coloca el numero de productos: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		System.out.println("Escribe la capacidad de la caja: ");
		Double j = sc.nextDouble();
		
		Double m = i / j;
		m = Math.ceil(m);
		
		System.out.println("Necesitaras al menos " + String.format("%.0f", m) + " cajas");
		
		sc.close();
	}

}
