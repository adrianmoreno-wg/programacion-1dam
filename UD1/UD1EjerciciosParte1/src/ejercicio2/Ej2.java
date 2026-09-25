package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Coloca tu edad:");
		
		Scanner sc = new Scanner(System.in);
		Integer num;
		num = sc.nextInt();
		
		System.out.print("El año que viene cumples ");
		System.out.print(num + 1);
		
		sc.close();
	}

}
