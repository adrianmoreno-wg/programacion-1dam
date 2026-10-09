package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		System.out.println("Coloca un numero:");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		for (Integer i = 1; num >= i; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
