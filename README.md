# Gerenciamento de Contas Bancárias

Este projeto Java é a solução para um desafio de Programação Orientada a Objetos (POO), focado na modelagem de um sistema de contas bancárias utilizando interfaces, classes abstratas e herança. O objetivo principal é definir comportamentos comuns e específicos para diferentes tipos de contas através de uma arquitetura limpa e organizada.

---

## 🛠 Estrutura e Conceitos POO

O projeto é construído em torno de quatro componentes principais, atendendo aos requisitos do desafio:

### 1. Interface `Conta`
Define o contrato de comportamento para todas as contas.
* `consultarSaldo()`
* `depositar(double valor)`
* `mostrarCadastro()`

### 2. Classe Abstrata `ContaBancaria`
Serve como a classe base (superclasse) para todas as contas concretas.
* Implementa a interface `Conta`.
* Contém atributos comuns: `nome`, `cpf`, `tipoConta` (Enum), e `saldo` (double).
* O método `depositar(double valor)` é deixado como **abstrato** para que as subclasses implementem suas regras específicas.

### 3. Classes Concretas (Subclasses)

Ambas as classes concretas estendem a classe abstrata **ContaBancaria** e implementam suas regras de depósito específicas:

A **ContaCorrente** estende `ContaBancaria` e implementa o método `depositar()` adicionando o valor diretamente ao saldo. Já a **ContaPoupanca** também estende `ContaBancaria`, mas implementa o método `depositar()` adicionando o valor ao saldo após a dedução de uma taxa.

### 4. Enum `TipoConta`
Usado para tipificar de forma segura os tipos de conta.
* **Constantes:** `CORRENTE`, `POUPANCA`.