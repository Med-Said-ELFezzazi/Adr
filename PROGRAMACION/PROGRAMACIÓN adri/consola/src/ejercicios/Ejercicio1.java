package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, cont, contmujeresme ;
		char sexo;
		float sumaedades, mediaedades;

		
		contmujeresme=0;
		sumaedades=0;
		cont=1;
		while(cont<=4) {
			System.out.println("Persona"+ cont);
			System.out.println("Introduce la edad");
			edad=Consola.leeInt();
			System.out.println("Introduce el sexo (h/m)");
			sexo=Consola.leeChar();
			sumaedades += edad;
			if(sexo=='m'&&edad>=18) {
				contmujeresme += 1;
			}
			
			
					
			cont++;
		}
		mediaedades= sumaedades /4;
		System.out.println("Media de las edades es de "+ mediaedades +"años");
		System.out.println("Hay "+ contmujeresme +"mujeres mayores de edad");	
	}

}
