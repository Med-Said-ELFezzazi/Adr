package tanda3;

public class Ejercicio5 {
	public static void main(String[] args) {
		System.out.println("Introduce el número de filas");
		int nFilas = Consola.leeInt();
		int columna = 3;
		int contFilas = 1;
		int numInicial = 1;
		int auxNum = numInicial;
		int sumatorio;
		int sw = 1;
		while (contFilas <= nFilas) {
			int aux = contFilas - 1;
			sumatorio = contFilas;
			while (aux > 0) {
				System.out.print("\t");
				aux--;
			}
			aux = 0;
			while (aux < columna) {
				System.out.print(auxNum+"\t");
				auxNum = auxNum + sumatorio;
				sumatorio++;
				aux++;
			}
			if (sw == 1) {
				numInicial = numInicial + 1;
				sw = 0;
			} else {
				numInicial = numInicial * 3;
				sw = 1;
			}
			auxNum = numInicial;
			columna++;
			contFilas++;
			System.out.println();
		}
	}
}