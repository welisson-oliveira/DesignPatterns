package br.com.welisson.designPatterns.builder.exercice1;

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

	public NotaFiscalBuilder(){
		this.data = LocalDate.now();
		todosItens = new ArrayList<>();
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

	public NotaFiscalBuilder naData(LocalDate data){
		this.data = data;
		return this;
	}

	public NotaFiscal builder(){
		return new NotaFiscal(razaoSocial,cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
}
