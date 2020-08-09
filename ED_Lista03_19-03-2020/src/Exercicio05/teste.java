package Exercicio05;

public class teste {
	public static void main(String[] args) {
		ListaDinamica<String> l = new ListaDinamica<String>();
		l.adicionarNoFim("1");
		l.adicionarNoFim("2");
		l.adicionarNoFim("3");
		l.adicionarNoFim("4");
		l.adicionarNoFim("5");
		l.adicionarNoFim("6");
		l.adicionarNoInicio("a");
		l.adicionarNoInicio("b");
		l.adicionarNoInicio("c");
		
		l.adicionarNaPosicao(1, "valor do meio");

		l.mostrar();
		
		System.out.println(" no inicio ==="+l.removerNoInicio());
		System.out.println(" no fim ======"+l.removerNoFim());
		System.out.println(" na posicao ==="+l.removerNaPosicao(1));
		l.mostrar();
	}
}
