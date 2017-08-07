package br.com.welisson.designPatterns.templateMethod.exercice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Banco {
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private List<Conta> contas;

	public Banco(String nome, String telefone, String endereco, String email, Optional<List<Conta>> contas) {
		this(nome, telefone, endereco, email);
		this.contas = contas.isPresent() ? contas.get() : new ArrayList<>();
	}
	
	public Banco(String nome, String telefone, String endereco, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.contas = new ArrayList<>();
	} 

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public void addConta(Conta conta){
		this.contas.add(conta);
	}
	
	public List<Conta> getContas(){
		return Collections.unmodifiableList(contas);
	}

}
