package exercicio1_PilhaFila;

import java.awt.geom.FlatteningPathIterator;

public class Pilha {

	Fila fila1 = new Fila();
	Fila fila2 = new Fila();
	int contadorAbreParenteses;
	int contadorFechaParenteses;
	boolean analisador = false;

	public void inserirExpressao(String expressao) {
		
		contadorAbreParenteses = 0;
		contadorFechaParenteses = 0;
		
		for (int i = 0; i < expressao.length(); i++) {
			
			String elemento = expressao.substring(i, i + 1);

			if (elemento.equals("(") == true) {
				contadorAbreParenteses = contadorAbreParenteses + 1;
				push(elemento);
			}
			
			if (elemento.equals(")") == true)
			{
				contadorFechaParenteses = contadorFechaParenteses + 1;
				try {
					pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		if(contadorAbreParenteses - contadorFechaParenteses == 0){
			analisador = false;
		} else {
			analisador = true;
		}

		Panelinicial.textVerificacao.setText("Quantidade de Abre Parenteses: " + contadorAbreParenteses);
		
		Panelinicial.textVerificacao.setText(Panelinicial.textVerificacao.getText() + "\n"
				+ "Quantidade de Fecha Parenteses: " + contadorFechaParenteses);
		
		if(analisador == false){
			Panelinicial.textVerificacao.setText(Panelinicial.textVerificacao.getText() + "\n"
					+ "Análise da sintaxe: INCORRETA");
		} else {
			Panelinicial.textVerificacao.setText(Panelinicial.textVerificacao.getText() + "\n"
					+ "Análise da sintaxe: CORRETA");
		}

	}

	public void push(String elemento){
		String variavelAuxiliar;
		
		for (int i = 0; i < fila1.fila.length; i++) {
			variavelAuxiliar = fila1.dequeue();
			if(variavelAuxiliar.equals("(") == true){
				fila2.enqueue(variavelAuxiliar);
			}
		}

		fila1.enqueue(elemento);

		for (int i = 0; i < fila2.fila.length; i++) {
			variavelAuxiliar = fila2.dequeue();
			if(variavelAuxiliar.equals("(") == true){
				fila1.enqueue(variavelAuxiliar);
			}
		}
		
		
	}

	public String pop() throws Exception {
		return fila1.dequeue();
	}

	public String top() {
		return "";
	}

	public boolean isFull() {
		return true;
	}

	public boolean isEmpty() {
		return true;
	}

}
