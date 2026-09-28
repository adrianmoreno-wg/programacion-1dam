package ejercicio9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		System.out.println("Escriba los litros de agua en total: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		System.out.println("Escriba ahora la capacidad de cada botella: ");
		Double j = sc.nextDouble();
		
		Double m = i / j;
		m = Math.floor(m);
		
		System.out.println("El total de botellas completas es de " + String.format("%.0f", m) + " botellas");
		
		sc.close();
	}

}
