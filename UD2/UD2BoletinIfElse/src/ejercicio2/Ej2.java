package ejercicio2;

public class Ej2 {

	public static void main(String[] args) {

		Integer i = 2;
		Integer j = 4;
		Integer m = 6;
		Integer n;
		if (i >= j && i >= m) {
			n = i;
		} else if (j >= i && j >= m) {
			n = j;
		} else {
			n = m;
		}
		
		System.out.println("El mayor es: " + n);
	}

}
