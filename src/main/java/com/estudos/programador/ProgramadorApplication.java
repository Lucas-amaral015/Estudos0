package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a nota 3: ");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) /3;

		System.out.println("média final: " + media);






	}

}
