package Exercicio08;

import Exercicio05.ListaDinamica;

@SuppressWarnings("hiding")
public class ListaLivros<Livro> extends ListaDinamica<Livro>{
	
	public ListaLivros( Livro valor) {
		super();
	}
	
	protected String paraString(Livro livro){
		return "TITULO: " + ((Exercicio08.Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Exercicio08.Livro) livro).getQuantidade() + "\n";
	}
	
}