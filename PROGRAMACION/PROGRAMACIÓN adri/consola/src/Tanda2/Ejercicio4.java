package Tanda2;

import ejercicios.Consola;

public class Ejercicio4 {
	public static void main(String[] args) {
		char biensubastado, ofertante;
		int preciopartida, duracion, npujas, contpujas, valor, contsubastas, n, acumpreciopartida, contpreciopartida;
		float mediapreciopartida;
		System.out.println("�Cuantas subastas desea introducir?");
		n=Consola.leeInt();
		contsubastas=1;
		acumpreciopartida=0;
		contpreciopartida=0;
		while(contsubastas<=n) {
			System.out.println("�Est� bien subastado?(B/M)");
			biensubastado=Consola.leeChar();
			while((biensubastado!='B')&&(biensubastado!='M')) {
				System.out.println("Car�cter inv�lido");
				biensubastado=Consola.leeChar();
			}
			System.out.println("Introduce el precio de partida");
			preciopartida=Consola.leeInt();
			System.out.println("Introduce la duraci�n en d�as");
			duracion=Consola.leeInt();
			System.out.println("Introduce el n�mero de pujas");
			npujas=Consola.leeInt();
			contpujas=1;
			while(contpujas<=npujas) {
				System.out.println("Introduce la letra del ofertante (MAY�SCULAS)");
				ofertante=Consola.leeChar();
				System.out.println("Introduce el valor de la puja");
				valor=Consola.leeInt();
				contpujas++;
			}
			if(npujas>10) {
				acumpreciopartida=acumpreciopartida+preciopartida;
				contpreciopartida++;
			}
		contsubastas++;
		}
		mediapreciopartida=acumpreciopartida/contpreciopartida;
		System.out.println("LA media del precio de partida cuando hay mas de 10 pujas es de "+mediapreciopartida);
	}

}
