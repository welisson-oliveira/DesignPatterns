package br.com.welisson.designPatterns.observer.exercice1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * {@link TesteObserver}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class TesteObserver {

	@Test
	public void testeReceberAcoesPeloConstrutor(){



		final NotaFiscalBuilder builder = new NotaFiscalBuilder(Arrays.asList(new EnviadorDeEmail(),
				new NotaFiscalDao(),
				new EnviadorDeSms(),
				new Impressora()));

		NotaFiscal notaFiscal = builder
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-00")
				.com(new ItemDaNota("item 1", 100.0))
				.com(new ItemDaNota("item 2", 200.0))
				.com(new ItemDaNota("item 3", 300.0))
				.comObservacoes("entregar nf pessoalmente")
				.naDataAtual().builder();

		Assert.assertThat("Caelum", equalTo(notaFiscal.getRazaoSocial()));
		Assert.assertThat("123.456.789/0001-00", equalTo(notaFiscal.getCnpj()));
		Assert.assertThat(3, equalTo(notaFiscal.getItens().size()));
		Assert.assertThat("entregar nf pessoalmente", equalTo(notaFiscal.getObservacoes()));
		Assert.assertThat(LocalDate.now().getDayOfMonth(), equalTo(notaFiscal.getDataDeEmissao().getDayOfMonth()));
	}
}
