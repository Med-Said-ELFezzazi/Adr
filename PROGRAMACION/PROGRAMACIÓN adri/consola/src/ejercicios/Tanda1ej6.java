package ejercicios;

public class Tanda1ej6 {
	public static void main(String[] args) {
		int ano1, ano2, cont, ano1final, ano2final;
		boolean bisiesto;
		
		bisiesto=false;
		System.out.println("Introduce el año1");
		ano1=Consola.leeInt();
		System.out.println("Introduce el año2");
		ano2=Consola.leeInt();
		
		if(ano2<ano1) {
			ano1final=ano2;
			ano2final=ano1;
		}
			
		else {
				ano1final=ano1;
				ano2final=ano2;
		}
		
		cont=ano1final;
		while(cont<=ano2final) {
			
			bisiesto=false;
			if(cont%4==0) {
				bisiesto=true;
				if(cont%100==0) {
					bisiesto=false;
					if(cont%400==0) {
						bisiesto=true;						
					}
				}
			}
			
			if(bisiesto==true) {
				System.out.println(cont);
			}
			cont++;
			
		}
	}

}
