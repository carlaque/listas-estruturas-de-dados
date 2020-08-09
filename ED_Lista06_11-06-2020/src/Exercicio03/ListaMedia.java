package Exercicio03;

public class ListaMedia extends ListaDuplamenteEncadeada<Media> {
	
	@Override
	protected String paraString(Media valor) {
		return " \nnome aluno: " + valor.getAlunoID()
				+ "  disciplina ID: " + valor.getDisciplinaID()
				+ "  Media final: " + valor.getMediaFinal();
	}
	
	@Override
	protected int comparar(Media e1, Media e2) {
		@SuppressWarnings("unchecked")
		double m1 = e1.getMediaFinal();
		double m2 = e2.getMediaFinal();
		
		Comparable<Double> chave = (Comparable<Double>) m1;
		if(chave.compareTo(m2) < 0) {
			return -1;
		}else if(chave.compareTo(m2) > 0) {
			return 1; 
		}
		return 0;
	}
	
}
