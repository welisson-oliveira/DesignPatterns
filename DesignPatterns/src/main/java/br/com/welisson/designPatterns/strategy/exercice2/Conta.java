package br.com.welisson.designPatterns.strategy.exercice2;

public class Conta {
	
	private double saldo;
	
	public void deposita(double valor) {
		if(valor < 0){
			throw new RuntimeException("Impossivel depositar valor negativo");
		}
		saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
}
