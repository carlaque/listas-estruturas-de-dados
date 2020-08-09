package Exercicio06;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Temperatura<Integer> t = new Temperatura<Integer>(null);
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar uma temperatura no inicio da lista"
					+ "\n2 - Adicionar uma temperatura no final da lista"
					+ "\n3 - Adicionar uma temperatura em uma posicao da lista"
					+ "\n4 - Remover uma temperatura do inicio da lista"  
					+ "\n5 - Remover uma temperatura do final da lista" 
					+ "\n6 - Remover uma temperatura de uma posicao da lista"
					+ "\n7 - Mostrar fila"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para adicionar"));
        		t.adicionarNoInicio(valor);
            break;
	        case 2:
	        	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para adicionar"));
	        	t.adicionarNoFim(valor);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para adicionar"));
	        	t.adicionarNaPosicao(p,valor);
	        	break;
	        case 4:
	        	JOptionPane.showMessageDialog(null, t.removerNoInicio() + " foi removido da lista");
	        	break;
	        case 5:
	        	JOptionPane.showMessageDialog(null, t.removerNoFim() + " foi removido da lista");
	        	break;
	        case 6:
	        	int po = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
	        	JOptionPane.showMessageDialog(null, t.removerNaPosicao(po) + " foi removido da lista");
	        	break;
	        case 7:
	        	JOptionPane.showMessageDialog(null,t.mostrar());
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
