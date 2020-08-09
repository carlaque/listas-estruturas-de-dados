package Exercicio08;

import Exercicio04.FilaPrioridadeDinamica;

@SuppressWarnings("hiding")
public class FilaPrioridadeLivro<Livro> extends FilaPrioridadeDinamica<Livro>{
	
	protected String paraString(Livro livro){
		return "TITULO: " + ((Exercicio08.Livro) livro).getTitulo() + " ---- "
				+ "QTD: " + ((Exercicio08.Livro) livro).getQuantidade() + "\n";
	}
	
	@Override
	protected int comparar(Livro e1, Livro e2) {
		Integer l1 = ((Exercicio08.Livro) e1).getQuantidade();
		Integer l2 = ((Exercicio08.Livro) e2).getQuantidade();
		
		Comparable<Integer> chave = (Comparable<Integer>) l1;
		if(chave.compareTo(l2) < 0) {
			return -1;
		}else if(chave.compareTo(l2) > 0) {
			return 1;
		}
		return 0;
	}
	
}
