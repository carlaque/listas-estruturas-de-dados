package Exercicio04;

import Exercicio02.ListaDuplamenteEncadeada;

public class Videolocadora extends ListaDuplamenteEncadeada<Filme> {
	
	public Videolocadora( Filme valor) {
		super();
	}
	
	protected String paraString(Filme filme){
		return    "CODIGO: " + ((Exercicio04.Filme) filme).getCodigo() + "- "
				+ "NOME: " + ((Exercicio04.Filme) filme).getNome() + " - "
				+ "DATA PUBLICACAO: " + ((Exercicio04.Filme) filme).getDt_publicacao() + " - "
				+ "QUANTIDADE DISPONIVEL: " + ((Exercicio04.Filme) filme).getQtd_disponivel() + "\n"; 
	}
	
}
