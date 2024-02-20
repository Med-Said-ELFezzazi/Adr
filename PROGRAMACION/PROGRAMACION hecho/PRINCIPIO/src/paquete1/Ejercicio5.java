package paquete1;

public class Ejercicio5 {

	public static void main(String[] args) {
		int dia, mes, year;
		dia = 0;
		mes = 0;
		System.out.println("Escribe el día:");
		dia = Consola.leeInt();
		System.out.println("Escribe el mes:");
		mes = Consola.leeInt();
		System.out.println("Escribe el año:");
		year = Consola.leeInt();
		switch (mes)
		{
		case 1: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Enero");
			}
			else
			System.out.println(dia+" de Enero del "+year);
			break;
			
		case 2: 
			if (dia < 1 || dia > 29) {
				System.out.println("Este día no existe en el mes de Febrero");
			}
			else
				if (dia == 29){
					if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
						System.out.println(dia+" de Febrero del "+year);
					}
					else
						System.out.println("El día 29 de Febrero no existe en el año "+ year);
				}
				else
					System.out.println(dia+" de Febrero del "+year);
			break;
			
		case 3: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Marzo");
			}
			else
			System.out.println(dia+" de Marzo del "+year);
			break;
			
		case 4: 
			if (dia < 1 || dia > 30) {
				System.out.println("Este día no existe en el mes de Abril");
			}
			else
			System.out.println(dia+" de Abril del "+year);
			break;
			
		case 5: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Mayo");
			}
			else
			System.out.println(dia+" de Mayo del "+year);
			break;
			
		case 6: 
			if (dia < 1 || dia > 30) {
				System.out.println("Este día no existe en el mes de Junio");
			}
			else
			System.out.println(dia+" de Junio del "+year);
			break;
			
		case 7: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Julio");
			}
			else
			System.out.println(dia+" de Julio del "+year);
			break;
		
		case 8: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Agosto");
			}
			else
			System.out.println(dia+" de Agosto del "+year);
			break;	
			
		case 9: 
			if (dia < 1 || dia > 30) {
				System.out.println("Este día no existe en el mes de Septiembre");
			}
			else
			System.out.println(dia+" de Septiembre del "+year);
			break;
			
		case 10: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Octubre");
			}
			else
			System.out.println(dia+" de Octubre del "+year);
			break;
			
		case 11: 
			if (dia < 1 || dia > 30) {
				System.out.println("Este día no existe en el mes de Noviembre");
			}
			else
			System.out.println(dia+" de Noviembre del "+year);
			break;
		
		case 12: 
			if (dia < 1 || dia > 31) {
				System.out.println("Este día no existe en el mes de Diciembre");
			}
			else
			System.out.println(dia+" de Diciembre del "+year);
			break;
		default: System.out.println("El mes "+mes+" no existe");
		}
	}

}
