package ejercicio2;

import java.util.Scanner;

//Utiliza un operador ternario para calcular el valor absoluto de un número que se
//solicita al usuario por teclado.

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Escribe un numero:");
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble();
		
		x = x >= 0 ? x : x * -1;
		
		System.out.println("Su numero absoluto es: " + x);
		
		sc.close();
	}

}
