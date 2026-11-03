package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {

		System.out.println("---EJERCICIOS---");
		System.out.println("\n1. La taquilla del cine");
		System.out.println(Ejercicios.precioEntrada(10, "SABADO", true)); // 7
		System.out.println(Ejercicios.precioEntrada(35, "LUNES", false)); // 8
		System.out.println(Ejercicios.precioEntrada(66, "VIERNES", true)); // 5
		System.out.println(Ejercicios.precioEntrada(-1, "LUNES", false));

		System.out.println("\n2. Dibujar una Z con asteriscos");
		Ejercicios.dibujarZ(5);
		System.out.println();
		Ejercicios.dibujarZ(3);
		System.out.println();
		Ejercicios.dibujarZ(1);
		System.out.println();
		Ejercicios.dibujarZ(0);
		
		System.out.println("\n3. Suma de numeros especiales");

		
		System.out.println("\n4. Factorial con saltos");
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		System.out.println(Ejercicios.factorialConSaltos(8, 3));
		System.out.println(Ejercicios.factorialConSaltos(5, 1));
		System.out.println(Ejercicios.factorialConSaltos(0, 2));
		
		System.out.println("\n5. Detectar picos de una ruta");
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2));
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 4, 7, 4), 3));
	}
}
