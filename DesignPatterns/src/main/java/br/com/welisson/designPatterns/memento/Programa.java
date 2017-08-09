package br.com.welisson.designPatterns.memento;

import java.time.LocalDate;

/**
 * {@link Programa}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Programa {
	public static void main(String[] args) {

		Historico historico = new Historico();

		Contrato contrato = new Contrato(LocalDate.now(), "Welisson", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		System.out.println(historico.pega(3).getContrato().getTipo());
		contrato.restaura(historico.pega(0));
		System.out.println(contrato.toString());
	}
}
