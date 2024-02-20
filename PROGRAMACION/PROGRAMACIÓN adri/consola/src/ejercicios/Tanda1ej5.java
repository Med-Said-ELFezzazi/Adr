package ejercicios;

public class Tanda1ej5 {
	public static void main(String[] args) {
		int dia, mes, año;
		
		
		System.out.println("Introduce el día");
		dia=Consola.leeInt();
		System.out.println("Introduce el mes");
		mes=Consola.leeInt();
		System.out.println("Introduce el año");
		año=Consola.leeInt();
		while((dia<1||dia>31)||(mes<1||mes>12)||(año<0)) {
			System.out.println("Introduce fecha válida");
			System.out.println("dia");
			dia=Consola.leeInt();
			System.out.println("mes");
			mes=Consola.leeInt();
			System.out.println("año");
			año=Consola.leeInt();
		}
		if(mes==1) {
			System.out.println(dia+ " de Enero de "+año);
		}
		if(mes==2) {
			System.out.println(dia+ " de Ferbrero de "+año);
		}
		if(mes==3) {
			System.out.println(dia+ " de Marzo de "+año);
		}
		if(mes==4) {
			System.out.println(dia+ " de Abril de "+año);
		}
		if(mes==5) {
			System.out.println(dia+ " de Mayo de "+año);
		}
		if(mes==6) {
			System.out.println(dia+ " de Junio de "+año);
		}
		if(mes==7) {
			System.out.println(dia+ " de Julio de "+año);
		}
		if(mes==8) {
			System.out.println(dia+ " de Agosto de "+año);
		}
		if(mes==9) {
			System.out.println(dia+ " de Septiembre" +año);
		}
		if(mes==10) {
			System.out.println(dia+ " de Octubre " +año);
		}
		if(mes==11) {
			System.out.println(dia+ " de Noviembre de "+año);
		}
		if(mes==12) {
			System.out.println(dia+ " de Diciembre de "+año);
		}
		
		
	}

}
