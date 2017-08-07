package br.com.welisson.designPatterns.decorator.exercice3;

import java.util.List;

public class Executa {

	private List<Conta> contas;

	public Executa(List<Conta> contas) {
		this.contas = contas;
	}

	public List<Conta> filtro() {
		Filtro filtro = new ContasAbertasEsteMes(new SaldoMenorQue100(new SaldoMaiorQue500Mil()));
		return filtro.filtra(contas);
	}

}
