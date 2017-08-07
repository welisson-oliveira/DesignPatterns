package br.com.welisson.designPatterns.decorator.exercice2;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class TesteImpostoICPPeIKCV {
	
	@Test
	public void testaImpostoComposto(){
		Item item = new Item("Item Muito caro", 500);
		Orcamento orcamento = new Orcamento(Arrays.asList(item));
		
		Imposto imposto = new IKCV(new ICPP());
		double resposta = imposto.calcula(orcamento);
		
		Imposto icpp = new ICPP();
		double respostaIcpp = icpp.calcula(orcamento);
		
		Imposto ikcv = new IKCV();
		double respostaIkcv = ikcv.calcula(orcamento);
		
		Assert.assertThat(resposta, equalTo((respostaIcpp + respostaIkcv)));
	}
}
