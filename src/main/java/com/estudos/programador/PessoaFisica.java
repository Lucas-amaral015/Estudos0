package com.estudos.programador;

public class PessoaFisica extends Cliente implements emprestimoInterface{

    public void mensagemPf() {
        System.out.println("Eu sou PF!");
    }

    /* nessa feature alterei para construir interfaces para servir de ligação para qualquer classe.
    ou seja utilizar a mesma função atraves de uma classe interface
    - atraves de interfaces eu crio o proprio parâmetro para ser retornado.

     */
    public void emprestimo(){
        System.out.println("Parabéns!! Seu empréstimo pode ser solicitado como PF");
    }


    public void mensagemGenerica(int number) {
        System.out.println("Eu sou o cadastrado de numero :" + number);
    }
}
