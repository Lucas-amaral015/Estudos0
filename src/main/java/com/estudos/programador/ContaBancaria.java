package com.estudos.programador;

import java.math.BigDecimal;

public abstract class ContaBancaria implements Conta {

    private String nome;
    private String cpf;
    private TipoConta tipoConta;
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public ContaBancaria(String nome, String cpf, TipoConta tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void mostrarCadastro() {
        System.out.println("Nome: " + nome +
                           "\nCpf: " + cpf +
                           "\nTipo da Conta: " + tipoConta);
        System.out.println("Cadastro realizado com sucesso!");
    }
}
