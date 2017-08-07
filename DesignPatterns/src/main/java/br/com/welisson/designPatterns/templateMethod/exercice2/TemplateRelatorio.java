package br.com.welisson.designPatterns.templateMethod.exercice2;

import java.util.List;

public abstract class TemplateRelatorio implements Relatorio {
	protected StringBuilder string = new StringBuilder();

	protected abstract void gerarCabecalho(Banco banco);
	protected abstract void gerarCorpo(List<Conta> contas);
	protected abstract void gerarRodape(Banco banco);

	public String gerar(Banco banco) {
		gerarCabecalho(banco);
		gerarCorpo(banco.getContas());
		gerarRodape(banco);
		return string.toString();
	}

}
