package br.com.welisson.designPatterns.memento;

import java.time.LocalDate;

/**
 * {@link Estado}
 * Classe utilizada para encapsular contrato e adicionar novas informações caso necessario<br />
 * Caso o objeto que necessita do estado salvo não precisasse de novas informações, essa classe não seria necessária
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Estado {
	private Contrato contrato;
	private LocalDate date;

	public Estado(Contrato contrato) {
		this.contrato = contrato;
		this.date = LocalDate.now();
	}

	public Contrato getContrato() {
		return contrato;
	}
}
