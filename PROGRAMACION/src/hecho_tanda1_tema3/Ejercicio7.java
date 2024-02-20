package paquete1;

public class Ejercicio7 {

	public static void main(String[] args) {
		int dia, mes, year, totalDias;
		System.out.println("Escribir un día:");
		dia = Consola.leeInt();
		System.out.println("Escribir un mes:");
		mes = Consola.leeInt();
		System.out.println("Escribir un año:");
		year = Consola.leeInt();
		totalDias = 0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			totalDias = totalDias+ (31 - dia);
		}
		else {
			if (mes == 2) {
				if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
					totalDias = totalDias+ (29 - dia);
				}
				else {
					totalDias = totalDias+ (28 - dia);
				}
			}
			else {
				totalDias = totalDias+ (30 - dia);
			}
		}
		mes++;
		while (mes < 13) {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				totalDias = totalDias + 31;
			}
			else {
				if (mes == 2) {
					if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
						totalDias = totalDias+ 29;
					}
					else {
						totalDias = totalDias+ 28;
					}
				}
				else {
					totalDias = totalDias + 30;
				}
			}
			mes++;
		}
		System.out.println("Faltan "+totalDias+" días para fin de año");
	}	
}
