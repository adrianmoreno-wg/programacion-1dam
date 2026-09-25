package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Double var1, var2;
		
		System.out.println("Coloca dos numeros:");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextDouble();
		var2 = sc.nextDouble();

		System.out.print("Suma = ");
		System.out.println(var1 + var2);
		
		System.out.print("Resta = ");
		System.out.println(var1 - var2);
		
		System.out.print("Multiplicacion = ");
		System.out.println(var1 * var2);
		
		System.out.print("Division = ");
		System.out.println(var1 / var2);
		
		sc.close();
	}

}
