package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero real:");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		System.out.println("Valor absoluto = " + Math.abs(i));
		System.out.println("Raiz cuadrada = " + Math.sqrt(i));
		
		sc.close();
	}

}
