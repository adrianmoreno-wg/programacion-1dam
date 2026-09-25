package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Double radio, longitud, area;
		
		System.out.println("Coloca el radio de la circunferencia que deseas calcular:");
		
		Scanner sc = new Scanner(System.in);
		radio = sc.nextDouble();
		
		longitud = radio * 2;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.print("La longitud es de ");
		System.out.print(longitud);
		System.out.print(" y el radio es de ");
		System.out.print(area);
		
		sc.close();
	}

}
