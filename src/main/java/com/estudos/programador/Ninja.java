package com.estudos.programador;

public class Ninja {

    private String nome;
    private int idade;
    private String aldeia;


    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Ninja(String nome, int idade, String aldeia){
        this(nome, idade);
        this.aldeia = aldeia;
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
        return "nome: " + nome + "\nIdade: " + idade + "\nAldeia: " + aldeia;
    }
}
