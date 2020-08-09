package Exercicio03;

public class Media {
	private double mediaFinal;
	private int alunoID;
	private int disciplinaID;
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	public int getAlunoID() {
		return alunoID;
	}
	public void setAlunoID(int alunoID) {
		this.alunoID = alunoID;
	}
	public int getDisciplinaID() {
		return disciplinaID;
	}
	public void setDisciplinaID(int disciplinaID) {
		this.disciplinaID = disciplinaID;
	}
	
	public void setMediaAluno(int alunoID, int discID, double media) {
		this.alunoID = alunoID;
		this.disciplinaID = discID;
		this.mediaFinal = media;
	}
	
	
}
