package tanda2;
// Edgar Martínez Palmero
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Elige una opción:\r\n"
				+" A- Desglosar segundos\r\n"
				+" B- Número triangular\r\n"
				+" C- Sumatorio\r\n"
				+" D- Factorial\r\n"
				+" E- Salir");
		char opcion = Consola.leeChar();
		while (!((int)opcion >= 65 && (int)opcion <= 69 || (int)opcion >= 97 && (int)opcion <= 101)){
			System.out.println("Opción no valida, escoja una de las opciones validas:\r\n"
					+" A- Desglosar segundos\r\n"
					+" B- Número triangular\r\n"
					+" C- Sumatorio\r\n"
					+" D- Factorial\r\n"
					+" E- Salir");
			opcion = Consola.leeChar();
		}
		while (opcion != 'e' && opcion != 'E') {
			switch(opcion) {
//				A) Desglosar Segundos
				case 'a':
				case 'A':
					System.out.println("Escribe un tiempo en segundos");
					int segundos = Consola.leeInt();
					int minutos, horas;
					horas = segundos/3600;
					minutos = (segundos%3600)/60; 
					segundos = segundos%3600-minutos*60;
					System.out.println("Horas: "+horas);
					System.out.println("Minutos: "+minutos);
					System.out.println("Segundos: "+segundos);
				break;
//				B) Número Triangular
				case 'b':
				case 'B':
					System.out.println("Escribe un número");
					int numero = Consola.leeInt();
					int numeroTriangular = 1, suma = 2, diferenciaArriba = 0, diferenciaAbajo = 0;
					while (numero > numeroTriangular) {
						numeroTriangular = numeroTriangular + suma;
						suma++;
					}
					suma--;
					diferenciaArriba = numeroTriangular - numero;
					diferenciaAbajo = -1*((numeroTriangular - suma) - numero);
					
					if (diferenciaArriba == 0) {
						System.out.println("El número "+numero+" es un número triangular");
					}
					else if(diferenciaArriba < diferenciaAbajo) {
						System.out.println("El número "+numero+" no es un número triangular, el triangular más cercano es: "+numeroTriangular);
					}
					else if(diferenciaArriba > diferenciaAbajo) {
						System.out.println("El número "+numero+" no es un número triangular, el triangular más cercano es: "+(numeroTriangular - suma));	
					}
					else if(diferenciaArriba == diferenciaAbajo) {
						System.out.println("El número "+numero+" no es un número triangular, los triangulares más cercanos son: "+numeroTriangular+ " y "+(numeroTriangular - suma));
					}
				break;
//				C) Sumatorio
				case 'c':
				case 'C':
					System.out.println("Escribe un número");
					int numSumatorio = Consola.leeInt();
					int sumatorio = 0;
					int contadorSumatorio = numSumatorio;
							
					while (contadorSumatorio > 0) {  
					  sumatorio = sumatorio + contadorSumatorio;
					  contadorSumatorio--;
					}
					System.out.println("El Sumatorio de "+numSumatorio+" es: "+sumatorio);
				break;
//				D) Factorial
				case 'd':
				case 'D':
					System.out.println("Escribe un número menor a 20");
					int numFactorial = Consola.leeInt();
					while (numFactorial >= 20) {
						System.out.println("Error: Escribe un número valido");
						numFactorial = Consola.leeInt();
					}
					int sumatorioFactorial = 1;
					int contadorFactorial = numFactorial;
							
					while (contadorFactorial > 0) {  
					  sumatorioFactorial = sumatorioFactorial * contadorFactorial;
					  contadorFactorial--;
					}
					System.out.println("El Factorial de "+numFactorial+" es: "+sumatorioFactorial);
				break;
				
			}
			System.out.println("Elige una opción:\r\n"
					+" A- Desglosar segundos\r\n"
					+" B- Número triangular\r\n"
					+" C- Sumatorio\r\n"
					+" D- Factorial\r\n"
					+" E- Salir");
			opcion = Consola.leeChar();
			while (!((int)opcion >= 65 && (int)opcion <= 69 || (int)opcion >= 97 && (int)opcion <= 101)){
				System.out.println("Opción no valida, escoja una de las opciones validas:\r\n"
						+" A- Desglosar segundos\r\n"
						+" B- Número triangular\r\n"
						+" C- Sumatorio\r\n"
						+" D- Factorial\r\n"
						+" E- Salir");
				opcion = Consola.leeChar();
			}
		}
		System.out.println("Programa Finalizado");
	}
}