package abstraccion;

public class Prueba 
{
	public static void main(String[] args) 
	{
		//NO SE PUEDE INSTANCIAR POR SER ABSTRACTA LA CLASE
		/*
		Vehiculo v1=new Vehiculo("Mustang");
		v1.arrancar();
		v1.parar();
		v1.toString();
		*/
		Coche c1=new Coche("Mustang", 360);
		c1.arrancar();
		c1.parar();
		System.out.println(c1.toString());
		
		TrenVapor tv1=new TrenVapor("RX200", 15);
		tv1.arrancar();
		tv1.parar();
		System.out.println(tv1.toString());
	}
}
