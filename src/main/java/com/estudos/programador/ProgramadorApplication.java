package com.estudos.programador;


import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		NinjaBasico ninjaBasico = new NinjaBasico("Naruto", 16, TipoHabilidade.GENJUTSU);
		ninjaBasico.mostrarInformacoes();
		ninjaBasico.executarHabilidade();
		System.out.println();

		NinjaPro ninjaPro = new NinjaPro("Manipulação de Areia", "Gaara", TipoHabilidade.KATON, 20);
		ninjaPro.mostrarInformacoes();
		ninjaPro.executarHabilidade();
	}
}
