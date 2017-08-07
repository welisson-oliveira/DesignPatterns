package br.com.welisson.designPatterns.strategy.exemplo;

import br.com.welisson.designPatterns.chainOfResponsibility.exercice1.Item;

public class Orcamento {
	private double valor;
	private Item item;

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

	public Item getItens() {
		// TODO Auto-generated method stub
		return this.item;
	}
}
