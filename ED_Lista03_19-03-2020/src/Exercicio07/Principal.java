package Exercicio07;

import javax.swing.JOptionPane;
import Exercicio05.ListaDinamica;

public class Principal {
	public static void main(String[] args) {
		ListaDinamica<String> lista = new ListaDinamica<String>();
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar uma string no inicio da lista"
					+ "\n2 - Adicionar uma string no final da lista"
					+ "\n3 - Adicionar uma string em uma posicao da lista"
					+ "\n4 - Remover uma string do inicio da lista"  
					+ "\n5 - Remover uma string do final da lista" 
					+ "\n6 - Remover uma string de uma posicao da lista"
					+ "\n7 - Mostrar fila"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		String valor = JOptionPane.showInputDialog("Digite um valor para adicionar");
        		lista.adicionarNoInicio(valor);
            break;
	        case 2:
	        	valor = JOptionPane.showInputDialog("Digite um valor para adicionar");
	        	lista.adicionarNoFim(valor);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	valor = JOptionPane.showInputDialog("Digite um valor para adicionar");
	        	lista.adicionarNaPosicao(p,valor);
	        	break;
	        case 4:
	        	JOptionPane.showMessageDialog(null, lista.removerNoInicio() + " foi removido da lista");
	        	break;
	        case 5:
	        	JOptionPane.showMessageDialog(null, lista.removerNoFim() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	JOptionPane.showMessageDialog(null, lista.removerNaPosicao(po) + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,lista.mostrar());
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
