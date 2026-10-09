package ejercicio5;

import java.util.Scanner;

public class Ej5 {

//	Determinar el precio de un billete de tren, conociendo la distancia a recorrer,
//	y sabiendo que si el número de días de estancia es superior a 7 y la distancia superior 
//	a 800 km el billete tiene una reducción del 30%. El precio por kilómetro es de 2,5€.
//	La distancia a recorrer y el número de días de estancia los debes solicitar al usuario
//	por teclado.
	
	public static void main(String[] args) {

		System.out.println("Distancia a recorrer:");
		Scanner sc = new Scanner(System.in);
		Double distancia = sc.nextDouble();
		System.out.println("Dias de estancia:");
		Double dias = sc.nextDouble();
		
		Double total = 2.5 * distancia;
		
		if (distancia > 800 && dias > 7) {
			total = total * 0.7;
		}
		
		System.out.println("Precio del billete: " + total);
		
		sc.close();
	}

}
