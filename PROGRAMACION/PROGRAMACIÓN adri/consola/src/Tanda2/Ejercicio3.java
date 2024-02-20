package Tanda2;

import ejercicios.Consola;

public class Ejercicio3 {
	public static void main(String[] args) {
		final int EM, EH, AM, AH;
		EM=167;
		EH=179;
		AM=165;
		AH=180;
		int edad, estatura, estaturamaxha2030, acummujereseuropa, contmujereseuropa, mediamujereseuropa;
		char  sexo, continente, respuesta;
		respuesta='s';
		acummujereseuropa=0;
		contmujereseuropa=0;
		estaturamaxha2030=-999;
		while(respuesta=='s') {
			System.out.println("introduce sexo(h/m)");
			sexo=Consola.leeChar();
			while((sexo!='h')&&(sexo!='m')) {
				System.out.println("Introduce sexo válido");
				sexo=Consola.leeChar();
			}
			System.out.println("Introduce edad");
			edad=Consola.leeInt();
			while(edad<18) {
				System.out.println("Introduce una edad adulta");
				edad=Consola.leeInt();
			}
			System.out.println("Introduce el continente(E/A)");
			continente=Consola.leeChar();
			while((continente!='E')&&(continente!='A')) {
				System.out.println("Introduce continente válido");
				continente=Consola.leeChar();

			}
			System.out.println("Introduce la estatura");
			estatura=Consola.leeInt();
			while((estatura<30)||(estatura>250)) {
				System.out.println("Introduce estatura válida");
				estatura=Consola.leeInt();
			}
			if((sexo=='m')&&(continente=='E')) {
				acummujereseuropa=acummujereseuropa+estatura;
				contmujereseuropa++;
				if(estatura>EM) {
					System.out.println("Estatura mayor a la media");
				}
				else {
					if(estatura<EM) {
						System.out.println("Estatura inferior a la media");
					}
					else {
						System.out.println("Estatura igual a la media");
					}
				}
			}
			else {
				if((sexo=='h')&&(continente=='E')) {
					if(estatura>EH) {
						System.out.println("Estatura mayor a la media");
					}
					else {
						if(estatura<EH) {
							System.out.println("Estatura inferior a la media");
						}
						else {
							System.out.println("Estatura igual a la media");
						}
					}
				}
				else {
					if((sexo=='m')&&(continente=='A')) {
						if(estatura>AM) {
							System.out.println("Estatura mayor a la media");
						}
						else {
							if(estatura<AM) {
								System.out.println("Estatura inferior a la media");
							}
							else {
								System.out.println("Estatura igual a la media");
							}
						}
					}
					else {
						if(estatura>estaturamaxha2030) {
							estaturamaxha2030=estatura;
						}
						if(estatura>AH) {
							System.out.println("Estatura mayor a la media");
						}
						else {
							if(estatura<AH) {
								System.out.println("Estatura inferior a la media");
							}
							else {
								System.out.println("Estatura igual a la media");
							}
						}
					}
				}
			}
		System.out.println("¿Desea introducir otra persona?");
		respuesta=Consola.leeChar();
		}
		mediamujereseuropa=acummujereseuropa/contmujereseuropa;
		System.out.println("La estatura media de las mujeres en europa es de "+mediamujereseuropa);
		System.out.println("La estatura máxima de los hombres en áfrica es de "+estaturamaxha2030);
	}

}
