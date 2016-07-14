package exercicio2_TabelaHash;

public class TabelaHash {

	ListaEncadeada [] listaEncadeada = new ListaEncadeada [26];
	int chavePadrao;
	
	public TabelaHash(){
		calcularVariavelDaChave();
	}
	
	public void calcularVariavelDaChave(){
		char letraA = 'A';
		chavePadrao = letraA;
	}
	
	public void inserirContato(Contato contato){
		
		char letraDoContato = contato.getNome().charAt(0);
		int chaveDoContato = letraDoContato;
		
		int funcaoHash = (chaveDoContato - chavePadrao) % 26;
		
		if(listaEncadeada[funcaoHash] == null){
			
			listaEncadeada[funcaoHash].setAnterior(null);
			listaEncadeada[funcaoHash].setContato(contato);
			listaEncadeada[funcaoHash].setProximo(null);
			
		} else {
			
			ListaEncadeada novaListaEncadeada = new ListaEncadeada();
			novaListaEncadeada.setProximo(listaEncadeada[funcaoHash]);
			novaListaEncadeada.setContato(contato);
			novaListaEncadeada.setAnterior(null);
			
			listaEncadeada[funcaoHash].setAnterior(novaListaEncadeada);
			listaEncadeada[funcaoHash] = novaListaEncadeada;
			
		}
		
	}
	
	public Contato pesquisarContato(String nomeDoContato){
		Contato contato = null;
		return contato;
	}

}
