package br.com.generation.excollections;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {

	public static void main(String[] args) {

		ArrayList<Produto> fruta = new ArrayList<>();
		ArrayList<Produto> bebida = new ArrayList<>();
		ArrayList<Produto> sobremesa = new ArrayList<>();

		//**********************armazenar dados da list
		JOptionPane.showMessageDialog(null, "Adicionando Frutas...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(fruta);

		JOptionPane.showMessageDialog(null, "Adicionando Bebidas...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(bebida);

		JOptionPane.showMessageDialog(null, "Adicionando Sobremesas...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(sobremesa);

		//apresentar todos os dados da list
		System.out.println("********** Lista Adicionada **********");
		printProduto(fruta);
		printProduto(bebida);
		printProduto(sobremesa);


		//**********************remover dados da list
		JOptionPane.showMessageDialog(null, "Deletando Fruta...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(fruta);

		JOptionPane.showMessageDialog(null, "Deletando Bebida...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(bebida);

		JOptionPane.showMessageDialog(null, "Deletando Sobremesa...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(sobremesa);

		//apresentar todos os dados da list
		System.out.println("\n\n********** Lista Atualizada com as Exclusões **********");
		printProduto(fruta);
		printProduto(bebida);
		printProduto(sobremesa);


		//atualizar dados da list
		JOptionPane.showMessageDialog(null, "Atualizando Fruta...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(fruta);

		JOptionPane.showMessageDialog(null, "Atualizando Bebida...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(bebida);

		JOptionPane.showMessageDialog(null, "Atualizando Sobremesa...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(sobremesa);

		//apresentar todos os dados da list
		System.out.println("\n\n********** Lista Atualizada com as Alterações **********");
		printProduto(fruta);
		printProduto(bebida);
		printProduto(sobremesa);

	}

	static void addProduto(ArrayList<Produto> produto) {

		int num = Integer.parseInt(JOptionPane.showInputDialog(
				"Quantos produtos você deseja adicionar? "));
		for(int i = 0; i < num; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
			produto.add(new Produto(nome, valor));
		}
	}

	static void delProduto(ArrayList<Produto> produto) {

		int pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição que deseja deletar: "));
		while(pd < 0 || pd >= produto.size()) {
			JOptionPane.showMessageDialog(null, "Valor inválido!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição que deseja deletar: "));
		}
		produto.remove(pd);
	}

	static void atualProduto(ArrayList<Produto> produto) {

		int numAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do produto que deseja atualizar: "));
		while(numAt < 0 || numAt >= produto.size()) {
			JOptionPane.showMessageDialog(null, "Valor inválido!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			numAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do produto que deseja atualizar: "));
		}
		String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		produto.set(numAt, (new Produto(nome, valor)));
	}

	static void printProduto(ArrayList<Produto> produto) {

		System.out.print("\nLista de Produtos**************************");
		for(Produto p : produto) {
			System.out.println(p);
		}
	}
}
