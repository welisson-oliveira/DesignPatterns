package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link Aprovado}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class CalculaImposto {
	
	private Orcamento orcamento;
	private Imposto imposto;

	public CalculaImposto(Orcamento orcamento, Imposto imposto){
		this.orcamento = orcamento;
		this.imposto = imposto;
	}
	
	public double calcular(){
		return imposto.calcula(orcamento);
	}
	
}
