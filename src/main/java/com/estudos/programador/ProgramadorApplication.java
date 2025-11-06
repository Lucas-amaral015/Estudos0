package com.estudos.programador;


import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MenuInicial menu = new MenuInicial();

		int opcao = 0;
		int CADASTRO_MAXIMO = 2;
		String cadastroRealizado;
		int guardarCadastro = 0;

		String[] cadastrarPessoa = new String[CADASTRO_MAXIMO];

		while (opcao != 3) {

			menu.mensagemInicial();
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao){

				case 1:
					if (guardarCadastro < CADASTRO_MAXIMO){
						System.out.println("Digite o nome da pessoa");
						cadastroRealizado = sc.nextLine();
						cadastrarPessoa[guardarCadastro] = cadastroRealizado;
						guardarCadastro++;
						System.out.println("Cadastro realizado com sucesso");
					}
					else {
						System.out.println("Todos espaços preenchidos!");
					}
					break;

				case 2:
					if (guardarCadastro == 0){
						System.out.println("Nenhum cadastro realizado! Cadastre para ver as opções.");
					}
					else {
						for (String mostrarLista : cadastrarPessoa){
							System.out.println(mostrarLista);
						}
					}
					break;

				case 3:
					System.out.println("Encerrando programa...");
					break;

				default:
					System.out.println("Número invalido! tente novamente");
			}
		}
	}

}
