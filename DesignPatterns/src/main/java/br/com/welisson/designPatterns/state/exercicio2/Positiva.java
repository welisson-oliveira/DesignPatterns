package br.com.welisson.designPatterns.state.exercicio2;

/**
 * {@link Positiva}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public final class Positiva implements EstadoDaConta {

	@Override
	public double deposita(Conta conta, double valor) {
		return conta.deposita(0.98 * valor);
	}

	@Override
	public double saca(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		negativa(conta);
		return conta.getSaldo();
	}

	@Override
	public void positiva(Conta conta) {
		throw new RuntimeException("Conta já é positiva");
	}

	@Override
	public void negativa(Conta conta) {
		if(conta.getSaldo() < 0) conta.setEstadoDaConta(new Negativa());
	}
}
