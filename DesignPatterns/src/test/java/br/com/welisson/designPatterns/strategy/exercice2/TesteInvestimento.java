package br.com.welisson.designPatterns.strategy.exercice2;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class TesteInvestimento {

	@Test
	public void testarInvestimentoConservador() {
		Conta conta = new Conta();
		conta.deposita(1000);
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos(new Conservador(), conta);
		realizadorDeInvestimentos.investir();
		Assert.assertThat(1006.0, equalTo(conta.getSaldo()));
	}
	
	@Test
	public void testarInvestimentoModerado() {
		Conta conta = new Conta();
		conta.deposita(1000);
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos(new Moderado(), conta);
		realizadorDeInvestimentos.investir();
		Assert.assertTrue(conta.getSaldo() == 1005.25 || conta.getSaldo() == 1018.75);
	}
	
	@Test
	public void testarInvestimentoArrojado() {
		Conta conta = new Conta();
		conta.deposita(1000);
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos(new Arrojado(), conta);
		realizadorDeInvestimentos.investir();
		Assert.assertTrue(conta.getSaldo() == 1003.375 || conta.getSaldo() == 1168.75 || conta.getSaldo() == 1375.0);
	}

}
