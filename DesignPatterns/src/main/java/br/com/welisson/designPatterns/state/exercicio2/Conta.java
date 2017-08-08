package br.com.welisson.designPatterns.state.exercicio2;

/**
 * {@link Conta}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class Conta {

	private double saldo;
	private EstadoDaConta estadoDaConta;

	public Conta(double saldo){
		this.saldo = saldo;
		this.estadoDaConta = saldo >= 0 ? new Positiva() : new Negativa();
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposita(double valor){
		return estadoDaConta.deposita(this,valor);
	}

	public double saca(double valor){
		return estadoDaConta.saca(this,valor);
	}

	protected void setEstadoDaConta(EstadoDaConta estadoDaConta) {
		this.estadoDaConta = estadoDaConta;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String estadoDaConta(){
		return estadoDaConta.getClass().getSimpleName();
	}
}
