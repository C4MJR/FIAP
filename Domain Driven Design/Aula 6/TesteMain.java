package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;
import javax.swing.JOptionPane;

public class TesteMain {

	public static void main(String[] args) {

		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();

		objCliente.setNome(JOptionPane.showInputDialog("digite seu nome"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("diga sua idade")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe sua peso")));
		objCliente.setProduto(objProduto);

		objProduto.setMarca(JOptionPane.showInputDialog("digite a marca"));
		objProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("diga a quantidade")));
		objProduto.setTipo(JOptionPane.showInputDialog("digite o tipo de produto que deseja"));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago")));

		System.out.println("Nome:" + objCliente.getNome() + "\nIdade:" + objCliente.getIdade() + "\nPeso: "
				+ objCliente.getPeso() + "\nTipo: " + objCliente.getProduto().getTipo() + "\nMarca: "
				+ objCliente.getProduto().getMarca() + "\nQuantidade: " + objCliente.getProduto().getQuantidade()
				+ "\nValor: " + objCliente.getProduto().getValor());

	}

}
