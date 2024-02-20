package tanda2;

public class HorasIntervalo {

	public static void main(String[] args) {
		int horaInicio, horaFin, minutoInicio, minutoFin, horaIntervalo, minutoIntervalo;
		System.out.println("Introduce la Hora de Inicio");
		horaInicio = Consola.leeInt();
		while (horaInicio < 0 || horaInicio > 23) {
			System.out.println("Hora Inicio no valida, introduce una hora valida");
			horaInicio = Consola.leeInt();
		}
		System.out.println("Introduce el Minuto de Inicio");
		minutoInicio = Consola.leeInt();
		while (minutoInicio < 0 || minutoInicio > 59) {
			System.out.println("Minuto Inicio no valido, introduce un minuto valido");
			minutoInicio = Consola.leeInt();
		}
		System.out.println("Introduce la Hora de Fin");
		horaFin = Consola.leeInt();
		while (horaFin < 0 || horaFin > 23) {
			System.out.println("Hora Fin no valida, introduce una hora valida");
			horaFin = Consola.leeInt();
		}
		System.out.println("Introduce el Minuto de Fin");
		minutoFin = Consola.leeInt();
		while (minutoFin < 0 || minutoFin > 59) {
			System.out.println("Minuto Fin no valido, introduce un minuto valido");
			minutoFin = Consola.leeInt();
		}
		while (horaInicio > horaFin) {
			System.out.println("La hora de Inicio es mayor que la hora de fin, introduce otra hora de inicio");
			horaInicio = Consola.leeInt();
		}
		if (horaInicio == horaFin) {
			while (minutoInicio > minutoFin) {
				System.out.println("El tiempo de inicio es superior al tiempo de fin, introduce otros minutos de Inicio");
				minutoInicio = Consola.leeInt();
			}
		}
//		System.out.println("Hora Inicio: "+horaInicio+":"+minutoInicio);
//		System.out.println("Hora Fin: "+horaFin+":"+minutoFin);
		System.out.println("Introduce el intervalo de tiempo: ");
		horaIntervalo = horaInicio;
		minutoIntervalo = minutoInicio;
		int intervalo = Consola.leeInt();
		if (minutoInicio < 10) {
			System.out.println("Hora Inicio:\t"+horaInicio+":0"+minutoInicio);
		}
		else {
			System.out.println("Hora Inicio:\t"+horaInicio+":"+minutoInicio);
		}
		while ((horaIntervalo < horaFin) || (horaIntervalo == horaFin && minutoIntervalo < minutoFin)) {
			minutoIntervalo = minutoIntervalo + intervalo;
			while (minutoIntervalo >= 60) {
				minutoIntervalo = minutoIntervalo - 60;
				horaIntervalo++;
			}	
			if ((horaIntervalo < horaFin) || (horaIntervalo == horaFin && minutoIntervalo < minutoFin)) {
				if (minutoIntervalo < 10) {
					System.out.println("\t\t"+horaIntervalo+":0"+minutoIntervalo);
				}
				else {
					System.out.println("\t\t"+horaIntervalo+":"+minutoIntervalo);
				}				
			}
		}
		if (minutoFin < 10) {
			System.out.println("Hora Inicio:\t"+horaFin+":0"+minutoFin);
		}
		else {
			System.out.println("Hora Inicio:\t"+horaFin+":"+minutoFin);
		}
	}
}
