package tema4_1;


public class Biblioteca {
	static boolean esPar(int num) {
		if (num%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	static int cantidadDigitos(long num) {
		int cantDigitos = 0;
		while (num > 0) {
			num/=10;
			cantDigitos++;
		}
		return cantDigitos;
	}
	
	static boolean esLargo(long num) {
		if (cantidadDigitos(num) > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	static void tipoNumero(int num){
		if (num%10 == 0) {
			System.out.println("Es múltiplo de 10");
		} else {
			System.out.println("No es múltiplo de 10");
		}
	}
	
	static boolean sonSimilares (Casa c1, Casa c2) {
		if ((c1.tipo == c2.tipo) && (c1.superficie == c2.superficie)) {
			return true;
		} else
			return false;
	}
	
	static Casa casaMasGrande(Casa c1, Casa c2) {
		if (c1.superficie==c2.superficie) {
			return null;
		} else if(c1.superficie > c2.superficie) {
			return c1;
		} else {
			return c2;
		}
		
	}
	
	public static void main(String[] args) {
		//esPar
		System.out.println("Introduce un número para ver si es par");
		int numEsPar = Consola.leeInt();
		System.out.println(esPar(numEsPar));
		
		//cantidadDigitos
		System.out.println(cantidadDigitos(123456));
		
		//esLargo
		System.out.println(esLargo(777777));
		
		//tipoNumero
		System.out.println("Introduce un número para ver su tipo");
		int numTipo = Consola.leeInt();
		tipoNumero(numTipo);
		
		//sonSimilares
		Casa c1 = new Casa("C/Rioja, 24", 25, 'p');
		Casa c2 = new Casa("C/Alava, 12", 50, 'u');
		System.out.println(sonSimilares(c1, c2));
		//casaMasGrande
		if (casaMasGrande(c1, c2) == null) {
			System.out.println("Ambas casas tienen la misma superficie");
		} else {
			casaMasGrande(c1, c2).mostrar();
		}
	}
}
