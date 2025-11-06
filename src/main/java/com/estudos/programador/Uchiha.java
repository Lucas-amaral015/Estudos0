package com.estudos.programador;

public class Uchiha extends Ninja{

    String habilidadeEspecialAtributo;

    public void mostrarPoder(){
        System.out.println("meu poder é " + habilidadeEspecialAtributo);
    }


    @Override
    public void mostrarInformações() {
        super.mostrarInformações();
        mostrarPoder();

    }
}
