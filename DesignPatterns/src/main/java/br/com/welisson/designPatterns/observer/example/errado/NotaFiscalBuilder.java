package br.com.welisson.designPatterns.observer.example.errado;

import java.time.LocalDate;
import java.util.List;

/**
 * {@link NotaFiscalBuilder} Interface fluente graças ao method chain
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens;
	private double valorBruto;
	private double impostos;
	private LocalDate data;
	private String observacoes;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual(){
		this.data = LocalDate.now();
		return this;
	}

	public NotaFiscal builder(){
		final NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens,
				observacoes);

		// invocando as ações posteriores
		enviaPorEmail(notaFiscal);
		salvaNoBanco(notaFiscal);
		enviaPorSms(notaFiscal);
		imprime(notaFiscal);

		return notaFiscal;
	}


	//exutam após construir o objeto
	private void enviaPorEmail(NotaFiscal notaFiscal) {
		System.out.println("enviando por e-mail");
	}

	private void salvaNoBanco(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}

	private void enviaPorSms(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}

	private void imprime(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
