package br.com.welisson.designPatterns.chainOfResposibility.exercice1;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.welisson.designPatterns.chainOfResponsibility.exercice1.CalculaDesconto;
import br.com.welisson.designPatterns.chainOfResponsibility.exercice1.Item;
import br.com.welisson.designPatterns.chainOfResponsibility.exercice1.Orcamento;

public class TesteDesconto {

	@Test
	public void descontoPorQuantidadeDeItens() {
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",10.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);
		Item item5 = new Item("RÉGUA", 4.00);
		Item item6 = new Item("APONTADOR", 3.00);

		Orcamento orcamento = new Orcamento(itens);
		
		Collections.addAll(itens, item1, item2, item3, item4, item5, item6);
		double desconto = new CalculaDesconto(orcamento).calcular();
		
		Assert.assertThat(2.5500000000000003, equalTo(desconto));
	}
	
	@Test
	public void descontoPorValor() {
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",1000.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);
		Item item5 = new Item("RÉGUA", 4.00);
		Item item6 = new Item("APONTADOR", 3.00);

		Orcamento orcamento = new Orcamento(itens);
		
		Collections.addAll(itens, item1, item2, item3, item4, item5, item6);
		double desconto = new CalculaDesconto(orcamento).calcular();
		
		Assert.assertThat(71.08500000000001, equalTo(desconto));
	}
	
	@Test
	public void descontoVendaCasada() {
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",10.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);
		Item item5 = new Item("CANETA", 2.50);

		Collections.addAll(itens, item1, item2, item3, item4, item5);

		Orcamento orcamento = new Orcamento(itens);
		
		double desconto = new CalculaDesconto(orcamento).calcular();
		Assert.assertThat(1.05, equalTo(desconto));
	}
	
	@Test
	public void semDesconto() {
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",10.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);

		Collections.addAll(itens, item1, item2, item3, item4);

		Orcamento orcamento = new Orcamento(itens);
		
		double desconto = new CalculaDesconto(orcamento).calcular();
		Assert.assertThat(0.0, equalTo(desconto));
	}

}
