package br.com.welisson.designPatterns.decorator.exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContasAbertasEsteMes extends Filtro {

	public ContasAbertasEsteMes(Filtro proximoFiltro) {
		super(proximoFiltro);
	}

	public ContasAbertasEsteMes() {
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contaFiltrada = new ArrayList<>();
		
		contaFiltrada.addAll(contas.stream().filter(Conta::isAbertaEsseMes).collect(Collectors.toList()));
		contaFiltrada.addAll(executarProximo(contas));
		return contaFiltrada;
	}

}
