package paquete1;

public class Ejercicio6 {

	public static void main(String[] args) {
		int year1, year2, auxiliar;
		System.out.println("Escribe un año:");
		year1 = Consola.leeInt();
		System.out.println("Escribe otro año:");
		year2 = Consola.leeInt();
		if (year1 == year2) {
			System.out.println("No hay ningun año bisiesto entre "+year1+" y "+year2);
		}
		else {
			if (year1 > year2) {
				auxiliar = year1;
				year1 = year2;
				year2 = auxiliar;
			}
			auxiliar = year1 + 4;
			while ((year1%4 != 0) && (year1%400 != 0) && (year1 < year2)) {
				year1++;
			}
			if ((year1 % 4 == 0) && ((year1 % 100 != 0) || (year1 % 400 == 0))) {
				while (auxiliar < year2) {
					System.out.println(auxiliar);
					auxiliar = auxiliar + 4;
				}
			}
			
		}
	}
}
