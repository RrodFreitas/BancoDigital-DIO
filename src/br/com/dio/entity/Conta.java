package br.com.dio.entity;

import br.com.dio.entity.interfaces.ITransacao;

public class Conta implements ITransacao {

	private static final int AGENCY = 1;
	private static int SEQUENTIAL_CLIENT = 1;
	protected int agencia;
	protected int numeroCliente;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		super();
		this.agencia = AGENCY;
		this.numeroCliente = SEQUENTIAL_CLIENT++;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}
	
	@Override
	public void transferir(double valor, Conta beneficiarioConta) {
		this.sacar(valor);
		beneficiarioConta.depositar(valor);
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void imprimirExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroCliente));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
