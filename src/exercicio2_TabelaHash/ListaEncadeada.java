package exercicio2_TabelaHash;

public class ListaEncadeada {

	ListaEncadeada anterior;
	Contato contato;
	ListaEncadeada proximo;
	
	public ListaEncadeada getAnterior() {
		return anterior;
	}

	public void setAnterior(ListaEncadeada anterior) {
		this.anterior = anterior;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public ListaEncadeada getProximo() {
		return proximo;
	}

	public void setProximo(ListaEncadeada proximo) {
		this.proximo = proximo;
	}

}
