package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Coloca los segundos que desea calcular: ");
		Scanner sc = new Scanner(System.in);
		Integer s = sc.nextInt();
		
		Integer min = s / 60;
		Integer h = min / 60;
		s = s % 60;
		
		System.out.println("Eso son " + h + " horas(h), " + min + " minutos(min) y " + s + " segundos");
		
		sc.close();
	}

}
