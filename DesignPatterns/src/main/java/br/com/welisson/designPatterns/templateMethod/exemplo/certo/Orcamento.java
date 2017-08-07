package br.com.welisson.designPatterns.templateMethod.exemplo.certo;

import java.util.Collections;
import java.util.List;

public class Orcamento {
	private final List<Item> itens;
	
	public Orcamento(final List<Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}
	
	public double getTotal(){
		double total = 0;
		for(Item item : itens){
			total += item.getValor();
		}
		return  total;
	}
	
	public boolean existe(String nomeItem){
		return this.itens.stream().filter(i -> i.getName().equalsIgnoreCase(nomeItem)).findFirst().isPresent();
	}
	
}
