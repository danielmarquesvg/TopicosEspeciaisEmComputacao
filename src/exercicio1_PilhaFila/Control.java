package exercicio1_PilhaFila;

public class Control {

	Pilha pilha = new Pilha();
	
	public void inserirExpressaoMatematica(String expressao) throws Exception{
		pilha.inserirExpressao(expressao);
	}
	
	public void limparCampo(){
		Panelinicial.textVerificacao.setText("");
	}

}
