package exercicio2_TabelaHash;

import java.util.ArrayList;

public class Contato {

	public String nome;
	public ArrayList<String> listaDeTelefones = new ArrayList<String>();
	public ArrayList<String> listaDeEmails = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarTelefone(String numeroDoTelefone) {
		listaDeTelefones.add(numeroDoTelefone);
	}

	public void removerTelefone(String numeroDoTelefone) {

		int posicao = 0;
		boolean flagNumeroRemovido = false;

		while ((posicao < listaDeTelefones.size()) && (flagNumeroRemovido == false)) {
			if (listaDeTelefones.get(posicao).equals(numeroDoTelefone) == true) {
				listaDeTelefones.remove(posicao);
				flagNumeroRemovido = true;
			} else {
				posicao = posicao + 1;
			}

		}

	}

	public void listarTelefones() {

		if (listaDeTelefones.size() == 0) {
			System.out.print("Nenhum telefone cadastrado\n");
		} else {
			for (int i = 0; i < listaDeTelefones.size(); i++) {
				System.out.print(listaDeTelefones.get(i));
			}
		}

	}

	public void adicionarEmail(String email) {
		listaDeEmails.add(email);
	}

	public void removerEmail(String email) {

		int posicao = 0;
		boolean flagEmailRemovido = false;

		while ((posicao < listaDeEmails.size()) && (flagEmailRemovido == false)) {
			if (listaDeEmails.get(posicao).equals(email) == true) {
				listaDeEmails.remove(posicao);
				flagEmailRemovido = true;
			} else {
				posicao = posicao + 1;
			}

		}

	}

	public void listarEmails() {

		if (listaDeEmails.size() == 0) {
			System.out.println("Nenhum e-mail cadastrado\n");
		} else {
			for (int i = 0; i < listaDeEmails.size(); i++) {
				System.out.println(listaDeEmails.get(i));
			}
		}
	}

}
