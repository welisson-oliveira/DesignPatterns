package br.com.welisson.designPatterns.strategy.exercice;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import br.com.welisson.designPatterns.strategy.exercice1.CalculadorDeImposto;
import br.com.welisson.designPatterns.strategy.exercice1.ICCC;
import br.com.welisson.designPatterns.strategy.exercice1.Orcamento;

public class TesteImpostoICCC {

	@Test
	public void calculaImpostoICCCMenorQueMil() {
		CalculadorDeImposto calculadorDeImpostos = new CalculadorDeImposto(new Orcamento(50), new ICCC());
		double valor = calculadorDeImpostos.calculaImposto();
		Assert.assertThat(47.5, equalTo(valor));
	}
	
	@Test
	public void calculaImpostoICCCEntreMilETresMil() {
		CalculadorDeImposto calculadorDeImpostos = new CalculadorDeImposto(new Orcamento(1500), new ICCC());
		double valor = calculadorDeImpostos.calculaImposto();
		Assert.assertThat(1395.0, equalTo(valor));
	}
	
	@Test
	public void calculaImpostoICCCMaiorQueTresMil() {
		CalculadorDeImposto calculadorDeImpostos = new CalculadorDeImposto(new Orcamento(3500), new ICCC());
		double valor = calculadorDeImpostos.calculaImposto();
		Assert.assertThat(3250.0, equalTo(valor));
	}

}
