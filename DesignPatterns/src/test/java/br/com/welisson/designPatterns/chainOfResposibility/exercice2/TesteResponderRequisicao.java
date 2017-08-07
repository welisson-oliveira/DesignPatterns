package br.com.welisson.designPatterns.chainOfResposibility.exercice2;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import br.com.welisson.designPatterns.chainOfResponsibility.exercice2.Conta;
import br.com.welisson.designPatterns.chainOfResponsibility.exercice2.Formato;
import br.com.welisson.designPatterns.chainOfResponsibility.exercice2.Requisicao;
import br.com.welisson.designPatterns.chainOfResponsibility.exercice2.ResponderRequisicao;

public class TesteResponderRequisicao {

	@Test
	public void gerarXML() {

		Requisicao requisicao = new Requisicao(Formato.XML);
		Conta conta = new Conta("Welisson", 1000000.00);

		ResponderRequisicao respostaRequisicao = new ResponderRequisicao(requisicao, conta);
		String resposta = respostaRequisicao.responder();
		Assert.assertThat("<Conta>\n"
							+"<titular><Welisson></titular>\n"
							+"<saldo><1000000.0></saldo>\n"
							+"</Conta>\n", equalTo(resposta));
		
	}

	@Test
	public void gerarCSV() {

		Requisicao requisicao = new Requisicao(Formato.CSV);
		Conta conta = new Conta("Welisson", 1000000.00);

		ResponderRequisicao respostaRequisicao = new ResponderRequisicao(requisicao, conta);
		String resposta = respostaRequisicao.responder();
		Assert.assertThat("Welisson;1000000.0;", equalTo(resposta));

	}

	@Test
	public void gerarPorcentagem() {

		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		Conta conta = new Conta("Welisson", 1000000.00);

		ResponderRequisicao respostaRequisicao = new ResponderRequisicao(requisicao, conta);
		String resposta = respostaRequisicao.responder();
		Assert.assertThat("Welisson%1000000.0%", equalTo(resposta));
	}

}
