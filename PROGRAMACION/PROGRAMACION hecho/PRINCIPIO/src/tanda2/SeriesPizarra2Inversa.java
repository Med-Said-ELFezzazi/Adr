package tanda2;

public class SeriesPizarra2Inversa {

	public static void main(String[] args) {
		int nFilas, columna, tabulaciones, contTabulaciones;
		System.out.println("¿Cuántas filas quieres?");
		nFilas = Consola.leeInt();
		int contFilas = 1;
		tabulaciones = nFilas;
		contTabulaciones = nFilas;
		while (nFilas > 0) {
			columna = contFilas;
			while (columna > 0) {
				while (tabulaciones > 0) {
					System.out.print(" ");
					tabulaciones--;
				}
				System.out.print("*");
				columna--;
			}
			contFilas = contFilas + 2;
			contTabulaciones--;
			tabulaciones = contTabulaciones;
			nFilas--;
			System.out.println();	
		}

	}

}
