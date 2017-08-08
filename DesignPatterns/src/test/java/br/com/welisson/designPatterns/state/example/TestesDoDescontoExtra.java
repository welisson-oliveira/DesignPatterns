package br.com.welisson.designPatterns.state.example;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * {@link TestesDoDescontoExtra}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class TestesDoDescontoExtra {

	@Test
	public void testaDescontoNosDiferentesEstados() {
		Orcamento reforma = new Orcamento(500.0);
		reforma.aplicaDescontoExtra();

		reforma.aprova();
		Assert.assertThat(reforma.getValor(), equalTo(475.0));

		reforma.aplicaDescontoExtra();
		Assert.assertThat(reforma.getValor(), equalTo(465.5));

		reforma.finaliza();
		String msg = "";
		try {
			reforma.aplicaDescontoExtra();
		}catch (RuntimeException e){
			msg = e.getMessage();
		}
		Assert.assertThat("Orçamentos finalizados não recebem desconto extra!", equalTo(msg));

		String msg1 = "";
		try {
			reforma.aprova();
		}catch (RuntimeException e){
			msg1 = e.getMessage();
		}
		Assert.assertThat("Orçamentos finalizados não podem ser Aprovados", equalTo(msg1));
	}

}
