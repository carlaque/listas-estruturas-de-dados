package Exercicio04;

import java.util.Date;

public class Filme {
	private int codigo;
	private String nome;
	private Date dt_publicacao;
	private int qtd_disponivel;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_publicacao() {
		return dt_publicacao;
	}
	public void setDt_publicacao(Date dt_publicacao) {
		this.dt_publicacao = dt_publicacao;
	}
	public int getQtd_disponivel() {
		return qtd_disponivel;
	}
	public void setQtd_disponivel(int qtd_disponivel) {
		this.qtd_disponivel = qtd_disponivel;
	}
	
	

}
