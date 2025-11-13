package com.estudos.programador;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nome, String cpf, TipoConta tipoConta){
        super(nome, cpf, tipoConta);
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("saldo atual da conta corrente: " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado na conta corrente: "+ valor);
        System.out.println("ATENÇÃO!! Taxa de 5% cobrada em cada transação.");
        valor -= (valor * 0.05);
        this.setSaldo(getSaldo() + valor);
    }

}
