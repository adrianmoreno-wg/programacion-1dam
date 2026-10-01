package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		System.out.println("Coloca dos numeros enteros: ");
		Scanner sc = new Scanner(System.in);
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		
		Integer total = num1 % num2;
		total = num2 - total;
		System.out.println("Para ser multiplo de " + num2 + " necesita " + total + " más");
		
		sc.close();
	}

}
