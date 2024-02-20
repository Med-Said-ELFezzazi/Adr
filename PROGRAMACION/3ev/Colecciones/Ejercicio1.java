package Tanda1;

import java.util.ArrayList;

public class Ejercicio1 {
	

	static void cargar(ArrayList<Integer> list) {
	
		for(int i=0;i<20;i++) {
			list.add((int)(Math.random()*(201)+(-100)));			
		}
		System.out.println("ArrayList Cargado con números aleatorios entre -100 y 100");
	}
	
	static void visualizar(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	static void cargardivisores(int n, ArrayList<Integer> list) {
		int ndiv=0;
		for(int d=1;(d<=n)&&(ndiv<10);d++) {
			if((n%d==0)) {
				list.add(d);
				ndiv++;
				
			}
		}
		System.out.println("ArrayList cargado con divisores de n");
	}
	static void cargarsinduplicados(ArrayList<Integer> list) {
		for(int i=0;i<20;i++) {
			list.add((int)(Math.random()*(41)+(-20)));
			
		}
	}

	public static void main(String[] args) {
	
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		cargar(list);
		visualizar(list);
		list.clear();
		cargardivisores(26, list);
		visualizar(list);
		list.clear();
	}
}
