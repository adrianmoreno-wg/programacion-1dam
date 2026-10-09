package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Double total = 0.;
		System.out.println("Coloca 10 numeros:");
		Scanner sc = new Scanner(System.in);
		
		for (Double i = 0.; i < 10; i++) {
			Double num = sc.nextDouble();
			total += num;
		}
		total = total / 10;
		System.out.println("Media total: " + total);
		
		sc.close();
	}

}
