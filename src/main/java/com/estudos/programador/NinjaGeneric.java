package com.estudos.programador;

import java.util.LinkedList;

public class NinjaGeneric <T> implements Conteudo{

    private LinkedList<T> listaNinja;

    public NinjaGeneric() {
        this.listaNinja = new LinkedList<>();
    }

    public LinkedList<T> getListaNinja() {
        return listaNinja;
    }

    public void adicionarNinja(T adicionar){
        listaNinja.addFirst(adicionar);
    }

    public void listarNinja(){
        for(int i = 0; i < listaNinja.size(); i++){
            System.out.println((i + 1) + "° Cadastro: \n" + listaNinja.get(i));
            System.out.println();
        }
    }

    public void deletarNinja(){
        listaNinja.remove();
    }

    @Override
    public void mostrarConteudo() {
        System.out.println("Bem vindo ao Cadastro de Ninjas");
        System.out.println("1 - Cadastrar novo Ninja.");
        System.out.println("2 - Listar Ninjas.");
        System.out.println("3 - Deletar Ninja.");
        System.out.println("4 - Sair do Programa.");
        System.out.println("Digite a opção desejada:");
    }
}
