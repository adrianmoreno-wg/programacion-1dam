package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		Integer var1;
		
		System.out.println("Escribe un numero:");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextInt();
		
		var1 = var1 % 2;
		
		if (var1 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		sc.close();
	}

}
