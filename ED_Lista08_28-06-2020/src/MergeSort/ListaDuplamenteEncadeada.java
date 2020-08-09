package MergeSort;

public class ListaDuplamenteEncadeada<T> {
	private NO<T> inicio;
	
	public ListaDuplamenteEncadeada() {
		inicio = null;
	}
	
	public boolean vazia() {
		return this.inicio == null;
	}
	
	public NO<T> buscaUltimo(NO<T> elemento) {
		if(elemento.getProximo()!= null)
			return buscaUltimo(elemento.getProximo());
		
		return elemento;
	}
	
	public NO<T> buscaNaPosicao(NO<T> elemento, int pos) {
		if(elemento.getProximo()!= null && pos > 1)
			return buscaNaPosicao(elemento.getProximo(), --pos);
		
		if(elemento.getProximo() == null && pos > 1)
			return null;
		
		return elemento;
	}
	
	public void adicionaInicio( T dado) {
		NO<T> novo = new NO<T>(dado);
		
		if(!vazia()) {
			novo.setProximo(this.inicio);
			inicio.setAnterior(novo);
		}
		inicio = novo;
	}

	public void adicionaFinal(T dado) {
		NO<T> novo = new NO<T>(dado);
		
		if(vazia()) {
			inicio = novo;
			novo.setAnterior(null);
			novo.setProximo(null);
		}else {
			NO<T> aux = buscaUltimo(this.inicio);
			aux.setProximo(novo);
			novo.setAnterior(aux);
			novo.setProximo(null);
		}
	}

	public void adicionaNaPosicao(T dado, int posicao) {
		if(!vazia()) {
			
			if(posicao == 0) {
				adicionaInicio(dado); 
				return ;
			}
			
			NO<T> aux = buscaNaPosicao(inicio, posicao);
			if(aux == null)
				System.out.println("Posicao invalida.");
			else {				
				NO<T> novo = new NO<T>(dado);
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
				novo.setAnterior(aux);
			}
			
		}else System.out.println("Lista esta Vazia");
		
	}
	
	public T removeDoInicio() {
		T resposta = null;
		
		if(vazia()) { 
			System.out.println("A lista esta vazia");
			return resposta;
		}
		
		resposta = this.inicio.getDado();
		this.inicio = this.inicio.getProximo();
		if(this.inicio != null) this.inicio.setAnterior(null);
		
		return resposta;
	}
	
	public T removeDoFinal() {
		T resposta = null;
		
		if(vazia()) { 
			System.out.println("A lista esta vazia");
			return resposta;
		}
		
		if(this.inicio.getProximo() == null) {
			resposta = this.inicio.getDado();
			inicio = null;
			return resposta;
		}
		
		NO<T> aux = buscaUltimo(this.inicio);
		resposta = aux.getDado();
		aux.getAnterior().setProximo(null);
		aux.setAnterior(null);
		
		return resposta;
	}
	
	public T removeDaPosicao(int posicao) {
		T resposta = null;
		
		if(vazia()) return resposta;
		
		if(posicao == 1) return removeDoInicio();
		
		NO<T> aux = buscaNaPosicao(inicio, posicao);
		if(aux == null)
			System.out.println("Posicao invalida.");
		else {
			aux.getAnterior().setProximo(aux.getProximo());
			aux.getProximo().setAnterior(aux.getAnterior());
		}
		
		return resposta;
	}
	
	public String mostrarElementos() {
		return elementos(this.inicio, "");
	}
	
	public String elementos(NO<T> aux, String r) {
		if(aux!=null) {
			r= r + " - " + paraString(aux.getDado());
			return elementos(aux.getProximo(), r);
		}
		return r;
	}
	
	protected String paraString(T valor) {
		return String.valueOf(valor) ;
	}
	
	public int contar() {
		int count = 1;
		NO<T> aux = this.inicio;
		while(aux.getProximo() != null) {
			count++;
			aux = aux.getProximo();
		}
		
		return count;
	}
	
	private NO<T> mergeSort(NO<T> no){
		if(no == null || no.getProximo() == null)
			return no;
		
		NO<T> meio = getNoMeio(no);
		NO<T> segundaMetade = meio.getProximo();
		meio.setProximo(null); // fica definido como ultimo da sua sublista
		segundaMetade.setAnterior(null); // fica definido como o primeiro da sua sub lista
		
		return merge(mergeSort(no), mergeSort(segundaMetade));
	}
	
	private NO<T> getNoMeio(NO<T> no) {
	    NO<T> a = no;
	    NO<T> b = no.getProximo();
	    
	    while(b != null && b.getProximo() != null) {
	      a = a.getProximo();
	      b = b.getProximo().getProximo();
	    }
	    
	    return a;
	}
	
	private NO<T> merge(NO<T> primeiro, NO<T> segundo) {
		NO<T> aux = new NO<T>();
		NO<T> lista = aux;
		
		while(primeiro != null &&  segundo != null) {
			if(comparar(primeiro.getDado(), segundo.getDado() ) < 0) {
				aux.setProximo(primeiro);
				primeiro = primeiro.getProximo();
			}else {
				aux.setProximo(segundo);
				segundo = segundo.getProximo();
			}
			aux = aux.getProximo();
		}
		
		if(primeiro == null) aux.setProximo(segundo);
		else aux.setProximo(primeiro);
		
		return lista.getProximo();
	}

	

	public void ordernarMergeSort() {
		NO<T> a = mergeSort(inicio);
		this.inicio = a;
	}
	
	
	protected int comparar(T e1,T e2) {
		@SuppressWarnings("unchecked")
		Comparable<T> chave = (Comparable<T>) e1;
		if(chave.compareTo(e2) < 0) {
			return -1;
		}else if(chave.compareTo(e2) > 0) {
			return 1;
		}
		return 0;
	}
}
