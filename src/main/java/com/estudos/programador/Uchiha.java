package com.estudos.programador;

public class Uchiha extends Ninja implements mostrarDetalhesInterface{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, TipoHabilidade tipoHabilidade) {
        super(nome, aldeia, idade, tipoHabilidade);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome +
                "\nAldeia: " + aldeia +
                "\nTipo de Habilidade: " + tipoHabilidade);
    }
}
