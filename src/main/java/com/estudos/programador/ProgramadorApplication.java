package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.cpf = "48177720856";
		pessoa.idade = 25;
		pessoa.name = "Lucas Amaral";
		pessoa.renda = 3000.00;
		pessoa.mensagem();
		pessoa.mensagemGenerica();

		EmpresaCnpj empresa = new EmpresaCnpj();
		empresa.cnpj = "35211420859";
		empresa.renda = 100000.00;
		empresa.mensagem();
		empresa.mensagemGenerica();
	}

}
