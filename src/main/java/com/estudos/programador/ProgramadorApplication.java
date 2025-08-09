package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setCpf("48177720856");
		pessoa.setAge(25);
		pessoa.setName("Lucas Amaral");
		pessoa.setIncome(3000.0);
		pessoa.mensagemPf();
		pessoa.mensagemGenerica();
		pessoa.mensagemGenerica(2);

		EmpresaCnpj empresa = new EmpresaCnpj();
		empresa.setCnpj("35211420859");
		empresa.setIncome(100000.00);
		empresa.mensagemPj();
		empresa.mensagemGenerica();
	}

}
