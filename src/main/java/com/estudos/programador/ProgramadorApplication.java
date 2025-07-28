package com.estudos.programador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		ArrayList<Integer> idades = new ArrayList<>(); //Cria uma lista de INTEIROS (Integer)
		idades.add(25); //.add  porque ArrayList é um objeto, e .add() é o mét. oficial para adicionar elementos a ele                               // operador <> significa diamante e dentro dele coloca o parametro do tipo
		idades.add(33);

		idades.get(0);



	}

}
