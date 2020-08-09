package Exercicio03;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ListaLivros<Livro> lista = new ListaLivros<Livro>(new Livro());
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um livro no inicio da lista"
					+ "\n2 - Adicionar um livro no final da lista"
					+ "\n3 - Adicionar um livro em uma posicao da lista"
					+ "\n4 - Remover um livro do inicio da lista"  
					+ "\n5 - Remover um livro do final da lista" 
					+ "\n6 - Remover um livro de uma posicao da lista"
					+ "\n7 - Mostrar fila de livros"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		Livro valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionaInicio(valor);
        		break;
	        case 2:
	        	valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionaFinal(valor);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	valor = new Livro();
        		valor.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares do livro para adicionar")));
        		valor.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro para adicionar"));
        		lista.adicionaNaPosicao(valor, p);
	        	break;
	        case 4:
	        	Livro removido = lista.removeDoInicio();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo()  + " foi removido da lista");
	        	break;
	        case 5:
	        	removido = lista.removeDoFinal();
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	removido = lista.removeDaPosicao(po);
	        	if(removido != null ) JOptionPane.showMessageDialog(null, removido.getTitulo()  + " foi removido da lista");
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
