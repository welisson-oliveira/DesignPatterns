package br.com.welisson.designPatterns.templateMethod.exercice2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class TesteRelatorio {
	
	@Test
	public void gerarRelatorioSimples(){
		
		Conta conta1 = new Conta("Welisson",1000000.00);
		Conta conta2 = new Conta("Wilson",100000000.00);
		
		List<Conta> contas = Arrays.asList(conta1, conta2);
		Optional<List<Conta>> optionalContas = Optional.of(contas) ;
		
		
		Banco banco= new Banco("Santander","1234-1234","Endereco","email@email.com", optionalContas);
		
		String resposta = new RelatorioSimples().gerar(banco);
		String esperado = "Nome: Santander\n"+
							"Telefone: 1234-1234\n"+
							"-------------------------------------\n"+
							"Titular: Welisson\n"+
							"Saldo: 1000000.0\n"+
							"\n"+
							"Titular: Wilson\n"+
							"Saldo: 1.0E8\n"+
							"\n"+
							"-------------------------------------\n"+
							"Nome: Santander\n"+
							"Telefone: 1234-1234\n";
		
		System.out.println("\nSimples: \n\n"+resposta+"\n\n");
		Assert.assertEquals(resposta, esperado);
	}
	
	@Test
	public void gerarRelatorioComplexo(){
		
		Banco banco = new Banco("Santander","1234-1234","Endereco","email@email.com");
		Conta conta1 = new Conta("Welisson",1000000.00);
		Conta conta2 = new Conta("Wilson",100000000.00);
		
		banco.addConta(conta1);
		banco.addConta(conta2);
		
		String resposta = new RelatorioComplexo().gerar(banco);
		
		String esperado = "Nome: Santander\n"+
				"Endereço: Endereco\n"+
				"Telefone: 1234-1234\n"+
				"-------------------------------------\n"+
				"Titular: Welisson\n"+
				"Saldo: 1000000.0\n"+
				"\n"+
				"Titular: Wilson\n"+
				"Saldo: 1.0E8\n"+
				"\n"+
				"-------------------------------------\n"+
				"Email: email@email.com\n"+
				"Data atual: 05/08/2017\n";
		
		System.out.println("\nComplexo: \n\n"+resposta+"\n\n");
		Assert.assertEquals(resposta, esperado);
	}
	
	
}
