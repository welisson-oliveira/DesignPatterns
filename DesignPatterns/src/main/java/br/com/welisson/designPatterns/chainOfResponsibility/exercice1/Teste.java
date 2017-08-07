package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",1000.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);

		Collections.addAll(itens, item1, item2, item3, item4);

		Orcamento orcamento = new Orcamento(itens);
		
		double desconto = new CalculaDesconto(orcamento).calcular();
		
		System.out.println("Valor: "+orcamento.getTotal()
				+ "\nTotal de Itens: "+orcamento.getItens().size()
				+ "\nDesconto : "+desconto);

		Item item5 = new Item("RÉGUA", 4.00);
		Item item6 = new Item("APONTADOR", 3.00);
		
		Collections.addAll(itens, item5, item6);
		desconto = new CalculaDesconto(orcamento).calcular();
		
		System.out.println("Valor: "+orcamento.getTotal()
		+ "\nTotal de Itens: "+orcamento.getItens().size()
		+ "\nDesconto: "+desconto);
	}

}
