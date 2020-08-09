package Exercicio03;

public class ListaAluno extends ListaDuplamenteEncadeada<Aluno>{
	
	@Override
	protected String paraString(Aluno valor) {
		return "\nid:" + valor.getID()
				+ "  nome: " + valor.getNome() 
				+ "  curso: " + valor.getCurso()
				+ "  semestre: " + valor.getSemestre();
	}
}
