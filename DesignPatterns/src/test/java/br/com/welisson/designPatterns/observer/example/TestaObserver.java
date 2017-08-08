package br.com.welisson.designPatterns.observer.example;

import br.com.welisson.designPatterns.observer.example.certo.EnviadorDeEmail;
import br.com.welisson.designPatterns.observer.example.certo.EnviadorDeSms;
import br.com.welisson.designPatterns.observer.example.certo.Impressora;
import br.com.welisson.designPatterns.observer.example.certo.ItemDaNota;
import br.com.welisson.designPatterns.observer.example.certo.NotaFiscal;
import br.com.welisson.designPatterns.observer.example.certo.NotaFiscalBuilder;
import br.com.welisson.designPatterns.observer.example.certo.NotaFiscalDao;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * {@link TestaObserver}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class TestaObserver {
 	@Test
	public void adicionarAcoes(){
		final NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.addAcao(new EnviadorDeEmail());
		builder.addAcao(new NotaFiscalDao());
		builder.addAcao(new EnviadorDeSms());
		builder.addAcao(new Impressora());

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
