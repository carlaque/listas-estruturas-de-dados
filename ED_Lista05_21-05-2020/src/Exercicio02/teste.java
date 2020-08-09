package Exercicio02;

public class teste {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> l = new ListaDuplamenteEncadeada<Integer>();
		l.adicionaFinal(1);
		l.adicionaFinal(2);
		l.adicionaFinal(3);
		l.adicionaFinal(4);
		l.adicionaFinal(5);
		l.adicionaFinal(6);
		//l.adicionaInicio("a");
		//l.adicionaInicio("b");
		//l.adicionaInicio("c");
		
		//l.adicionaNaPosicao("valor do meio", 2);

		
		System.out.println(l.mostrarElementos());
		System.out.println(" -- "+l.removePrimeiroRecursivo());
		
		System.out.println(l.mostrarElementos());
		
	}
}
