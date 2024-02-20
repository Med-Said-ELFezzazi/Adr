package tema4_1;

public class Principal {
	public static void main(String[] args) {
		// Creo las personas
		Persona p1 = new Persona("Juan Lopez", 25, 'H');
		Persona p2 = new Persona("Ana Aguirre", 22, 'M');
		Persona p3 = new Persona("Jorge Gil", 20, 'H');
		// Creo las cuentas
/*		CuentaBancaria c1 = new CuentaBancaria("Juan Lopez");
		CuentaBancaria c2 = new CuentaBancaria("Ana Aguirre");
		CuentaBancaria c3 = new CuentaBancaria("Jorge Gil", 800);	*/
		CuentaBancaria c1 = new CuentaBancaria(p1);
		CuentaBancaria c2 = new CuentaBancaria(p2);
		CuentaBancaria c3 = new CuentaBancaria(p3, 800);
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
		// Aporto saldo
		c1.saldo = 500;
		c2.saldo = 2000;
		c3.saldo+=100;
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
		// Gasto 100 en las cuentas
		c1.gastar(100);
		c2.gastar(100);
		c3.gastar(100);
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
		// Gasto 500 en las cuentas
		c1.gastar(500);
		c2.gastar(500);
		c3.gastar(500);
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
		// Ingreso 2.000.000 en la cuenta c3
		c3.ingresar(2000000);
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
		// Traspaso 100€ de la cuenta c3 a la cuenta c1
		c3.gastar(100);
		c1.ingresar(100);
		// Visualizo las cuentas
		c1.ver();
		c2.ver();
		c3.ver();
	}
}
