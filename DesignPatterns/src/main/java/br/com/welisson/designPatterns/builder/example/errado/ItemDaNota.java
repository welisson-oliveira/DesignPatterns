package br.com.welisson.designPatterns.builder.example.errado;

/**
 * {@link ItemDaNota}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class ItemDaNota {

	private final String descricao;
	private double valor;

	public ItemDaNota(final String descricao, final double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
}
