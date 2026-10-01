package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		System.out.println("Coloca una cantidad de segundos: ");
		Scanner sc = new Scanner(System.in);
		Integer s = sc.nextInt();
		
		Integer min = (s % 3600) / 60;
		Integer h = s / 3600;
		s = (s % 3600) % 60;
		
		System.out.println("Eso son " + h + " horas, " + min + " minutos y " + s + " segundos");
		
		sc.close();
	}

}
