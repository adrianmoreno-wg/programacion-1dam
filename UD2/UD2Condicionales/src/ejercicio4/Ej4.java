package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

//	Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios
//	(comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La aplicación le pedirá al usuario
//	que introduzca el resultado de la suma. La aplicación le indicará si el resultado es correcto o no.
	
	public static void main(String[] args) {

		Random random = new Random();
		Integer num1 = random.nextInt(100) + 1;
		Integer num2 = random.nextInt(100) + 1;
		
		System.out.println(num1 + " + " + num2 + " = X");
		System.out.println("¿Cual es la suma de estos numeros?");
		Scanner sc = new Scanner(System.in);
		Integer total = sc.nextInt();
		if (num1 + num2 == total) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		sc.close();
	}

}
