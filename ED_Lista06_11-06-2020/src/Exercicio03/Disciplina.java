package Exercicio03;

public class Disciplina{
	private int ID;
	private String nome;
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
	
	public void cadastrar(int id, String nome) {
		this.ID = id;
		this.nome = nome;
	}
	
}
