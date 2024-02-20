package paquete1;

public class Ejercicio2 {

	public static void main(String[] args) {
		char figura;
		float base, altura, arista;
		System.out.println("¿Qué desea, un rectángulo o un cubo? R/C");
		figura = Consola.leeChar();
		if (figura == 'R' || figura == 'r') {
			System.out.println("¿Cuál es la base?");
			base = Consola.leeFloat();
			System.out.println("¿Cuál es la altura?");
			altura = Consola.leeFloat();
			System.out.println("El área del rectángulo es: "+base*altura );
		}
		else {
			if (figura == 'C' || figura == 'c') {
				System.out.println("¿Cuál es la arista del cubo?");
				arista = Consola.leeFloat();
				System.out.println("El área del cubo es: "+6*(arista*arista));
			}
		}
		
	}
}
