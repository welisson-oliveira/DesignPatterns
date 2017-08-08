package br.com.welisson.designPatterns.strategy.example;

public class ICMS implements Imposto{
	public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
