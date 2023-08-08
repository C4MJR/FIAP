package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{

	public String cpf;
	
	
	public PessoaFisica() {
		super();
	}

	
	public PessoaFisica(String name, int age, double renda, String email, String cpf) {
		super(name, age, renda, email);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String identificador() {
		return "INFORMAÇÕES, PessoaFisica";
	}

	@Override
	public double pagarTaxa() {
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 12/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}
	
}