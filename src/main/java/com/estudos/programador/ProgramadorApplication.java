package com.estudos.programador;


import java.util.*;

public class ProgramadorApplication {

	public static void main(String[] args) {

		List<Registro> registro = new LinkedList<>();
		registro.add(new Registro("Lucas amaral", 25, "Sorocaba"));
		registro.add(new Registro("Giovana", 27, "Sorocaba"));
		registro.add(new Registro("José", 19, "São Paulo"));
		registro.add(new Registro("Eduardo", 24, "São Paulo"));
		registro.add(new Registro("Joana", 21, "Sorocaba"));
		System.out.println();

		// utilizando filter
		registro.stream()
				.filter(registro1 -> registro1.getCidade().equals("São Paulo"))
				.forEach(System.out::println);

		System.out.println();

		//utilizando sorted
		registro.stream()
				.sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
				.forEach(System.out::println);
		System.out.println();

		//ordenar por ordem alfabética
		registro.stream()
				.sorted((nome1,nome2) -> nome1.getNome().compareTo(nome2.getNome()))
				.forEach(System.out::println);

		//Mapear para mostrar somente um determinado atributo
		registro.stream()
				.map(Registro::getNome)
				.forEach(System.out::println);


	}
}
