package br.com.welisson.designPatterns.strategy.exercice2;

import java.util.Random;

public abstract class AbstractInvestimento implements Investimento {
	
	protected double subtraiImposto(double valor){
		return valor - (valor * 0.25);
	}
	
	protected double geraPorcentagem(){
		return new Random().nextDouble();
	}
	
	
}
