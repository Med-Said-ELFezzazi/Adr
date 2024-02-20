package tanda2;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num = 1, diasMes = 31;
		System.out.println("Introduce un mes (1-12):");
		int mes = Consola.leeInt();
		while (mes < 1 || mes > 12) {
			System.out.println("Mes no valido, introduce un mes valido (1-12): ");
			mes = Consola.leeInt();
		}
		System.out.println("¿En que día de la semana comienza? (1-7)");
		int comienzo = Consola.leeInt();
		while (comienzo < 1 || comienzo > 7) {
			System.out.println("Día no valido, introduce un día valido (1-7)");
			comienzo = Consola.leeInt();
		}
		
		int aux = 1;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			diasMes = 31;
		} else if (mes == 2) {
			diasMes = 28;
		} else {
			diasMes = 30;
		}
		switch (mes){
		case 1: 
			System.out.println("Enero");
		break;
		case 2: 
			System.out.println("Febrero");
			diasMes = 28;
			break;
		case 3: 
			System.out.println("Marzo");
		break;
		case 4: 
			System.out.println("Abril");
			diasMes = 30;
			break;
		case 5: 
			System.out.println("Mayo");
			break;
		case 6: 
			System.out.println("Junio");
			diasMes = 30;
			break;
		case 7: 
			System.out.println("Julio");
			break;
		case 8: 
			System.out.println("Agosto");		
		break;
		case 9: 
			System.out.println("Septiembre");
			diasMes = 30;
		break;
		case 10: 
			System.out.println("Octubre");
		break;
		case 11: 
			System.out.println("Noviembre");
			diasMes = 30;
		break;
		case 12: 
			System.out.println("Diciembre");
		break;
		}
		System.out.println("\tL\tM\tX\tJ\tV\tS\tD");
		while (aux < comienzo) {
			System.out.print("\t*");
			aux++;
		}
		while (num <= diasMes) {
			while (aux <= 7 && num <= diasMes) {
				System.out.print("\t"+num);
				aux ++;
				num ++;
			}
			System.out.println();
			aux = 1;
		}
	}
}