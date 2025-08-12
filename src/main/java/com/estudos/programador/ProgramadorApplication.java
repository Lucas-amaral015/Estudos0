package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PessoaFisica pessoa = new PessoaFisica();

		System.out.println("Digite seu nome:");
		pessoa.setName(sc.nextLine());

		System.out.println("Digite o CPF:");
		pessoa.setCpf(sc.nextLine());

		System.out.println("Cadastro realizado com sucesso!");

		System.out.println("Digite sua idade:");
		pessoa.setAge(sc.nextInt());

		System.out.println("Digite sua renda mensal:");
		pessoa.setIncome(sc.nextDouble());
		pessoa.regraNegocio();






		/*PessoaFisica pessoa = new PessoaFisica();
		pessoa.setCpf("48177720856");
		pessoa.setName("Lucas Amaral");
		pessoa.setIncome(3000.0);
		pessoa.mensagemPf();
		pessoa.mensagemGenerica();
		pessoa.mensagemGenerica(2);
		pessoa.emprestimo();
		pessoa.regraNegocio();

		EmpresaCnpj empresa = new EmpresaCnpj();
		empresa.setCnpj("35211420859");
		empresa.setIncome(100000.00);
		empresa.mensagemPj();
		empresa.mensagemGenerica();
		empresa.emprestimo();

		 */

		sc.close();
	}

}
