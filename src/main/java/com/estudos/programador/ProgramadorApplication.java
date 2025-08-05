package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int option = sc.nextInt();

		switch (option){
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			case 7 -> System.out.println("Sábado");
			default -> System.out.println("Número inválido!!");
		}

		sc.close();
	}

}
