package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.cpf = "48177720856";
		pessoa.age = 25;
		pessoa.name = "Lucas Amaral";
		pessoa.income = 3000.00;
		pessoa.mensagemPf();
		pessoa.mensagemGenerica();
		pessoa.mensagemGenerica(2);

		EmpresaCnpj empresa = new EmpresaCnpj();
		empresa.cnpj = "35211420859";
		empresa.income = 100000.00;
		empresa.mensagemPj();
		empresa.mensagemGenerica();
	}

}
