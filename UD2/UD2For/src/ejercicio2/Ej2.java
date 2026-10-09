package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero:");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		for (Integer i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
