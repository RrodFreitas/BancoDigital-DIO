package br.com.dio.entity;

public class PessoaJuridica {

	private String nomeCliente;
	private String nomeFantasia;
	private String cnpj;
	
	public PessoaJuridica(String nomeFantasia, String nomeCliente, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.nomeCliente = nomeCliente;
		this.cnpj = cnpj;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void EscreveCliente() {
		System.out.println(String.format("Nome Fantasia: %s",this.getNomeFantasia()));
		System.out.println(String.format("CNPJ: %s",this.getCnpj()));
	}
}
