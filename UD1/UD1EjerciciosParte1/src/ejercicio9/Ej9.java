package ejercicio9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		Integer var1;
		
		System.out.println("Escribe tu edad:");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextInt();
		
		if (var1 >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		sc.close();
	}

}
