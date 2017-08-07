package br.com.welisson.designPatterns.strategy;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import br.com.welisson.designPatterns.strategy.exemplo.CalculadorDeImpostos;
import br.com.welisson.designPatterns.strategy.exemplo.ICMS;
import br.com.welisson.designPatterns.strategy.exemplo.ISS;
import br.com.welisson.designPatterns.strategy.exemplo.Imposto;
import br.com.welisson.designPatterns.strategy.exemplo.Orcamento;

public class TesteDeImposto {
	
	@Test
	public void calculaImposto(){
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		Double orcamentoISS = calculador.realizaCalculo(orcamento, iss);
		
		Assert.assertThat(orcamentoISS.toString(), equalTo("30.0"));
		
		Double orcamentoICMS = calculador.realizaCalculo(orcamento, icms);
		
		Assert.assertThat(orcamentoICMS.doubleValue(), equalTo(50D));
		
	}
	
}
