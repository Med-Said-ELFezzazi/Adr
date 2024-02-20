package paquete1;

public class Ejercicio12 {

	public static void main(String[] args) {
		System.out.println("Introduce la cantidad de numeros");
		int numerofilas=Consola.leeInt();
		int valorInicial = numerofilas*10;
		int aux;
		int cont = numerofilas;
				for(int contFila=1; contFila<=numerofilas; contFila++) {
					aux = valorInicial;
					for(int contColumna=contFila; contColumna>0; contColumna--) {
						System.out.print(aux+"\t");
						aux=aux-cont;
					}
					System.out.println();
					valorInicial = valorInicial-10;
					cont = cont-1;
				}
	}
}