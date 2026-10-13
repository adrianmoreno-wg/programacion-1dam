package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		System.out.println("Escribe un numero: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		Integer total = 1;
		
		for (Integer i = 1; i < N; i++) {
			total *= i;;
		}
		
		System.out.println("Total factorial = " + total);
		
		sc.close();
	}

}
