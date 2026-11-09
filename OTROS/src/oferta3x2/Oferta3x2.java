package oferta3x2;

import java.util.ArrayList;
import java.util.List;

public class Oferta3x2 {

//	https://aceptaelreto.com/problem/statement.php?id=650&potw=1

//	En mi librería favorita, un día al año sacan una oferta de 3×2: por cada tres libros que compras te regalan uno, el de menor precio. Yo espero
//	ansioso a que llegue ese día y entonces compro todos los libros que puedo.
//	El año pasado compré libros que valían 40, 35, 30, 25, 20, 15 y 10 euros, por los que pagué 150 euros, obteniendo
//	un descuento total de 25 euros, ya que la librería utiliza un sistema estricto (¡y muy ventajoso para ella!)a la hora de seleccionar los libros que te regala: son siempre los de menor precio del lote.
//	Pero después me di cuenta de que si hubiera ido a comprar varias veces podría haber obtenido un descuento mayor.
//	Por ejemplo, si primero hubiera comprado los libros con precios 40, 35, 30 y 25, me habrían regalado el de 25, y al comprar después el resto me hubieran regalado el que valía 10, obteniendo un descuento total de 35 euros.
//	¿Puedes ayudarme a decidir cómo debería comprar los libros que quiero este año para ahorrarme lo máximo posible?
//			
//	Entrada
//	El programa deberá encontrar la solución a diferentes casos de prueba. Cada caso consta de dos líneas. En la primera aparece el número (entre 1 y 1.000)
//	de libros que quiero comprar. En la segunda aparecen los precios de los libros (entre 1 y 10.000), separados por espacios.
//	
//	Salida
//	Para cada lote de libros se escribirá el descuento máximo que puedo obtener si me aprovecho de repartirlos en varias compras.

	public static Integer oferta(List<Integer> precio) {

		Integer n = precio.size() / 3;
		Integer descuento = 0;
		List<Integer> valores = new ArrayList<>(precio);
		
		for (Integer i = 0; i < n; i++) {
			Integer valorMinimo = Integer.MAX_VALUE;
			
			for (Integer j : valores) {
				if (valorMinimo > j) { 
						valorMinimo = j;
				}
			}
			
			descuento += valorMinimo;
			valores.remove(valorMinimo);
		}
		
		return descuento;
	}
	
}
