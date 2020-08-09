package Exercicio04;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		FilaPrioridadeDinamica<Integer> fila = new FilaPrioridadeDinamica<Integer>();
		
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um numero na fila"
					+ "\n2 - Remover um numero da fila"
					+ "\n3 - Mostrar fila"
					+ "\n4 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		fila.adicionarNaFila(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar no vetor")));
            break;
	        case 2:
	        	fila.excluirDaFila();
	            break;
	        case 3:
	        	JOptionPane.showMessageDialog(null,fila.Listar());
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
