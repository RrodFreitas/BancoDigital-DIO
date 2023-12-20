package br.com.dio.entity.interfaces;

import br.com.dio.entity.Conta;

public interface ITransacao {

	void sacar(double valor);
	
	void transferir(double valor, Conta beneficiarioConta);
	
	void depositar(double valor);
	
	void imprimirExtrato();
}
