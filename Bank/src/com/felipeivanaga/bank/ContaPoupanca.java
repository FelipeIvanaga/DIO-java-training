package com.felipeivanaga.bank;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("###Extro Conta Poupança");
        System.out.println(super.toString());
    }
}
