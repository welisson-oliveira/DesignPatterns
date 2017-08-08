package br.com.welisson.designPatterns.state.exercicio2;

/**
 * {@link EstadoDaConta}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public interface EstadoDaConta {

	double deposita(Conta conta, double valor);
	double saca(Conta conta, double valor);

	void positiva(Conta conta);
	void negativa(Conta conta);

}
