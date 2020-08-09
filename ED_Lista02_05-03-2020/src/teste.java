import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um numero na fila"
					+ "\n2 - Remover um numero da fila"
					+ "\n3 - Mostrar Fila"
					+ "\n4 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		pilha.adiciona(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar no vetor")));
            break;
	        case 2:
	            System.out.println(pilha.remove() + " foi removido");;
	            break;
	        case 3:
	        	for(int i = 0; i < 5; i++) {
	    			System.out.println(pilha.dados[i]);
	    		}
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
