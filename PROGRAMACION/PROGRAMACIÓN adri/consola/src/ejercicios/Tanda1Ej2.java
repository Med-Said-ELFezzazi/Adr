package ejercicios;

public class Tanda1Ej2 {
	public static void main(String[] args) {
		float arista, base, altura, area;
		char cuboorect;
		
		System.out.println("¿Quieres el área de un rectángulo(r) o de un cubo(c)?");
		cuboorect=Consola.leeChar();
		if(cuboorect=='r') {
			System.out.println("Introduce la base");
			base=Consola.leeFloat();
			System.out.println("Introduce la altura");
			altura=Consola.leeFloat();
			area= base*altura;
			System.out.println("Área ="+ area);
		}
		if(cuboorect=='c') {
			System.out.println("Introduce el arista");
			arista=Consola.leeFloat();
			area= 6* (arista*arista);
			System.out.println("Área ="+ area);
			
		}
		
	}

}
