package br.com.fiap.main;

import java.text.MessageFormat;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
		
	}
	
	 static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static int adicionarProduto() {
		return JOptionPane.showConfirmDialog(
				null, 
				"Adicionar Produto no carrinho",
				"Carrinho de compras",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE
				);	
	}
	public static void main(String[] args) {
		
		Produto[]vetorProduto = new Produto[3];
		int i = 0;
		
		for (Produto produto: vetorProduto) {
		    if (adicionarProduto() != 0) break;

		    vetorProduto[i] = new Produto();
		    vetorProduto[i].setMarca(texto("Marca:"));
		    vetorProduto[i].setQuantidade(inteiro("Quantidade: "));
		    vetorProduto[i].setTipo(texto("Tipo: "));
		    vetorProduto[i].setValor(real("Valor: "));
		    
		    i++;
		}

		int c = 0;
				
		for (Produto produto: vetorProduto) {
			if (produto == null) break;
			
				
			
			String message = MessageFormat.format(
					"Tipo: {0}"+ "\nMarca: {1}"+ "\nQuantidade: {2}" + "\nValor: {3}",
					vetorProduto[c].getTipo(),
					vetorProduto[c].getMarca(),
					vetorProduto[c].getQuantidade(),
					vetorProduto[c].getValor()
					);
					
		
			System.out.println(message);
			System.out.println("------------------------------------------------------------");
			c++;
		}
		
	}
}