package com.estudos.programador;

public class RegistroPj {

    private String nomePj;

    public RegistroPj(String nomePj) {
        this.nomePj = nomePj;
    }

    public String getNomePj() {
        return nomePj;
    }

    public void setNomePj(String nomePj) {
        this.nomePj = nomePj;
    }

    @Override
    public String toString() {
        return "Cadastro PJ: " + nomePj + " criado com sucesso.";
    }
}
