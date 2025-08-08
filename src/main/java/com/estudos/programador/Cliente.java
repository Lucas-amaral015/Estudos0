package com.estudos.programador;


public class Cliente {

    /*aqui se aplica herança, onde a classe mãe é Cliente e as filhas
    são: EmpresasCnpj e PessoaFisica.

     */

    String name;
    String cpf;
    double income;
    int age;
    String cnpj;

    public void mensagemGenerica(){
        System.out.println("Cadastro realizado com sucesso!");
    }
}
