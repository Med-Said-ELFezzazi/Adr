package tanda3;

public class Ejercicio2 {

	public static void main(String[] args) {
		double  total, aux = 1;
		System.out.println("�Cu�nto dinero se desea financiar?");
		int C = Consola.leeInt();
		System.out.println("�Cu�l es el interes anual? 0-100");
		double R = Consola.leeDouble();
		while (R < 1 || R > 100) {
			System.out.println("Interes no valido, introduce un valor valido: 0-100");
			R = Consola.leeInt();
		}
		System.out.println("�En cu�ntos a�os se desea pagar?");
		int a�os = Consola.leeInt();
		int meses = a�os * 12;
		R = R/100;
		aux = (1/(1+R));
		while (meses > 1) {
			aux = aux *((1/(1+R)));
			meses--;
		}
		total = (C*R)/ (1- (aux));
		total = total * (a�os * 12);
		System.out.println(total);
	}

}
