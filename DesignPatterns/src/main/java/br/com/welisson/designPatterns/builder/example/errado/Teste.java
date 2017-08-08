package br.com.welisson.designPatterns.builder.example.errado;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * {@link Teste}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class Teste {
	public static void main(String[] args) {
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1",500),new ItemDaNota("item 2",500),new ItemDaNota("item 3",500));
		double valorTotal = 0;
		for(ItemDaNota item : itens) {
			valorTotal += item.getValor();
		}
		double impostos = valorTotal * 0.05;

		NotaFiscal nf = new NotaFiscal("razao social qualquer", "um cnpj", LocalDate.now(), valorTotal, impostos, itens, "observacoes quaisquer aqui");
	}
}
