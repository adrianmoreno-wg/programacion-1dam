package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		String nombre;
		Integer edad;
		
		System.out.println("Coloca tu nombre y luego tu edad:");
		
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		edad = sc.nextInt();
		
		System.out.print("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		sc.close();
	}

}
