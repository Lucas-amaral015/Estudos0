package com.estudos.programador;

public class EmpresaCnpj extends Cliente implements emprestimoInterface{

    public void mensagemPj() {
        System.out.println("Olá eu sou empresa CNPJ!!");
    }

    public void emprestimo (){
        System.out.println("Parabéens! pode solicitar seu empréstimo como PJ.");
    }
}
