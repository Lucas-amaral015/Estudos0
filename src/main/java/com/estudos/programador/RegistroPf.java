package com.estudos.programador;

public class RegistroPf {

    private String nome;

    public RegistroPf(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cadastro PF: " + nome + " criado com sucesso.";
    }
}
