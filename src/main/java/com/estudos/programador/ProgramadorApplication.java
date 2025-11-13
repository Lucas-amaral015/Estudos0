package com.estudos.programador;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		ContaPoupanca contaPoupanca = new ContaPoupanca("Lucas", "481.777.978-89", TipoConta.POUPANCA);
		contaPoupanca.mostrarCadastro();
		contaPoupanca.setSaldo(100);
		contaPoupanca.consultarSaldo();
		System.out.println();
		contaPoupanca.depositar(100);
		contaPoupanca.consultarSaldo();
		System.out.println();

		ContaCorrente contaCorrente = new ContaCorrente("Giovana", "481.405.508-56", TipoConta.CORRENTE);
		contaCorrente.mostrarCadastro();
		contaCorrente.setSaldo(200);
		contaCorrente.consultarSaldo();
		System.out.println();
		contaCorrente.depositar(100);
		contaCorrente.consultarSaldo();




	}
}
