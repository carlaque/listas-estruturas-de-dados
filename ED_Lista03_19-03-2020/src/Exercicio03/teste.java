package Exercicio03;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		PilhaDinamica<Integer> pilha = new PilhaDinamica<Integer>();
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um numero na pilha"
					+ "\n2 - Remover um numero da pilha"
					+ "\n3 - Mostrar pilha"
					+ "\n4 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		pilha.empilhar(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar no vetor")));
            break;
	        case 2:
	            pilha.desempilhar();
	            break;
	        case 3:
	        	JOptionPane.showMessageDialog(null, pilha.Listar() );
	        	break;
	        case 4:
	             faca = false;
	             break;
	        default:
	             JOptionPane.showMessageDialog(null, "O código informado é inválido.");
	             break;
			} 
		}
	}

}
