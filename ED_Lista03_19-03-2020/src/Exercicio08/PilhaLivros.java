package Exercicio08;

import Exercicio03.PilhaDinamica;

@SuppressWarnings("hiding")
public class PilhaLivros<Livro> extends PilhaDinamica<Livro>{
	protected String paraString(Livro livro){
		return "TITULO: " + ((Exercicio08.Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Exercicio08.Livro) livro).getQuantidade() + "\n";
	}
}
