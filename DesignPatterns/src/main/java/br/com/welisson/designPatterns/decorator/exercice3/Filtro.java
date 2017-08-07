package br.com.welisson.designPatterns.decorator.exercice3;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	protected Filtro proximoFiltro;

	public Filtro(Filtro proximoFiltro) {
		this.proximoFiltro = proximoFiltro;
	}

	public Filtro() {
	}

	protected abstract List<Conta> filtra(List<Conta> contas);

	protected final List<Conta> executarProximo(List<Conta> contas) {
		return proximoFiltro != null ? proximoFiltro.filtra(contas) : new ArrayList<>();
	}

}
