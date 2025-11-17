package com.estudos.programador;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramadorApplication {

	public static void main(String[] args) {

		Registro<Object> registro = new Registro<>();
		registro.adicionarRegistro(new RegistroPj("Nossa Ginga"));
		registro.adicionarRegistro(new RegistroPf("Lucas Amaral"));
		registro.mostrarRegistro();

	}
}
