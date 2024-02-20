package tanda2;

public class SeriesPizarra2 {

	public static void main(String[] args) {
		int nFilas, columna, tabulaciones = 0, contTabulaciones = 0;
		System.out.println("¿Cuántas filas quieres?");
		nFilas = Consola.leeInt();
		while (nFilas > 0) {
			columna = (nFilas * 2) -1;
			while (columna > 0) {
				while (tabulaciones > 0) {
					System.out.print("\t");
					tabulaciones--;
				}
				System.out.print("*\t");
				columna--;
			}
			contTabulaciones++;
			tabulaciones = contTabulaciones;
			nFilas--;
			System.out.println();	
		}
	}

}
