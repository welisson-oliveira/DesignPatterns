package br.com.welisson.designPatterns.decorator.exercice3;

import static org.hamcrest.CoreMatchers.equalTo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TesteFiltros {

	@Test
	public void testeFiltros() {
		Conta c1 = new Conta("Welisson", 50, LocalDate.of(2017, 6, 10));
		Conta c2 = new Conta("Wilson", 1000000, LocalDate.of(2017, 7, 10));
		Conta c3 = new Conta("Rosangela", 300, LocalDate.of(2017, 8, 10));
		Conta c4 = new Conta("Paula", 100, LocalDate.of(2017, 3, 10));
		Conta c5 = new Conta("Marcella", 300, LocalDate.of(2017, 1, 10));

		List<Conta> contas = new ArrayList<>();
		Collections.addAll(contas, c1, c2, c3, c4, c5);
		
		List<Conta> retorno = new Executa(contas).filtro();
		Assert.assertThat(retorno.size(), equalTo(3));
	}
}
