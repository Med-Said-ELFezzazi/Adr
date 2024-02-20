package ejercicios;

public class Tanda1ej4 
{
	public static void main(String[] args) 
	{
		float num1, num2, num3, nummedio;
		
		
		System.out.println("Introduce el primer número");
		num1=Consola.leeFloat();
		System.out.println("Introduce el segundo númro");
		num2=Consola.leeFloat();
		System.out.println("Introduce el tercer número");
		num3=Consola.leeFloat();
		while(num1==num2 || num1==num3 || num2==num3) 
		{
			System.out.println("Introduce 3 números diferentes");
			System.out.println("numero1");
			num1=Consola.leeFloat();
			System.out.println("numero2");
			num2=Consola.leeFloat();
			System.out.println("numero3");
			num3=Consola.leeFloat();
		}
		if((num1>num2 && num1<num3)||(num1<num2 && num1>num3)) 
		{
			
			nummedio=num1;
		}
		else 
		{
				if((num2>num1 && num2<num3)||(num2<num1 && num2>num3)) 
				{
					nummedio=num2;
				}
				else
				{
					nummedio=num3;
				}
				
		}
		System.out.println("El número del medio es "+nummedio);
		
		
	
		
	}
}
