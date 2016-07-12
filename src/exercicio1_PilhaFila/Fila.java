package exercicio1_PilhaFila;

public class Fila {

	public static String[] fila = new String[10];
	int cabeca = 0;
	int cauda = 0;
	int tamanhoDaFila;

	public Fila() {
		inicializarFila();
		tamanhoDaFila = 0;
	}

	public void inicializarFila() {
		for (int i = 0; i < fila.length; i++) {
			fila[i] = "";
		}
	}

	public void enqueue(String elemento){

		// se a pilha esta cheia
		if (isFull() == true) {
			System.out.println("A pilha está cheia.");

			// se a pilha nao esta cheia e nem esta vazia
		} else {

			fila[cauda] = elemento;
			
			// verifica se o apontador da cauda esta depois do final da
			// ultima posicao da fila
			if (cauda + 1 == fila.length) {
				cauda = 0;
			} else {
				cauda = cauda + 1;	
			}
			
			tamanhoDaFila += 1;
	
		}
	}

	public String dequeue() {

		String elementoRemovido;
		if (isEmpty() == true) {
			System.out.println("Pilha Vazia");
			return "";
		} else {

			// verifica se o apontador da cabeca esta depois do final da ultima
			// posicao da fila
			if (cabeca + 1 == fila.length) {
				elementoRemovido = fila[cabeca];
				fila[cabeca] = "";
				cabeca = 0;
			} else {
				elementoRemovido = fila[cabeca];
				fila[cabeca] = "";
				cabeca = cabeca + 1;
			}
			
			tamanhoDaFila -=1;

			return elementoRemovido;
		}
	}

	public boolean isFull() {
		if ((cabeca == 0) && (cauda == fila.length - 1)) {
			return true;
		} else {
			if (cauda + 1 == cabeca) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean isEmpty() {
		if (cauda == cabeca) {
			if ((fila[cabeca].equals("") == true) && (fila[cauda].equals("") == true)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
