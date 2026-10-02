package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		System.out.println("Escribe en orden los coeficientes de 'a', 'b' y 'c':");
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		Double x1 = null;
		Double x2 = null;
		Double discriminante = Math.pow(b, 2) - 4 * a * c;
		
		if (discriminante < 0) {
			System.out.println("Resultado: Imposible de calcular");
		} else if (discriminante > 0) {
			x1 = (-b + Math.sqrt(discriminante) / (2 * a));
			x2 = (-b - Math.sqrt(discriminante) / (2 * a));
			
			Double totalPositivo = a * Math.pow(x1, 2) + b * x1 + c;
			Double totalNegativo = a * Math.pow(x2, 2) + b * x2 + c;
			
			System.out.println("Resultados: ");
			System.out.println("Positivo: " + totalPositivo);
			System.out.println("Negativo: " + totalNegativo);
			System.out.println(x1);
			System.out.println(x2);
		} else {
			x1 = (-b + Math.sqrt(discriminante) / 2 * a);
			
			Double total = a * Math.pow(x1, 2) + b * x1 + c;
			
			System.out.println("Resultado: " + total);
		}
		
		sc.close();
	}

}
