package br.com.dio.main;

import br.com.dio.entity.Cliente;
import br.com.dio.entity.Conta;
import br.com.dio.entity.ContaCorrente;
import br.com.dio.entity.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
