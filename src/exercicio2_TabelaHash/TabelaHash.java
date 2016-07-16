package exercicio2_TabelaHash;

public class TabelaHash {

	ListaEncadeada [] arrayDaTabelaHash = new ListaEncadeada[26];
	int chavePadrao;

	public TabelaHash() {
		calcularVariavelDaChave();
		inicializarArray();
	}

	public void calcularVariavelDaChave() {
		char letraA = 'A';
		chavePadrao = letraA;
	}
	
	public void inicializarArray(){
		for (int i = 0; i < arrayDaTabelaHash.length; i++) {
			ListaEncadeada listaEncadeada = new ListaEncadeada();
			arrayDaTabelaHash[i] = listaEncadeada;
		}
	}

	public void inserirContato(String nome, String email, String telefone) {

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.adicionarEmail(email);
		contato.adicionarTelefone(telefone);
		
		char letraDoContato = contato.getNome().charAt(0);
		int chaveDoContato = letraDoContato;

		int funcaoHash = (chaveDoContato - chavePadrao) % 26;
		
		if (arrayDaTabelaHash[funcaoHash] == null) {

			//arrayDaTabelaHash[funcaoHash].setAnterior(null);
			arrayDaTabelaHash[funcaoHash].setContato(contato);
			//arrayDaTabelaHash[funcaoHash].setProximo(null);

		} else {

			ListaEncadeada novaListaEncadeada = new ListaEncadeada();
			novaListaEncadeada.setProximo(arrayDaTabelaHash[funcaoHash]);
			novaListaEncadeada.setContato(contato);
			novaListaEncadeada.setAnterior(null);

			arrayDaTabelaHash[funcaoHash].setAnterior(novaListaEncadeada);
			arrayDaTabelaHash[funcaoHash] = novaListaEncadeada;

		}

	}

	public Contato pesquisarContato(String nomeDoContato) {
		Contato contato = new Contato();

		int posicao = 0;
		boolean flagContatoEncontrado = false;
		
		while((posicao < arrayDaTabelaHash.length) && (flagContatoEncontrado == false)){
			
			ListaEncadeada listaAuxiliar = arrayDaTabelaHash[posicao];
			while (listaAuxiliar != null) {
				
				if (listaAuxiliar.getContato().getNome().equals(nomeDoContato) == true) {
					contato = arrayDaTabelaHash[posicao].getContato();
					flagContatoEncontrado = true;
				} else {
					listaAuxiliar = listaAuxiliar.getProximo();
				}
			}
			
			posicao = posicao + 1;
			
		}

		return contato;
	}

	public void removerContato(String nomeDoContato) {

		int posicao = 0;
		boolean flagContatoEncontrado = false;
		
		ListaEncadeada cabecaDaLista = null;
		boolean flagCabecaDaLista = true;
		
		while((posicao < arrayDaTabelaHash.length) && (flagContatoEncontrado == false)){
			
			while (arrayDaTabelaHash[posicao] != null) {
				
				//verifico se é o primeiro objeto da lista encadeada, se sim, salvo o mesmo
				if(flagCabecaDaLista == true){
					cabecaDaLista = arrayDaTabelaHash[posicao];
					flagCabecaDaLista = false;
				}
				
				if (arrayDaTabelaHash[posicao].getContato().getNome().equals(nomeDoContato) == true) {
					flagContatoEncontrado = true;
					
					arrayDaTabelaHash[posicao].getAnterior().setProximo(arrayDaTabelaHash[posicao].getProximo());
					arrayDaTabelaHash[posicao].getProximo().setAnterior(arrayDaTabelaHash[posicao].getAnterior());
					
				} else {
					arrayDaTabelaHash[posicao] = arrayDaTabelaHash[posicao].getProximo();
				}
			}
			
			arrayDaTabelaHash[posicao] = cabecaDaLista;
			
			posicao = posicao + 1;			
		}

	}
	
	public void listarContatos(){
		
		int posicao = 0;
		
		System.out.println("Listar Contatos\n");
		while(posicao < arrayDaTabelaHash.length){
			
			ListaEncadeada variavelAuxiliar = arrayDaTabelaHash[posicao];
			while (variavelAuxiliar.getContato() != null) {
				
				System.out.println("Nome do Contato: "+variavelAuxiliar.getContato().getNome());
				
				System.out.print("E-mail: ");
				variavelAuxiliar.getContato().listarEmails();
				
				System.out.print("Telefone: ");
				variavelAuxiliar.getContato().listarTelefones();
				
				System.out.println("\n");
				
				variavelAuxiliar = variavelAuxiliar.getProximo();
				
			}
			
			posicao = posicao + 1;
			
		}
		
		System.out.println();
		
	}

}
