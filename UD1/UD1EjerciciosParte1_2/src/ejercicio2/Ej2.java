package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		
		Integer total = x % 7;
		total = 7 - total;
		System.out.println("Para ser multiplo de 7 necesita " + total + " más");
		
		sc.close();
	}

}
