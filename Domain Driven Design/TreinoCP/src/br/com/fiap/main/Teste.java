package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class Teste {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		objCliente.setNome("Carlos");
		objCliente.setIdade(17);
		objCliente.setPeso(0);
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
		//endereco
		
		objEndereco.setLogradouro("Rua wanda martin");
		objEndereco.setNumero(65);
		objEndereco.setCep("02615-030");
		objEndereco.setBairro("VNC");
		objEndereco.setMunicipio("SP");
		objEndereco.setEstado("SP");
		
		//TELEFONE
		
		objTelefone.setFoneFixo("11 9999999");
		objTelefone.setFoneCelular("11 989918023");
		objTelefone.setFoneComercial("99999-9999");
		objTelefone.setFoneContato("95959595");
		
		//saida
		
		System.out.println("nome:" + objCliente.getNome()+
				"\nIdade: " + objCliente.getIdade()+
				"\nPeso:" + objCliente.getPeso()+
				"\nLogradouro: " + objCliente.getEndereco().getLogradouro()+
				"\nNumero: " + objCliente.getEndereco().getNumero()+
				"\nCep: " + objCliente.getEndereco().getCep()+
				"\nBairro: " + objCliente.getEndereco().getBairo()+
				"\nMunicipio: " + objCliente.getEndereco().getMunicipio()+
				"\nEstado: " + objCliente.getEndereco().getEstado()+
				"\nFoneFixo: " + objCliente.getTelefone().getFoneFixo()+
				"\nFoneCelular: " + objCliente.getTelefone().getFoneCelular()+
				"\nFoneComercial: " + objCliente.getTelefone().getFoneComercial()+
				"\nFoneContato: " + objCliente.getTelefone().getFoneContato()
				);
		
		
	}

}
