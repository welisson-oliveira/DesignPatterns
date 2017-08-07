package br.com.welisson.designPatterns.decorator.exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SaldoMaiorQue500Mil extends Filtro {

	public SaldoMaiorQue500Mil(Filtro proximoFiltro) {
		super(proximoFiltro);
	}

	public SaldoMaiorQue500Mil() {
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contaFiltrada = new ArrayList<>();

		contaFiltrada.addAll(contas.stream().filter(Conta::isSaldoMaiorQue500Mil).collect(Collectors.toList()));
		contaFiltrada.addAll(executarProximo(contas));
		return contaFiltrada;
	}

}
