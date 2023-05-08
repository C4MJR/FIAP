package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHeranca {
	
	static String texto (String j){
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		
		//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Digite o nome da empresa:"),
				texto("digite o email da empresa:"),
				inteiro("digite a idade da empresa:"),
				real("digite a renda da empresa:"),
				texto("digite a razao social da empresa:"),
				texto("digite o CNPJ da empresa"));
		
		//String nome, String email, int idade, double renda, String rg, String cpf)
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Digite o nome do Cliente:"),
				texto("digite o email do Cliente:"),
				inteiro("digite a idade do Cliente:"),
				real("digite a renda do Cliente:"),
				texto("Digite o RG do Cliente"),
				texto("Digite o CPF do Cliente"));
		
		Endereco objEndereco = new Endereco();
		objPessoaJuridica.setEndereco(objEndereco);
		objPessoaFisica.setEndereco(objEndereco);
		
		
		
		System.out.println("INFORMAÇOES DA EMPRESA");
		System.out.println("Nome da empresa:" + objPessoaJuridica.getNome()+
				"\nCNPJ:" + objPessoaJuridica.getCnpj()+
				"\nLogradouro:" + objPessoaJuridica.getEndereco()+
				"\nPJ:" + objPessoaJuridica.identificador());
		
		
		System.out.println("INFORMAÇOES DA PESSOA FISICA");
		System.out.println("Nome do Cliente:" + objPessoaFisica.getNome()+
				"\nRG:" + objPessoaFisica.getRg()+
				"\nLogradouro:" + objPessoaFisica.getEndereco()+
				"\nIndentificador:" + objPessoaFisica.identificador());
		
		
		
			
		}
		
	}

