package Tanda2;

import ejercicios.Consola;

public class Ejercicio4 {
	public static void main(String[] args) {
		char biensubastado, ofertante;
		int preciopartida, duracion, npujas, contpujas, valor, contsubastas, n, acumpreciopartida, contpreciopartida;
		float mediapreciopartida;
		System.out.println("¿Cuantas subastas desea introducir?");
		n=Consola.leeInt();
		contsubastas=1;
		acumpreciopartida=0;
		contpreciopartida=0;
		while(contsubastas<=n) {
			System.out.println("¿Está bien subastado?(B/M)");
			biensubastado=Consola.leeChar();
			while((biensubastado!='B')&&(biensubastado!='M')) {
				System.out.println("Carácter inválido");
				biensubastado=Consola.leeChar();
			}
			System.out.println("Introduce el precio de partida");
			preciopartida=Consola.leeInt();
			System.out.println("Introduce la duración en días");
			duracion=Consola.leeInt();
			System.out.println("Introduce el número de pujas");
			npujas=Consola.leeInt();
			contpujas=1;
			while(contpujas<=npujas) {
				System.out.println("Introduce la letra del ofertante (MAYÚSCULAS)");
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
