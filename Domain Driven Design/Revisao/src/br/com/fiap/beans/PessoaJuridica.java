package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	

	public PessoaJuridica() {
		super();
	}

	
	public PessoaJuridica(String name, int age, double renda, String email, String cnpj) {
		super(name, age, renda, email);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public String identificador() {
		return "INFORMAÇÕES, PessoaJuridica";
	}

	@Override
	public double pagarTaxa() {
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 20/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}
	
}