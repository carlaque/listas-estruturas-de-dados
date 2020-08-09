package Exercicio03;

import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {
	private static int codigoAluno = 0;
	private static int codigoDisciplina = 0;
	
	public static void main(String[] args) {
		
		ListaAluno ListaAluno = new ListaAluno();
		ListaDisciplina ListaDisciplina = new ListaDisciplina();
		ListaMedia ListaMedia = new ListaMedia();
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Gerenciar alunos"
					+ "\n2 - Gerenciar disciplinas"
					+ "\n3 - Gerenciar media"
					+ "\n4 - Ordernar Media por MergSort e Exibir"
					+ "\n5 - fazer teste rapido"
					+ "\n99 - Finalizar"));
			switch (codigo) {
			case 1:
				aluno(ListaAluno);
				break;
			case 2:
				disciplina(ListaDisciplina);
				break;
			case 3:
				media(ListaMedia);
				break;
			case 4: 
				ListaMedia.ordernarMergeSort();
				System.out.println(ListaMedia.mostrarElementos());
				break;
			case 5: 
				testeRapido();
				break;
			case 99:
				faca = false;
			default:
				throw new IllegalArgumentException("Unexpected value: " + codigo);
			}
		}
		
	}
	
	public static void testeRapido() {
		Random r = new Random();
		ListaAluno ListaAluno = new ListaAluno();
		ListaDisciplina ListaDisciplina = new ListaDisciplina();
		ListaMedia ListaMedia = new ListaMedia();
		
		for(int i=0;i<15;i++){
			Aluno aluno = new Aluno();
			int a = r.nextInt(10);
			aluno.Cadastrar(i,"Joao" + a, "ADS", a);
			ListaAluno.adicionaFinal(aluno);
		}
		for(int i=0;i<15;i++){
			Disciplina d = new Disciplina();
			int a = r.nextInt(10);
			d.cadastrar(i, "disc");
			ListaDisciplina.adicionaFinal(d);
		}
		for(int i=0;i<15;i++){
			Media m = new Media();
			int media = r.nextInt(10);
			int aluno = r.nextInt(15);
			int disc = r.nextInt(15);
			
			m.setMediaAluno(aluno, disc, media);
			ListaMedia.adicionaFinal(m);
		}
		System.out.println(ListaMedia.mostrarElementos());
		
		ListaMedia.ordernarMergeSort();
		
		System.out.println(ListaMedia.mostrarElementos());
	}

	
	public static void aluno(ListaAluno lista) {
		boolean faca = true;
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um Aluno no inicio da lista"
					+ "\n2 - Adicionar um Aluno no final da lista"
					+ "\n3 - Adicionar um Aluno em uma posicao da lista"
					+ "\n4 - Remover um Aluno do inicio da lista"  
					+ "\n5 - Remover um Aluno do final da lista" 
					+ "\n6 - Remover um Aluno de uma posicao da lista"
					+ "\n7 - Mostrar fila de Alunos"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno para adicionar");
        		String curso = JOptionPane.showInputDialog("Digite o curso do Aluno para adicionar");
        		int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do Aluno para adicionar"));
        		Aluno a = new Aluno();
        		a.Cadastrar(codigoAluno++, nome, curso, semestre);
        		lista.adicionaInicio(a);
        		break;
	        case 2:
	        	nome = JOptionPane.showInputDialog("Digite o nome do Aluno para adicionar");
        		curso = JOptionPane.showInputDialog("Digite o curso do Aluno para adicionar");
        		semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do Aluno para adicionar"));
        		a = new Aluno();
        		a.Cadastrar(codigoAluno++, nome, curso, semestre);
        		lista.adicionaFinal(a);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	nome = JOptionPane.showInputDialog("Digite o nome do Aluno para adicionar");
        		curso = JOptionPane.showInputDialog("Digite o curso do Aluno para adicionar");
        		semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do Aluno para adicionar"));
        		a = new Aluno();
        		a.Cadastrar(codigoAluno++, nome, curso, semestre);
        	
        		lista.adicionaNaPosicao(a, p);
	        	break;
	        case 4:
	        	Aluno removido = lista.removeDoInicio();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome()  + " foi removido da lista");
	        	break;
	        case 5:
	        	removido = lista.removeDoFinal();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	removido = lista.removeDaPosicao(po);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome()  + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,lista.mostrarElementos());
	        	break;
	        case 8:
	             faca = false;
	             break;
	        default:
	             JOptionPane.showMessageDialog(null, "O código informado é inválido.");
	             break;
			} 
		}
	}
	
	public static void disciplina(ListaDisciplina lista) {
		boolean faca = true;
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um Disciplina no inicio da lista"
					+ "\n2 - Adicionar um Disciplina no final da lista"
					+ "\n3 - Adicionar um Disciplina em uma posicao da lista"
					+ "\n4 - Remover um Disciplina do inicio da lista"  
					+ "\n5 - Remover um Disciplina do final da lista" 
					+ "\n6 - Remover um Disciplina de uma posicao da lista"
					+ "\n7 - Mostrar fila de Disciplinas"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		String nome = JOptionPane.showInputDialog("Digite o nome do Disciplina para adicionar");
        		Disciplina a = new Disciplina();
        		a.cadastrar(codigoDisciplina++, nome);
        		lista.adicionaInicio(a);
        		JOptionPane.showMessageDialog(null, "Disciplina "+ a.getNome() + " do ID: " + a.getID() +" foi adicionada");
        		break;
	        case 2:
	        	nome = JOptionPane.showInputDialog("Digite o nome do Disciplina para adicionar");
        		a = new Disciplina();
        		a.cadastrar(codigoDisciplina++, nome);
        		lista.adicionaFinal(a);
        		JOptionPane.showMessageDialog(null, "Disciplina "+ a.getNome() + " do ID: " + a.getID() +" foi adicionada");
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	nome = JOptionPane.showInputDialog("Digite o nome do Disciplina para adicionar");
        		a = new Disciplina();
        		a.cadastrar(codigoDisciplina++, nome);
        		JOptionPane.showMessageDialog(null, "Disciplina "+ a.getNome() + " do ID: " + a.getID() +" foi adicionada");
        		lista.adicionaNaPosicao(a, p);
	        	break;
	        case 4:
	        	Disciplina removido = lista.removeDoInicio();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome()  + " foi removido da lista");
	        	break;
	        case 5:
	        	removido = lista.removeDoFinal();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	removido = lista.removeDaPosicao(po);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getNome()  + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,lista.mostrarElementos());
	        	break;
	        case 8:
	             faca = false;
	             break;
	        default:
	             JOptionPane.showMessageDialog(null, "O código informado é inválido.");
	             break;
			} 
		}
		
	}
	
	public static void media(ListaMedia lista) {
		boolean faca = true;
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um Media no inicio da lista"
					+ "\n2 - Adicionar um Media no final da lista"
					+ "\n3 - Adicionar um Media em uma posicao da lista"
					+ "\n4 - Remover um Media do inicio da lista"  
					+ "\n5 - Remover um Media do final da lista" 
					+ "\n6 - Remover um Media de uma posicao da lista"
					+ "\n7 - Mostrar fila de Medias"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		Media a = new Media();
        		int alunoID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id do Aluno para adicionar"));
        		int discID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id da Disciplina para adicionar"));
        		double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media final do Aluno para adicionar"));
        		a.setMediaAluno(alunoID, discID, media);
        		lista.adicionaInicio(a);
        		break;
	        case 2:
	        	a = new Media();
        		alunoID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id do Aluno para adicionar"));
        		discID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id da Disciplina para adicionar"));
        		media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media final do Aluno para adicionar"));
        		a.setMediaAluno(alunoID, discID, media);
        		lista.adicionaFinal(a);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	a = new Media();
        		alunoID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id do Aluno para adicionar"));
        		discID = Integer.parseInt( JOptionPane.showInputDialog("Digite o Id da Disciplina para adicionar"));
        		media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media final do Aluno para adicionar"));
        		lista.adicionaNaPosicao(a, p);
	        	break;
	        case 4:
	        	Media removido = lista.removeDoInicio();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, "Media do aluno " + removido.getAlunoID()  + " foi removido da lista");
	        	break;
	        case 5:
	        	removido = lista.removeDoFinal();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, "Media do aluno " + removido.getAlunoID() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	removido = lista.removeDaPosicao(po);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, "Media do aluno " + removido.getAlunoID()   + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,lista.mostrarElementos());
	        	break;
	        case 8:
	             faca = false;
	             break;
	        default:
	             JOptionPane.showMessageDialog(null, "O código informado é inválido.");
	             break;
			} 
		}
	}
}
