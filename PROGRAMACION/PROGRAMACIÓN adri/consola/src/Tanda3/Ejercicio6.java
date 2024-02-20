package Tanda3;

import ejercicios.Consola;

public class Ejercicio6 {
	public static void main(String[] args) {
		int contfilas1, dimension1, nblancos1, contblancos1, nletrasaescribir1, contletras1, sw1;
		System.out.println("Introduce la dimensión de la pirámide");
		dimension1=Consola.leeInt();
		sw1=1;
		contfilas1=1;
		nblancos1=dimension1-(contfilas1-1);
		nletrasaescribir1=1;
		while(contfilas1<=dimension1) {
			contblancos1=1;
			while(contblancos1<=nblancos1) {
				System.out.print(" 5  ");
				contblancos1++;
			}
			contletras1=1;
			while(contletras1<=nletrasaescribir1) {
				if(sw1==1) {
					System.out.print("X  ");
				}
				else {
					System.out.print("Y  ");
				}
				
			}
			System.out.println(" ");
			sw1=sw1*(-1);
			nletrasaescribir1+=2;
			contfilas1++;
		}
		
	}
}
