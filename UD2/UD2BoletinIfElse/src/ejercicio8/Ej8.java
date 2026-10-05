package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		System.out.println("Coloca tres numeros enteros:");
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer z = sc.nextInt();
		Boolean esNum = false;
		
		if (x + y == z || y + z == x || z + x == y) {
			esNum = true;
		}
		
		System.out.println(esNum);
		
		sc.close();
	}

}
