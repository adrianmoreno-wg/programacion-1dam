package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {
	// EJERCICIO 1. La taquilla del cine
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		Integer precio = null;
		Integer descuento = 0;

		if (edad < 0) {
			return -1;
		} else if (edad < 12 || edad > 65) {
			descuento += 3;
		}

		switch (dia.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
			precio = 8;
			break;
		case "viernes":
			precio = 10;
			break;
		case "sabado":
		case "domingo":
			precio = 12;
			break;
		default:
			return -1;
		}

		if (socio) {
			descuento += 2;
		}

		return precio - descuento;
	}

	// EJERCICIO 2. Dibujar una Z con asteriscos
	public static void dibujarZ(Integer lado) {
		for (Integer i = 0; i < lado; i++) {		// Bucle inicial para cambiar de fila
			for (Integer j = 0; j < lado; j++) {	// Bucle para que dentro de una fila se imprima el mismo valor x veces
				if (i == 0 || i == lado - 1) { 		// If para rellenar por completo la primera y ultima fila de Z
					System.out.print("*");
				} else if (lado == 1) {
					System.out.print("*");
					break;
				} else if (lado == 0) {
					break;
				} else if (j == lado - i - 1) {		// Else If para saber donde colocar exactamente el asterisco entre las filas de la Z. Debe hacerlo solo una vez.
					System.out.print("*");
				} else {							// Else para rellenar todos los demas espacios.
					System.out.print(" ");			
				}
			}
			System.out.println();
		}
	}
	
	// EJERCICIO 3. Suma de números especiales
	public static Integer sumaPrimeroEspeciales(Integer inicio, Integer fin, Integer cantidad) {
		Integer suma = 0;
		for (; inicio <= fin; inicio++) {
				for (Integer i = 0; i < cantidad;) {
					if (Utiles.esPrimo(inicio) || Utiles.esPerfecto(inicio)) {
						suma += inicio;
						suma++;
					}
				}
			}
		return suma;
	}
	
	// EJERCICIO 4. Factorial con saltos
	public static Integer factorialConSaltos(Integer numero, Integer salto) {
		Integer total = 1;							// Total debe de empezar por 1 para no dar resultados erroneos
		while (numero > 0) {
			total *= numero;						
			numero = numero - salto;				
		}
		return total;
	}
	
	// EJERCICIO 5. Detectar picos de una ruta
	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
		Integer numeroPosiciones = alturas.size();
		Integer picos = 0;
		
		if (numeroPosiciones < 3) {
			picos = 0;
		} else {
			for (Integer i = 0; i < numeroPosiciones; i++) {
				if (alturas.get(i - 1) < alturas.get(i) && alturas.get(i + 1) < alturas.get(i)) {
					picos += 1;
					for (Integer j = diferenciaMinima; j > 0; j--) {
						i++;
					}
				}
			}
		}
		
		return picos;
	}
}
