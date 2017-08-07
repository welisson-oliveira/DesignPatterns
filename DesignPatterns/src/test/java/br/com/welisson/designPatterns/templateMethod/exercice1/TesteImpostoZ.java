package br.com.welisson.designPatterns.templateMethod.exercice1;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.welisson.designPatterns.templateMethod.exercice1.CalculaImposto;
import br.com.welisson.designPatterns.templateMethod.exercice1.IHIT;
import br.com.welisson.designPatterns.templateMethod.exercice1.Item;
import br.com.welisson.designPatterns.templateMethod.exercice1.Orcamento;


public class TesteImpostoZ {
	
	@Test
	public void testeTaxaMinimo(){
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",10.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);
		Item item5 = new Item("RÉGUA", 4.00);
		Item item6 = new Item("APONTADOR", 3.00);

		Orcamento orcamento = new Orcamento(itens);
		
		Collections.addAll(itens, item1, item2, item3, item4, item5, item6);
		double desconto = new CalculaImposto(orcamento, new IHIT()).calcular();
		
		Assert.assertThat(0.06, equalTo(desconto));
	}
	
	@Test
	public void testeTaxaMaximo(){
		List<Item> itens = new ArrayList<>();

		Item item1 = new Item("CADERNO",10.00);
		Item item2 = new Item("LAPIS", 2.00);
		Item item3 = new Item("TESOURA", 5.50);
		Item item4 = new Item("BORRACHA", 1.00);
		Item item5 = new Item("RÉGUA", 4.00);
		Item item6 = new Item("APONTADOR", 3.00);
		Item item7 = new Item("CADERNO", 10.00);

		Orcamento orcamento = new Orcamento(itens);
		
		Collections.addAll(itens, item1, item2, item3, item4, item5, item6, item7);
		double desconto = new CalculaImposto(orcamento, new IHIT()).calcular();
		
		Assert.assertThat(104.615, equalTo(desconto));
	}
	
}
