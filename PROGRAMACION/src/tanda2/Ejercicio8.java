package tanda2;

public class Ejercicio8 {

	public static void main(String[] args) {
		int nFilas, columna, tabulaciones = 0, contTabulaciones = 0;
		System.out.println("¿Cuántas filas quieres?");
		nFilas = Consola.leeInt();
		while (nFilas > 0) {
			columna = (nFilas);
			while (columna > 0) {
				while (tabulaciones > 0) {
					System.out.print(" ");
					tabulaciones--;
				}
				System.out.print("*");
				columna--;
			}
			contTabulaciones++;
			tabulaciones = contTabulaciones;
			nFilas--;
			System.out.println();	
		}

	}

}
