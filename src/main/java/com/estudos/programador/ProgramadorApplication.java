package com.estudos.programador;


import java.util.Stack;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Stack<String> stackInicial = new Stack<>();
		stackInicial.push("Lucas Amaral");
		stackInicial.push("Giovana");
		System.out.println("Valor sem exclusão: " + stackInicial);
		stackInicial.pop();
		System.out.println();
		System.out.println("Valor após a exclusão: " + stackInicial);
	}
}
