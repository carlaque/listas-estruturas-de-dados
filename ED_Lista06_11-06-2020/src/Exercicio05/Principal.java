package Exercicio05;

import java.util.Random;

public class Principal {
	
	public static void main(String args[]){
		int lista[] = {149,192,47,152,159,195,61,66,17,167,118,64,27,80,30,105};
		
		System.out.print("Lista Inicial: ");
		for(int i = 0 ;i < lista.length; i++){
			System.out.print(lista[i]+"  ");
		}
		quickSort(lista,0,(lista.length-1));
		
		System.out.print("\nLista ordenada: ");
		for(int i = 0;i < lista.length; i++){
			System.out.print(lista[i]+"  ");
		}
		
	}

	
	public static void quickSort (int vet[], int esquerda, int direita){
		int pivo; 
		if (esquerda < direita) { 
			pivo = particao(vet, esquerda, direita);
			quickSort (vet, esquerda, pivo-1);  
			quickSort (vet, pivo+1, direita); 
		}
	}
	
	public static int particao (int vetor[], int inicio, int fim){
		int pivo = vetor[inicio];
		int i = inicio+1;
		int f = fim;
		int aux; 
		while (i <= f) { 
			while (i <= fim && vetor[i] <= pivo) ++i ; 
			while (pivo < vetor[f]) --f ; 
			if (i < f){ 
				aux = vetor[i];
				vetor[i++] = vetor[f];
				vetor[f--] = aux;
			}	 
		} 
		if (inicio != f){
			vetor[inicio] = vetor[f];
			vetor[f] = pivo;
		} 
		return f; 
	}
	
}
