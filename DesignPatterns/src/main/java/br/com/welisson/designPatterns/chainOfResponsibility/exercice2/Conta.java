package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public class Conta {
	private String titular;
	private double saldo;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
