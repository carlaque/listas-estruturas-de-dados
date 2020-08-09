package MergeSort;

import java.util.Random;

public class teste {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();
		Random r = new Random();
		
		for(int i=0;i<54;i++){
			int a = r.nextInt(101);
			lista.adicionaFinal(a);
		}
		
		System.out.println(lista.mostrarElementos());
		
		lista.ordernarMergeSort();
		System.out.println(lista.mostrarElementos());
	}
}
