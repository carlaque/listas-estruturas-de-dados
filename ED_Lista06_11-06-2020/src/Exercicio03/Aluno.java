package Exercicio03;

public class Aluno {
	private int ID;
	private String nome;
	private String Curso;
	private int Semestre;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public int getSemestre() {
		return Semestre;
	}
	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	
	public void Cadastrar(int id,String nome, String curso, int semestre ) {
		this.ID = id;
		this.nome = nome;
		this.Curso = curso;
		this.Semestre = semestre;
	}
	
}
