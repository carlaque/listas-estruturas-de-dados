import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		boolean faca = true;
		boolean faca2 = true;
		
		while(faca2) {
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Deseja Operar Na (1)Fila ou na (2)Pilha ou  (3) para finalizar"));
			
			switch (cod) {
			case 1:
				faca = true;
				while(faca) {
					int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
							+ "1 - Adicionar um numero na fila"
							+ "\n2 - Remover um numero da fila"
							+ "\n3 - Mostrar Fila"
							+ "\n4 - Finalizar Fila"));
					
					switch (codigo) {
		        	case 1:
		        		fila.adiciona(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar no vetor")));
		            break;
			        case 2:
			        	int removido = fila.remove() ;
			        	pilha.adiciona(removido);
			            System.out.println(removido + " foi removido");;
			            break;
			        case 3:
			        	for(int i = 0; i < 5; i++) {
			    			System.out.println(fila.dados[i]);
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
				break;
			case 2:
				faca = true;
				while(faca) {
					int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
							+ "1 - Adicionar um numero na pilha"
							+ "\n2 - Remover um numero da pilha"
							+ "\n3 - Mostrar pilha"
							+ "\n4 - Finalizar pilha"));
					
					switch (codigo) {
		        	case 1:
		        		pilha.adiciona(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar no vetor")));
		            break;
			        case 2:
			        	int removido = pilha.remove() ;
			        	fila.adiciona(removido);
			            System.out.println(removido + " foi removido");;
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
				
				break;

			default:
				JOptionPane.showMessageDialog(null, "O código informado é inválido.");
				break;
			}
		}
		
	}
}
