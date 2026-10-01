package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		System.out.println("Coloca la longitud del lanzamiento(m): ");
		Scanner sc = new Scanner(System.in);
		Double m = sc.nextDouble();
		
		Integer cm = (int) Math.floor(m * 100);
		
		System.out.println("Resultado final: " + cm + " cm");
		
		sc.close();
	}

}
