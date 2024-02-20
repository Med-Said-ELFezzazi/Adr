package tanda3;

public class Rombo {

	public static void main(String[] args) {

		System.out.println("Introduce el número de filas");
		int numFilas = Consola.leeInt();
		int contFila = 1;
		while (contFila <= numFilas) {
			// tabulaciones
			for (int j=0; j < numFilas - contFila; j++) {
				System.out.print("*");
			}
			contFila++;
		System.out.println();
		}
		
	}
}