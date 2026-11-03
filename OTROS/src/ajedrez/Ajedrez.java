package ajedrez;

public class Ajedrez {

	// Mostrar los movimientos de cada una de las piezas de ajedrez en un tablero de 8x8

	public static void main(String[] args) {

		alfil(4, 5);
		System.out.println();
		dama(4, 5);
	}

	private static void alfil(Integer columna, Integer fila) {
		for (Integer i = 1; i <= 8; i++) {
			for (Integer j = 1; j <= 8; j++) {
				if (i + j == columna + fila || i - columna == j - fila) {
					System.out.print("X");
				} else if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
					System.out.print("■");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	private static void dama(Integer columna, Integer fila) {
		for (Integer i = 1; i <= 8; i++) {
			for (Integer j = 1; j <= 8; j++) {
				if (i + j == columna + fila || i - columna == j - fila || i == columna || j == fila) {
					System.out.print("X");
				} else if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
					System.out.print("■");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
