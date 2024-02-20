package tema4_1;

public class BiblioStatic {

	static void verMultiplos5(int n1, int n2){
		int auxMenor, auxMayor, contMultiplos = 0;
		if (n1 > n2) {
			auxMenor = n2;
			auxMayor = n1;
		} else {
			auxMenor = n1;
			auxMayor = n2;
		}
		while (auxMenor <= auxMayor) {
			if (auxMenor % 5 == 0) {
				System.out.print(auxMenor+",");
				contMultiplos++;
			}
			auxMenor++;
		}
		if (contMultiplos == 0) {
			System.out.println("No hay ningun multiplo de 5 entre "+n1+ " y "+ n2);
		}
		System.out.println();
	}
	
	static int tipoCaracter(char caracter) {
		if (caracter >= 'A' && caracter <= 'Z') {
			return 1;
		} else {
			if (caracter >= 'a' && caracter <= 'z') {
				return 2;
			} else {
				return 3;
			}
		}
	}
	
	static double calcularPotencia(double X, int n) {
		double potencia=1;
		for (int aux = 1; aux <= n; aux++) {
			potencia = potencia * X;
		}
		return potencia;
	}
	
	static int sumatorio(int n) {
		int sumatorio=0;
		for (int aux = 1; aux <= n; aux++) {
			sumatorio+=aux;
		}
		return sumatorio;
	}
	
	static void verTabla(int n) {
		for (int j=1; j<=10; j++) {
			System.out.println(n+"x"+j+"="+n*j);
		}
	}
	
	static void verTablaRestingida(int n) {
		if (n >= 1 && n <= 20) {
			for (int j=1; j<=10; j++) {
				System.out.println(n+"x"+j+"="+n*j);
			}
		} else if (n < 0){
			System.out.println("No se puede calcular la tabla del número "+n);
		} else {
			System.out.println("FIN");
		}
	}
	
	public static void main(String[] args) {
		//verMultiplos5
		int n1=1, n2=1;
		while (n1 != 0 && n2 != 0) {
			System.out.println("Introduce un número");
			n1 = Consola.leeInt();
			System.out.println("Introduce otro número");
			n2 = Consola.leeInt();
			if (n1 != 0 && n2 != 0) {
				verMultiplos5(n1, n2);
			} else {
				System.out.println("FIN");
			}
		}
		//tipoCaracter
		char caracter;
		for (int j=1; j<=5; j++) {
			System.out.println("Introduce un carácter");
			caracter = Consola.leeChar();
			System.out.println(tipoCaracter(caracter));
		}
		//calcularPotencia
		int n;
		System.out.println("Introduzca el exponente para la base 7");
		n = Consola.leeInt();
		System.out.println(calcularPotencia(7, n));
		//Fórmula

		System.out.println("Introduce un número para calcular la formula");
		double numFormula = Consola.leeInt();
		double suma = 0;
		for (int aux = 1 ; aux <= 8; aux++) {
			suma = suma + ((calcularPotencia(numFormula, aux)/sumatorio(aux)));
		}
		System.out.println(suma);
		//verTabla
		int tabla = 5;
		System.out.println("Introduce un número entre el 1 y el 10");
		tabla = Consola.leeInt();
		verTabla(tabla);
		//verTablaRestringida
		int tablaRestringida = 1;
		while (tablaRestringida != 0) {
			if (tablaRestringida != 0) {
				System.out.println("Introduce un número");
				tablaRestringida = Consola.leeInt();
				verTablaRestingida(tablaRestringida);
			}
		}
	}
}
