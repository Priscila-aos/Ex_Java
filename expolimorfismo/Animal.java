package br.com.generation.expolimorfismo;

public class Animal {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void movimento() {
		System.out.println("Animal correm em disparada...");
	}
	
	public void som() {
		System.out.println("Animal emitindo som...");
	}

}
