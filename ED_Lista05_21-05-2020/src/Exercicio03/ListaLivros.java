package Exercicio03;

import Exercicio02.ListaDuplamenteEncadeada;

@SuppressWarnings("hiding")
public class ListaLivros<Livro> extends ListaDuplamenteEncadeada<Livro>{
	
	public ListaLivros( Livro valor) {
		super();
	}
	
	protected String paraString(Livro livro){
		return "TITULO: " + ((Exercicio03.Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Exercicio03.Livro) livro).getQuantidade() + "\n";
	}
	
}
