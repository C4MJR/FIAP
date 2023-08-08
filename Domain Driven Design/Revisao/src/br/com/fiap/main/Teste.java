package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {

		//String name, int age, double renda, String email, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Informe o nome da pessoa fisica"),
				inteiro("Digite a idade:"),
				real("Informe a renda:"),
				texto("Digite o email da pessoa:"),
				texto("Digite o CPF:"));
	
		//String name, int age, double renda, String email, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Informe o nome da empresa"),
				inteiro("Digite a idade:"),
				real("Informe a renda:"),
				texto("Digite o email da pessoa:"),
				texto("Digite o CPF:"));
		
		System.out.println(objPf.identificador());
		System.out.println("Nome da pessoa fisica: " + objPf.getName() +
				"\nCPF:" + objPf.getCpf()+
				"\nTaxa, Pessoa Fisica: "  + objPf.pagarTaxa());
		
		System.out.println(objPj.identificador());
		System.out.println("Nome da empresa:" + objPj.getName() + 
				"\nCNPJ:" + objPj.getCnpj()+
				"\nTaxa, Pessoa Juridica:" + objPj.pagarTaxa());
	
	}

}
