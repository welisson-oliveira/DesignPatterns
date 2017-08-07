package br.com.welisson.designPatterns.decorator.exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SaldoMenorQue100 extends Filtro {

	public SaldoMenorQue100(Filtro proximoFiltro) {
		super(proximoFiltro);
	}

	public SaldoMenorQue100() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contaFiltrada = new ArrayList<>();
		
		contaFiltrada.addAll(contas.stream().filter(Conta::isSaldoMenorQue100).collect(Collectors.toList()));
		contaFiltrada.addAll(executarProximo(contas));
		return contaFiltrada;
	}

}
