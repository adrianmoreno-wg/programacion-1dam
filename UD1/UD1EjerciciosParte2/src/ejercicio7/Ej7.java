package ejercicio7;

import java.util.Random;

public class Ej7 {

	public static void main(String[] args) {

		Random random = new Random();
		Integer i = random.nextInt(100);
		Double j = random.nextDouble();
		Boolean m = random.nextBoolean();
		
		System.out.println("N. Entero = " + ++i );
		System.out.println("N. Real = " + j);
		System.out.println("Boolean = " + m);
	}

}
