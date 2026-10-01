package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		System.out.println("Coloca los valores de 'x', 'a', 'b' y 'c' para calcular:");
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble();
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		
		Double y = a * Math.pow(x, 2) + b * x + c;
		
		System.out.println("Total = " + y);
		
		sc.close();
	}

}
