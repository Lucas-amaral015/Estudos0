package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ProgramadorApplication {

	public static void main(String[] args) {

		byte letra = 10;
		short letraMais = 20; //mais bits
		int inteiros = 30;
		long numeroMaior = 40L;//mais bits
		float decimal = 5.5f;
		double decimalMaior = 15.99; // mais bits
		char caracter = 'A';
		boolean booleanos = true;

		System.out.println("byte: " + letra);
		System.out.println("short: " + letraMais);
		System.out.println("int: " + inteiros);
		System.out.println("long: " + numeroMaior);
		System.out.println("float: " + decimal);
		System.out.println("double: " + decimalMaior);
		System.out.println("char: " + caracter);
		System.out.println("boolean: " + booleanos);

	}
}
