package com.estudos.programador;

public class NinjaPro extends NinjaBasico implements NinjaInterface{

    private String especialidade;

    public NinjaPro(){}

    public NinjaPro(String especialidade, String nome, TipoHabilidade tipoHabilidade,int idade){
        super(nome, idade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("Habilidade: " + getTipoHabilidade());
        System.out.println("especialidade: " + getEspecialidade());
    }

    @Override
    public void executarHabilidade() {
        System.out.println("HABILIDADE NINJA PRO DE " + getTipoHabilidade() + " ATIVADO!");
    }
}
