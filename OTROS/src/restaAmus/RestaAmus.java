package restaAmus;

public class RestaAmus {

//	Intentando impresionar a su profesor, Alonso y Aldonza se han inventado un extraño juego con números. Se comienza con un valor positivo cualquiera seleccionado aleatoriamente. A partir de entonces, en cada turno los contrincantes deciden qué número jugar, y lo utilizan para modificar ese valor. La modificación se realiza restando el número elegido, y sumando ese mismo número tras invertir sus dígitos. Si resultara que el número elegido fuera menor que el opuesto, el proceso sería contrario, restándose el opuesto y sumándose el original, para garantizar que el valor final nunca crezca. Esto es importante, porque gana el jugador que tras modificar el número llega a cero; además, no se permite realizar una jugada que haga que el valor final quede por debajo. Se han tomado la libertad incluso de darle un nombre: "resta y amus" (suma, al revés).
//
//	Por ejemplo, en una partida han empezado con el número 36. Aldonza ha jugado el número 21, por lo que ha restado 21 y ha sumado 12, llegando al 27. Alonso, mucho más bruto, ha decidido jugar el 68. El opuesto es el 86, que es mayor, por lo que ha restado 86 y ha sumado 68, dando 9. Finalmente, Aldonza ha jugado el 10, alcanzando el buscado 0 que le ha dado la victoria.
//
//	Por desgracia, tras jugar unas cuantas veces se han dado cuenta de que en la mayor parte de las partidas no son capaces de terminar en 0, y quedan en tablas. Desconcertados, han ido a pedir ayuda a Miguel, su profesor, para que les cuente cómo conseguir llegar a 0 o, al menos, con qué números empezar para garantizar que no terminarán en tablas.
//
//	Miguel, hombre de rostro aguileño, barbas de plata y más de pluma que de números, no les ha hecho mucho caso y los pobres críos andan por los caminos buscando algún bachiller que les ayude.
//
//	Entrada
//	La entrada al programa estará compuesta por múltiples casos de prueba. Cada uno será un número candidato a constituir el inicio de una partida del juego Resta y amus, mayor que 0 y menor que 231. Los valores de los números que los niños pueden jugar en cada turno no tienen límite, aunque no podrán ser negativos.
//
//	La entrada terminará con un 0, que no deberá procesarse.
//
//	Salida
//	Para cada caso de prueba, el programa escribirá SI si el número es válido para una partida del juego, de modo que se garantice que hay al menos un modo de llegar a 0 y no terminar en tablas. En otro caso se escribirá NO (sin las comillas).
	
	// nInvertido > x ---> n = (n - x) + nInvertido 
	// x > nInvertido ---> n = (n - nInvertido) + x
	
	public static Boolean esGanable(Integer n) {
		Boolean ganable;
	
		return true;
		
	}
}
