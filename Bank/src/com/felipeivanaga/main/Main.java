package com.felipeivanaga.main;

import com.felipeivanaga.bank.Cliente;
import com.felipeivanaga.bank.Conta;
import com.felipeivanaga.bank.ContaCorrente;
import com.felipeivanaga.bank.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente tyler = new Cliente();
        tyler.setNome("Tyler Durden");

        Conta cc = new ContaCorrente(tyler);
        Conta poupanca = new ContaPoupanca(tyler);

        cc.depositar(320);
        cc.tranferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
