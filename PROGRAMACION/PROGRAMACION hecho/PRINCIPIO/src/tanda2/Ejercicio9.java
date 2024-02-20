package tanda2;

public class Ejercicio9 {

	public static void main(String[] args) {

		System.out.println("¿Cuántas filas quieres?");
		int numFilas = Consola.leeInt();
		int contFila = 1;
		int aux = 1;
		int dibujo = 0, dibujo2 = 0;
		char letra = 'A', letraCentro = 'A', letraDescendente;
		while (numFilas > 0) {
			while (aux <= numFilas - contFila) {
				System.out.print("\t");
				aux++;
			}
			aux = 1;
			while (aux <= dibujo) {
				System.out.print("\t"+letra);
				letra++;
				aux++;
			}
			dibujo++;
			aux = 1;
			System.out.print("\t"+letraCentro);
			letraDescendente = letraCentro;
			letraDescendente--;
			while (aux <= dibujo2) {
				System.out.print("\t"+letraDescendente);
				letraDescendente--;
				aux++;
			}
			aux = 1;
			dibujo2++;
			letra = 'A';
			letraCentro++;
			System.out.println();
			numFilas--;
		}
	}

}
