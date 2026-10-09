package ejercicio4;

public class Ej4 {

	public static void main(String[] args) {

		final Integer N = 10;
		Integer total = 0;
		Integer impar = 0;
		
		for (Integer i = 0; impar < N; i++) {
			if (i % 2 != 0) {
				total += i;
				impar++;
			}
		}
		
		System.out.println("Total impares: " + total);
	}

}
