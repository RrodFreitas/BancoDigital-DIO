package br.com.dio.entity;

public class PessoaFisica {

	private String nomeCliente;
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nomeCliente, String cpf, String rg) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public void EscreveCliente(){
		System.out.println(String.format("RG: " + this.getRg()));
		System.out.println(String.format("CPF: " + this.getCpf()));
	}

	public String getNome() {
		return this.nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

}
