package com.estudos.programador;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;
    TipoHabilidade tipoHabilidade;

    public Ninja(){}

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    public Ninja(String nome, String aldeia, int idade, TipoHabilidade tipoHabilidade) {
        this(nome, aldeia, idade);
        this.tipoHabilidade = tipoHabilidade;
    }
}
