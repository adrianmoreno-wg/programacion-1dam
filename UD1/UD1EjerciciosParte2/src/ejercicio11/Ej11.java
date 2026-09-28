package ejercicio11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		System.out.println("Coloque su edad: ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		System.out.println("¿Tienes permiso de conducir?(true/false)");
		Boolean j = sc.nextBoolean();
		System.out.println("¿Tienes alguna sancion que te impida conducir?(true/false)");
		Boolean m = sc.nextBoolean();
		
		Boolean n = i >= 18 && j && m != true;
		
		System.out.println(n);
		
		sc.close();
	}

}
