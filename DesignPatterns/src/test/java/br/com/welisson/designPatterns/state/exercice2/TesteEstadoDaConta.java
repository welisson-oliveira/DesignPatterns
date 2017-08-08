package br.com.welisson.designPatterns.state.exercice2;

import br.com.welisson.designPatterns.state.exercicio2.Conta;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * {@link TesteEstadoDaConta}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class TesteEstadoDaConta {

	@Test
	public void positivaParaNegativa(){

		Conta conta = new Conta(500);
		Assert.assertThat("Positiva",equalTo(conta.estadoDaConta()));
		conta.saca(501);
		Assert.assertThat("Negativa",equalTo(conta.estadoDaConta()));
		conta.deposita(10);
		Assert.assertThat("Positiva",equalTo(conta.estadoDaConta()));
		conta.saca(501);
		Assert.assertThat("Negativa",equalTo(conta.estadoDaConta()));

	}
}
