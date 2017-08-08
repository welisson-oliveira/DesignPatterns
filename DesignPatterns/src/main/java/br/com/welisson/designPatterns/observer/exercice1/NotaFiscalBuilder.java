package br.com.welisson.designPatterns.observer.exercice1;

import java.time.LocalDate;
import java.util.ArrayList;
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

	private List<AcaoAposGerarNota> acoes;

	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes){
		this.acoes = acoes;
		this.todosItens = new ArrayList<>();
	}


	public void addAcao(AcaoAposGerarNota acao){
		acoes.add(acao);
	}

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

		acoes.stream().forEach(acao -> acao.executa(notaFiscal));

		return notaFiscal;
	}

}
