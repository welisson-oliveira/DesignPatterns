package br.com.welisson.designPatterns.templateMethod.exercice2;

import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected final void gerarCabecalho(Banco banco) {
		string.append("Nome: " + banco.getNome() + "\n");
		string.append("Telefone: " + banco.getTelefone() + "\n");
		string.append("-------------------------------------\n");
	}

	@Override
	protected final void gerarRodape(Banco banco) {
		string.append("-------------------------------------\n");
		string.append("Nome: " + banco.getNome() + "\n");
		string.append("Telefone: " + banco.getTelefone() + "\n");
	}

	@Override
	protected final void gerarCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			string.append("Titular: " + conta.getTitular() + "\n");
			string.append("Saldo: " + conta.getSaldo() + "\n");
			string.append("\n");
		}
	}

}
