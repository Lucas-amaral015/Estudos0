package com.estudos.programador;


import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Ninja ninja = new Ninja();
		ninja.idade = 15;
		ninja.missao = "Derrotar Gaara";
		ninja.nivelDificuldade = "Difícil";
		ninja.statusMissao = "a realizar";
		ninja.nome = "Naruto";
		ninja.mostrarInformações();
		System.out.println();

		Uchiha uchiha = new Uchiha();

		uchiha.habilidadeEspecialAtributo = "Ativar Sharingan!!";
		uchiha.idade = 18;
		uchiha.nome = "Sasuke";
		uchiha.missao = "achar Naruto";
		uchiha.nivelDificuldade = "Média";
		uchiha.statusMissao = "Fazendo";
		uchiha.mostrarInformações();


	}
}
