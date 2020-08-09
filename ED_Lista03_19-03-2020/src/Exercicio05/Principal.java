package Exercicio05;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		ListaDinamica<Character> lista = new ListaDinamica<Character>();
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um caracter no inicio da lista"
					+ "\n2 - Adicionar um caracter no final da lista"
					+ "\n3 - Adicionar um caracter em uma posicao da lista"
					+ "\n4 - Remover um caracter do inicio da lista"  
					+ "\n5 - Remover um caracter do final da lista" 
					+ "\n6 - Remover um caracter de uma posicao da lista"
					+ "\n7 - Mostrar fila"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		lista.adicionarNoInicio((JOptionPane.showInputDialog("Digite um valor para adicionar").toCharArray()[0]));
            break;
	        case 2:
	        	lista.adicionarNoFim((JOptionPane.showInputDialog("Digite um valor para adicionar").toCharArray()[0]));
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	char c = (JOptionPane.showInputDialog("Digite um valor para adicionar")).toCharArray()[0];
	        	lista.adicionarNaPosicao(p,c);
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
