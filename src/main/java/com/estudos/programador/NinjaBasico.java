package com.estudos.programador;

public class NinjaBasico implements NinjaInterface{

    private String nome;
    private int idade;
    private TipoHabilidade tipoHabilidade;

    public NinjaBasico(){}

    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
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

    public TipoHabilidade getTipoHabilidade() {
        return tipoHabilidade;
    }

    public void setTipoHabilidade(TipoHabilidade tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("HABILIDADE DE " + tipoHabilidade + " DO NINJA BÁSICO ATIVADA! " );
    }
}
