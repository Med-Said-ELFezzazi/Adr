package paquete1;

public class Ejercicio2 {

	public static void main(String[] args) {
		char figura;
		float base, altura, arista;
		System.out.println("�Qu� desea, un rect�ngulo o un cubo? R/C");
		figura = Consola.leeChar();
		if (figura == 'R' || figura == 'r') {
			System.out.println("�Cu�l es la base?");
			base = Consola.leeFloat();
			System.out.println("�Cu�l es la altura?");
			altura = Consola.leeFloat();
			System.out.println("El �rea del rect�ngulo es: "+base*altura );
		}
		else {
			if (figura == 'C' || figura == 'c') {
				System.out.println("�Cu�l es la arista del cubo?");
				arista = Consola.leeFloat();
				System.out.println("El �rea del cubo es: "+6*(arista*arista));
			}
		}
		
	}
}
