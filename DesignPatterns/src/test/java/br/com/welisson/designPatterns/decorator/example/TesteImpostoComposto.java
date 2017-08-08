package br.com.welisson.designPatterns.decorator.example;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class TesteImpostoComposto {
	
	@Test
	public void testeCobrancaDeImpostoComposto(){
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto(orcamento, new ICCC(new ICMS()));
		double calculaImposto = calculadorDeImposto.calculaImposto();
		
		CalculadorDeImposto calculadorDeICCC = new CalculadorDeImposto(orcamento, new ICCC());
		double iccc = calculadorDeICCC.calculaImposto();
		
		CalculadorDeImposto calculadorDeICMS = new CalculadorDeImposto(orcamento, new ICMS());
		double icms = calculadorDeICMS.calculaImposto();
		
		Assert.assertThat(calculaImposto, equalTo(iccc + icms));
	}
	
	@Test
	public void testeCobrancaDeImpostoCompostoComImpostoMuitoAlto(){
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto(orcamento, new ImpostoMuitoAlto(new ICCC(new ICMS())));
		double calculaImposto = calculadorDeImposto.calculaImposto();
		
		CalculadorDeImposto calculadorDeICCC = new CalculadorDeImposto(orcamento, new ICCC());
		double iccc = calculadorDeICCC.calculaImposto();
		
		CalculadorDeImposto calculadorDeICMS = new CalculadorDeImposto(orcamento, new ICMS());
		double icms = calculadorDeICMS.calculaImposto();
		
		CalculadorDeImposto calculadorDeImpostoMuitoAlto = new CalculadorDeImposto(orcamento, new ImpostoMuitoAlto());
		double ima = calculadorDeImpostoMuitoAlto.calculaImposto();
		
		Assert.assertThat(calculaImposto, equalTo((iccc + icms + ima)));
	}
}
