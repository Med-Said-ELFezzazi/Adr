package ejercicios;

public class Tanda1ej3 {
	public static void main(String[] args) {
		float num1, num2, resultado;
		char signo;
		
		System.out.println("Introduce el primer n�mero");
		num1=Consola.leeFloat();
		System.out.println("Introduce el segundo n�mero");
		num2=Consola.leeFloat();
		System.out.println("Introduce el signo de la operaci�n");
		signo=Consola.leeChar();
		while(signo !='x'&& signo !='+' && signo !='-' && signo!= ':') {
			System.out.println("Error en el signo, volver a introducir");
			signo=Consola.leeChar();
		}
		if(signo=='+') {
			resultado= num1+num2;
			System.out.println(num1+"+"+num2+"="+resultado);
		}
		if(signo=='-') {
			resultado= num1-num2;
			System.out.println(num1+"-"+num2+"="+resultado);
		}
		if(signo=='x') {
			resultado= num1*num2;
			System.out.println(num1+"x"+num2+"="+resultado);
		}
		if(signo==':') {
			resultado= num1/num2;
			System.out.println(num1+":"+num2+"="+resultado);
			
		}
		
		
	}

}
