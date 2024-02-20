package tanda2;

import paquete1.Consola;

public class SeriePizarra {

	public static void main(String[] args) {
		//	10	8	4	-2	-10	-20	-32	-46
		//	20	23	27	32	38	45	53
		//	18	14	6	-6	-22	-42
		//	54	29	65	72	80
		//	51	45	33	15
		//	204	211	219
		//	200	192
		//	1000
		System.out.println("Introduce la cantidad de filas");
		int numeroFilas=Consola.leeInt();
		int valorInicial = 10;
		int aux , SWcolumnas = 1, SWfilas = 1, diferenciaCol=2, resta = 2, contDiferenciaCol=2, diferencia = 2;
				for(int contFila=0; contFila<numeroFilas; contFila++) {
					
					aux = valorInicial;
					switch (SWcolumnas) {
						case 1:
							for(int contColumna = numeroFilas - contFila; contColumna > 0; contColumna--) {
								System.out.print(aux+"\t");
								aux=aux-resta;
								resta = diferenciaCol + resta;
							}
							break;
						case -1:
							for(int contColumna = numeroFilas - contFila; contColumna > 0; contColumna--) {
								System.out.print(aux+"\t");
								aux=aux + diferenciaCol;
								diferenciaCol++;
							}
							break;
					}
					switch (SWfilas) {
						case 1:
							valorInicial = valorInicial*(diferencia);
							SWfilas = 0;
							break;
							
						case 0:
							valorInicial = valorInicial - (diferencia);
							SWfilas = 1;
							diferencia = diferencia + 1;
							break;
					}
					diferenciaCol = contDiferenciaCol + 2;
					resta = diferenciaCol;
					SWcolumnas = SWcolumnas * -1;
					System.out.println();
					
				}
	}

}
