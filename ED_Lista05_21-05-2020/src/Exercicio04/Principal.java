package Exercicio04;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Videolocadora lista = new Videolocadora(new Filme());
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String data;
        
		boolean faca = true;
		
		while(faca) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um filme no inicio da lista"
					+ "\n2 - Adicionar um filme no final da lista"
					+ "\n3 - Adicionar um filme em uma posicao da lista"
					+ "\n4 - Remover um filme do inicio da lista"  
					+ "\n5 - Remover um filme do final da lista" 
					+ "\n6 - Remover um filme de uma posicao da lista"
					+ "\n7 - Mostrar fila de filmes"
					+ "\n8 - Finalizar"));
			
			switch (codigo) {
        	case 1:
        		Filme valor = new Filme();
        		valor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do filme para adicionar")));
        		valor.setNome(JOptionPane.showInputDialog("Digite o nome do filme para adicionar"));
        		
        		data = JOptionPane.showInputDialog("Digite a data de publicacao do filme para adicionar");
                try {
                    Date date = formatter.parse(data);
                    valor.setDt_publicacao(date);
                } catch (Exception e) {
                	System.out.println("data inserida de maneira errada");
                    e.printStackTrace();
                }
                
        		valor.setQtd_disponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponiveis do filme para adicionar")));
        		lista.adicionaInicio(valor);
        		break;
	        case 2:
	        	valor = new Filme();
	        	valor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do filme para adicionar")));
        		valor.setNome(JOptionPane.showInputDialog("Digite o nome do filme para adicionar"));
        		
        		data = JOptionPane.showInputDialog("Digite a data de publicacao do filme para adicionar (dd/mm/aaaa");
                try {
                    Date date = formatter.parse(data);
                    valor.setDt_publicacao(date);
                } catch (Exception e) {
                	System.out.println("data inserida de maneira errada");
                    e.printStackTrace();
                }
                
        		valor.setQtd_disponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponiveis do filme para adicionar")));
	        	
        		lista.adicionaFinal(valor);
	            break;
	        case 3:
	        	int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da lista em que deseja adicionar"));
	        	valor = new Filme();
	        	valor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do filme para adicionar")));
        		valor.setNome(JOptionPane.showInputDialog("Digite o nome do filme para adicionar"));
        		
        		data = JOptionPane.showInputDialog("Digite a data de publicacao do filme para adicionar (dd/mm/aaaa");
                try {
                    Date date = formatter.parse(data);
                    valor.setDt_publicacao(date);
                } catch (Exception e) {
                	System.out.println("data inserida de maneira errada");
                    e.printStackTrace();
                }
                
        		valor.setQtd_disponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponiveis do filme para adicionar")));
        		lista.adicionaNaPosicao(valor, p);
	        	break;
	        case 4:
	        	Filme removido = lista.removeDoInicio();
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
}
