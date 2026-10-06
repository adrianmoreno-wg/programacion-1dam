package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		System.out.println("Coloque un numero del 1 al 7, correspondido a un numero de la semana:");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero incorrecto");
		}
		
		sc.close();
	}

}
