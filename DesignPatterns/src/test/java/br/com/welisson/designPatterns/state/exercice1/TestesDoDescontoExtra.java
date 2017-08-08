package br.com.welisson.designPatterns.state.exercice1;

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
	public void testaDarDescontoApenasUmaVez() {
		final Orcamento reforma = new Orcamento(500.0);
		reforma.aplicaDescontoExtra();
		Assert.assertThat(reforma.getValor(), equalTo(475.0));

		String msg = "";
		try {
			reforma.aplicaDescontoExtra();
		}catch (RuntimeException e){
			msg = e.getMessage();
		}
		Assert.assertThat("Desconto já aplicado!", equalTo(msg));

		reforma.aprova();


		reforma.aplicaDescontoExtra();
		Assert.assertThat(reforma.getValor(), equalTo(465.5));

		String msg1 = "";
		try {
			reforma.aplicaDescontoExtra();
		}catch (RuntimeException e){
			msg1 = e.getMessage();
		}
		Assert.assertThat("Desconto já aplicado!", equalTo(msg1));

	}

}
