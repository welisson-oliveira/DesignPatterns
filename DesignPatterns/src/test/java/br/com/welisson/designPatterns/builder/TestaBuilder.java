package br.com.welisson.designPatterns.builder;

import br.com.welisson.designPatterns.builder.exercice1.ItemDaNota;
import br.com.welisson.designPatterns.builder.exercice1.NotaFiscal;
import br.com.welisson.designPatterns.builder.exercice1.NotaFiscalBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * {@link TestaBuilder}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class TestaBuilder {

	@Test
	public void testeBuilder(){
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-00")
				.com(new ItemDaNota("item 1", 100.0))
				.com(new ItemDaNota("item 2", 200.0))
				.com(new ItemDaNota("item 3", 300.0))
				.comObservacoes("entregar nf pessoalmente")
				.naData(LocalDate.now()).builder();

		Assert.assertThat("Caelum", equalTo(notaFiscal.getRazaoSocial()));
		Assert.assertThat("123.456.789/0001-00", equalTo(notaFiscal.getCnpj()));
		Assert.assertThat(3, equalTo(notaFiscal.getItens().size()));
		Assert.assertThat("entregar nf pessoalmente", equalTo(notaFiscal.getObservacoes()));
		Assert.assertThat(LocalDate.now().getDayOfMonth(), equalTo(notaFiscal.getDataDeEmissao().getDayOfMonth()));
	}

}
