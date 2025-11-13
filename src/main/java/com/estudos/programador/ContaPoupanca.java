package com.estudos.programador;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, String cpf, TipoConta tipoConta) {
        super(nome, cpf, tipoConta);
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta Poupança: " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta poupança: " + valor);
        System.out.println("ATENÇÃO!! Taxa de 10% cobrada em cada transação.");
        valor -= (valor * 0.1);
        this.setSaldo(getSaldo() + valor);
    }
}
