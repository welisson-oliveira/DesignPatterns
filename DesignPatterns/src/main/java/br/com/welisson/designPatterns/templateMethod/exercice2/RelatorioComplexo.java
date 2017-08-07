package br.com.welisson.designPatterns.templateMethod.exercice2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected final void gerarCabecalho(Banco banco) {
		string.append("Nome: " + banco.getNome() + "\n");
		string.append("Endereço: " + banco.getEndereco() + "\n");
		string.append("Telefone: " + banco.getTelefone() + "\n");
		string.append("-------------------------------------\n");
	}

	@Override
	protected final void gerarRodape(Banco banco) {
		string.append("-------------------------------------\n");
		string.append("Email: " + banco.getEmail() + "\n");
		string.append("Data atual: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
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
