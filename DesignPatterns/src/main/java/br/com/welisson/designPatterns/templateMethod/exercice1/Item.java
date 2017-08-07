package br.com.welisson.designPatterns.templateMethod.exercice1;

import java.util.List;

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
	
	public boolean containsEqual(List<Item> itens){
		return itens.stream().anyMatch(item -> item.getName().equalsIgnoreCase(this.getName()) && item != this);
	}

}
