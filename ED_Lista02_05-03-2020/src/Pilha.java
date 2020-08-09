
public class Pilha {
	int [] dados = new int [5];
	int tamanho = 0, primeiro = 0, ultimo = -1;
	
	public void adiciona(int num){
		if(estaCheia()) {
			System.out.println("Impossivel adicionar, pilha cheia");
		}else {
			if(ultimo < dados.length - 1) ultimo++;
			else ultimo=0;
			
			if(dados[ultimo] == 0) {
				dados[ultimo] = num;
				tamanho++;
			}
		}
		
	}
	
	public int remove() {
		int resposta = dados[ultimo];
		dados[ultimo] = 0;
		ultimo--;
		tamanho--;
		return resposta;
	}	
	
	public int getUltimoIndice() {
		return ultimo;
	}
	public int getUltimoElemento() {
		return dados[ultimo];
	}
	
	public int getPrimeiroIndice() {
		return primeiro;
	}
	public int getPrimeiroElemento() {
		return dados[primeiro];
	}
	
	public boolean estaCheia() {
		if(tamanho == dados.length ) return true;
		else return false;
	}
	
}
