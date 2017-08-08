package br.com.welisson.designPatterns.state.exercicio2;

/**
 * {@link Negativa}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public final class Negativa implements EstadoDaConta {

	@Override
	public double deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.95);
		positiva(conta);
		return conta.getSaldo();

	}

	@Override
	public double saca(Conta conta, double valor) {
		throw new RuntimeException("Não é possivel realizar saque com a conta negativa");
	}

	@Override
	public void positiva(Conta conta) {
		if(conta.getSaldo() >= 0) conta.setEstadoDaConta(new Positiva());
	}

	@Override
	public void negativa(Conta conta) {
		throw new RuntimeException("Conta já é negativa");
	}
}
