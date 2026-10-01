package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		System.out.println("Coloca tres distancias, siendo en orden en mm, cm y m: ");
		Scanner sc = new Scanner(System.in);
		Double mm = sc.nextDouble();
		Double cm = sc.nextDouble();
		Double m = sc.nextDouble();
		
		mm = mm / 10;
		m = m * 100;
		Double total = mm + cm + m;
		
		System.out.println("La suma de los tres es: " + total + " cm");
		
		sc.close();
	}

}
