package paquete1;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Introduce un n�mero");
		num1 = Consola.leeInt();
		System.out.println("Introduce otro n�mero");
		num2 = Consola.leeInt();
		System.out.println("Introduce el ultimo n�mero");
		num3 = Consola.leeInt();
		while (num1 == num2 || num1 == num3 || num2 == num3){
			System.out.println("No son tres n�meros distintos.");
			System.out.println("Introduce un n�mero");
			num1 = Consola.leeInt();
			System.out.println("Introduce otro n�mero");
			num2 = Consola.leeInt();
			System.out.println("Introduce el ultimo n�mero");
			num3 = Consola.leeInt();
		}		
		if ((num1 > num2 && num2 > num3) || (num1 < num2 && num2 < num3)) {
			System.out.println(num2);
		}
		else {
			if ((num2 > num3 && num3 > num1)|| (num2 < num3 && num3 < num1)) {
				System.out.println(num3);	
			}
			else {
				System.out.println(num1);
			}
		}
	}
}
