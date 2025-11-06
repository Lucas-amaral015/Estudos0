package com.estudos.programador;


import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		String[][] nomesEIdade = new String[2][3];

		nomesEIdade[0][0] = "Lucas";
		nomesEIdade[0][1] = "25";
		nomesEIdade[0][2] = "Brasil";

		nomesEIdade[1][0] = "Giovana";
		nomesEIdade[1][1] = "27";
		nomesEIdade[1][2] = "EUA";

		for (int i = 0; i < nomesEIdade.length; i++){
			System.out.println("nome: " + nomesEIdade[i] [0] + "\nidade : " + nomesEIdade[i][1] + "\nNacionalidade: " + nomesEIdade[i][2]);
			System.out.println();
		}
	}

}
