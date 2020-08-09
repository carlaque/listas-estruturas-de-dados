package Exercicio02;

import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		Random r = new Random();
		int lista[] = {26,69,25,53,59,27,41,0,33,16,35,43};
		System.out.println("\nLista Inicial");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+"  ");
		}
		mergeSort(lista,0, lista.length-1);
		System.out.println("\nLista ordenada");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+"  ");
		}
	}
	
	public static void mergeSort(int lista[], int inicio, int fim) {
		
		if(inicio < fim) {
			int metade =( inicio + fim ) / 2;
			mergeSort(lista, inicio, metade);
			mergeSort(lista, metade + 1, fim);
			mesclar(lista, inicio, metade, metade + 1, fim);
		}
	}
	
	public static void mesclar(int lista[], int inicio1, int fim1, int inicio2, int fim2) {
		int i1 = inicio1;
		int i2 = inicio2;
		int iAux = inicio1;
		int aux[] = new int[lista.length];
		
		while(i1 <= fim1 && i2 <= fim2 ) {
			if(lista[i1] <= lista[i2]) aux[iAux++] = lista[i1++];
			else aux[iAux++] = lista[i2++];
		}
		while(i1 <= fim1) aux[iAux++] = lista[i1++];
		while(i2 <= fim2) aux[iAux++] = lista[i2++];
		
		for(int i = inicio1; i <= fim2; i++) lista[i] = aux[i];
	}
}
