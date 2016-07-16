package exercicio2_TabelaHash;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		TabelaHash tabelaHash = new TabelaHash();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 5){
			System.out.print("Agenda ---------------------------------------------");
			System.out.println("\n");
			System.out.println("Opções da agenda");
			System.out.println("\t1- Inserir um novo contato");
			System.out.println("\t2- Pesquisar um contato");
			System.out.println("\t3- Listar contatos");
			System.out.println("\t4- Remover contato");
			System.out.println("\t5- Sair");
			
			System.out.print("\nDigite uma opção: ");
			opcao = scanner.nextInt();
			
			if(opcao == 1){
				
				
				
				System.out.print("\n\nInsira as informações do contato\n");
				
				System.out.print("Nome: ");
				String nome = scanner.next();
				System.out.print("E-mail: ");
				String email = scanner.next();
				System.out.print("Telefone: ");
				String telefone = scanner.next();
				
				tabelaHash.inserirContato(nome, email, telefone);
				System.out.println("Contato salvo!\n");
				
			} else {
				if(opcao == 2){
					
					System.out.print("\n\nPesquisar contato\n");
					
					System.out.print("Nome do contato a pesquisar: ");
					String nome = scanner.next();
					tabelaHash.pesquisarContato(nome);
					
				} else {
					if(opcao == 3){
						tabelaHash.listarContatos();
						
					} else {
						if(opcao == 4){
							
						} else {
							System.exit(1);
						}
					}
					
				}
			}
		}
		
	}

}
