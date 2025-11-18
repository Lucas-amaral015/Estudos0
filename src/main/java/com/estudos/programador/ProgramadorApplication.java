package com.estudos.programador;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NinjaGeneric lista = new NinjaGeneric<>();

		int numeroDigitado = 0;

		while(numeroDigitado != 4){

			lista.mostrarConteudo();
			numeroDigitado = sc.nextInt();
			sc.nextLine();

			switch (numeroDigitado){
				case 1:
					System.out.println("Digite o Nome:");
					String nome = sc.nextLine();
					System.out.println("Digite a idade:");
					int idade = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite aldeia:");
					String aldeia = sc.nextLine();
					lista.adicionarNinja(new Ninja(nome, idade, aldeia));
					System.out.println("Adicionado com sucesso!");
					break;

				case 2:
					lista.listarNinja();
					break;

				case 3:
					lista.deletarNinja();
					System.out.println("deletado");
					break;

				default:
					System.out.println("Número incorreto! Digite um número válido");
			}
		}
	}
}
