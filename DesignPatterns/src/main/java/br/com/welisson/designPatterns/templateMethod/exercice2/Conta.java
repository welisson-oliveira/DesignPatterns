package br.com.welisson.designPatterns.templateMethod.exercice2;

public class Conta {
	
	private final String titular;
	private Double saldo;

	public Conta(final String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
