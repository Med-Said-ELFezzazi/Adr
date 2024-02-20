package tanda3;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num, aux, inv = 0;
		System.out.println("Escribe un número para ver el inverso");
		num = Consola.leeInt();
		aux = num;
		while (aux > 0){
			inv = (inv*10 +(aux%10));
			aux = aux/10;
		}
		System.out.println("El inverso de "+num+ " es "+inv);
	}
}