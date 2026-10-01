package ejercicio9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		System.out.println("Coloca el identificador del problema (N:NN): ");
		Scanner sc = new Scanner(System.in);
		Integer identificador = sc.nextInt();
		
		Integer i = identificador / 100;
		Integer j = identificador % 100;
		
		System.out.println("Estas en el volumen " + i + ", en el problema nº " + ++j);
		
		sc.close();
	}

}
