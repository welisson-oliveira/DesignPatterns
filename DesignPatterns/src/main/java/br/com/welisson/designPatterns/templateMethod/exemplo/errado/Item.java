package br.com.welisson.designPatterns.templateMethod.exemplo.errado;

public class Item {

	private String nome;
	private double valor;

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getName(){
		return this.nome;
	}
	
	public double getValor(){
		return this.valor;
	}

}
