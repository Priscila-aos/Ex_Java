/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
 * utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal:
 * 
 *  animal: cachorro, cavalo e pregui�a
 *  
 *  cachorro possui nome, idade, emite som e corre
 *  cavalo possui   nome, idade, emite som e corre
 *  pregui�a        nome, idade, emite som e SOBE EM ARVORE
 */
package br.com.generation.heranca;

public class Animal {
	
	//Atributos
	private String nome;
	private int idade;
	
	//acessando atributos	
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
	
	
}
