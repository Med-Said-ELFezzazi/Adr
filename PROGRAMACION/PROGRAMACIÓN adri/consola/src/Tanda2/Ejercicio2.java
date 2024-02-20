package Tanda2;

import ejercicios.Consola;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numempleados, ingresos, tasa, ncomercios, contadorcomercios, descuento;
		System.out.println("Introduce el número de comercios");
		ncomercios=Consola.leeInt();
		contadorcomercios=1;
		while(contadorcomercios<=ncomercios) {
			System.out.println("Introduce el número de empleados");
			numempleados=Consola.leeInt();
			System.out.println("Introduce la cantidad de ingresos");
			ingresos=Consola.leeInt();
			if((numempleados>=1)&&(numempleados<=2)) {
				descuento=ingresos;
			}
				else {
					if((numempleados>=3)&&(numempleados<=5)) {
						descuento=ingresos*((100-(numempleados*5))/100);	
					}
					else {
						descuento=ingresos*((100-(numempleados*7))/10);	
					}
				}
			
			System.out.println(descuento);
			tasa=descuento/10;
			System.out.println("Tasa a pagar="+tasa);
			contadorcomercios++;
			
		}
		
		
	}

}
