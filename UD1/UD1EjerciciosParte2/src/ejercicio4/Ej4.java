package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero real: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
				
		System.out.println("N. Entero inferior = " + Math.floor(i));
		System.out.println("N. Entero superior = " + Math.ceil(i));
		System.out.println("N. Entero redondeado = " + Math.round(i));
		
		sc.close();
	}

}
