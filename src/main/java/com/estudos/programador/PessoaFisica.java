package com.estudos.programador;

public class PessoaFisica extends Cliente{

    public void mensagemPf() {
        System.out.println("Eu sou PF!");
    }

    /*polimorfismo = serve para reaproveitar o código, por exemplo, na classe
    PessoaFisica eu peguei a função mensagemGenerica e reescrevi outra coisa em específico.

   aqui a anotation é para sobreescrita, ou seja, para garantir que a função está sendo acessada corretamente(escrita)
     */
    @Override
    public void mensagemGenerica() {
        System.out.println("Cadastro realizado com sucesso! E eu sou Pessoa Física com CPF");
    }

    /*Aqui apliquei a sobrecarca de funções atraves de uma assinatura(parâmetro)
    interpolei a string com o tipo int.
    -- ou seja apliquei uma "assinatura".
     */
    public void mensagemGenerica(int number) {
        System.out.println("Eu sou o cadastrado de numero :" + number);
    }
}
