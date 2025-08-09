package com.estudos.programador;


public class Cliente {

    /*aqui se aplica o encapsulamento para proteger as variáveis.
    - uso de getters e setters;
    - get - pegar/mostrar informações
    - set - alterar ou incluir informações;
    - encapsular ele cria barreiras para não ser acessado em qualquer lugar
    - cria abstração.
     */

    private String name;
    private String cpf;
    private double income;
    private int age;
    private String cnpj;

    public void mensagemGenerica(){
        System.out.println("Cadastro realizado com sucesso!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
