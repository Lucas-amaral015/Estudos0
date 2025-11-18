package com.estudos.programador;

public class Registro {

    private String nome;
    private int idade;
    private String cidade;

    public Registro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Registro(String nome, int idade, String cidade) {
        this(nome, idade);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "nome= " + nome + '\'' +
                ", idade= " + idade +
                ", cidade= " + cidade + '\'' +
                '}';
    }
}
