package ejercicios;

public class Tanda1ej5 {
	public static void main(String[] args) {
		int dia, mes, a�o;
		
		
		System.out.println("Introduce el d�a");
		dia=Consola.leeInt();
		System.out.println("Introduce el mes");
		mes=Consola.leeInt();
		System.out.println("Introduce el a�o");
		a�o=Consola.leeInt();
		while((dia<1||dia>31)||(mes<1||mes>12)||(a�o<0)) {
			System.out.println("Introduce fecha v�lida");
			System.out.println("dia");
			dia=Consola.leeInt();
			System.out.println("mes");
			mes=Consola.leeInt();
			System.out.println("a�o");
			a�o=Consola.leeInt();
		}
		if(mes==1) {
			System.out.println(dia+ " de Enero de "+a�o);
		}
		if(mes==2) {
			System.out.println(dia+ " de Ferbrero de "+a�o);
		}
		if(mes==3) {
			System.out.println(dia+ " de Marzo de "+a�o);
		}
		if(mes==4) {
			System.out.println(dia+ " de Abril de "+a�o);
		}
		if(mes==5) {
			System.out.println(dia+ " de Mayo de "+a�o);
		}
		if(mes==6) {
			System.out.println(dia+ " de Junio de "+a�o);
		}
		if(mes==7) {
			System.out.println(dia+ " de Julio de "+a�o);
		}
		if(mes==8) {
			System.out.println(dia+ " de Agosto de "+a�o);
		}
		if(mes==9) {
			System.out.println(dia+ " de Septiembre" +a�o);
		}
		if(mes==10) {
			System.out.println(dia+ " de Octubre " +a�o);
		}
		if(mes==11) {
			System.out.println(dia+ " de Noviembre de "+a�o);
		}
		if(mes==12) {
			System.out.println(dia+ " de Diciembre de "+a�o);
		}
		
		
	}

}
