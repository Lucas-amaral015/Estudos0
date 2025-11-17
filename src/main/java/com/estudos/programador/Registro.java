package com.estudos.programador;

import java.util.ArrayList;
import java.util.List;

public class Registro<T> {

    private List<T> registro;

    public Registro() {
        this.registro = new ArrayList<>();
    }

    public void adicionarRegistro(T registroGenerico){
        registro.add(registroGenerico);
    }

    public void mostrarRegistro(){
        for (T registroRealizado : registro){
            System.out.println(registroRealizado);
        }
    }
    public List<T> getRegistro() {
        return registro;
    }

    public void setRegistro(List<T> registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Registro: " + registro.toString() + " criado";
    }
}
