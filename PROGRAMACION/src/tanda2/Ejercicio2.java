package tanda2;

public class Ejercicio2 {
	public static void main(String[] args) {
		final int N = 1;
		int numeroEmpleados, ingresos, tasas = 0, descuento, empresasIntroducidas = 1;
		while (empresasIntroducidas <= N){
			System.out.println("�Cu�ntos empleados tiene la empresa n�mero "+empresasIntroducidas+ "?");
			numeroEmpleados = Consola.leeInt();
			System.out.println("�Cu�ntos ingresos tiene la empresa n�mero "+empresasIntroducidas+ "?");
			ingresos = Consola.leeInt();
			empresasIntroducidas++;
			if (numeroEmpleados >= 1 && numeroEmpleados <=2) {
				tasas = (ingresos * 10) / 100;
			}
			else if (numeroEmpleados >= 3 && numeroEmpleados <=5) {
				tasas = (ingresos * 10) / 100;
				descuento = (tasas * 7)/100;
				descuento = descuento * numeroEmpleados;
				tasas = tasas - descuento;
			}
			else if(numeroEmpleados >= 6) {
				tasas = (ingresos * 10) / 100;
				descuento = (tasas * 10)/100;
				descuento = descuento * numeroEmpleados;
				tasas = tasas - descuento;
			}
			if (tasas <= 0) {
				System.out.println("La empresa n�mero "+empresasIntroducidas+" no tiene que pagar ninguna tasa");
			}
			else {
				System.out.println("La empresa n�mero "+empresasIntroducidas+" tiene que pagar una tasa de: "+tasas);
			}
		}
	}
}
