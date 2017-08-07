package br.com.welisson.designPatterns.strategy.exemplo;

public class ICMS implements Imposto{
	public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
