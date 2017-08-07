package br.com.welisson.designPatterns.decorator.exercice3;

import java.io.Serializable;
import java.time.LocalDate;

public class Conta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String titular;
	private double saldo;
	private LocalDate dataDeAbertura;
	
	public Conta(String titula, double saldo, LocalDate dataDeAbertura) {
		titular = titula;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public LocalDate getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public boolean isSaldoMenorQue100(){
		return saldo < 100;
	}
	
	public boolean isSaldoMaiorQue500Mil(){
		return saldo > 500000;
	}

	public boolean isAbertaEsseMes() {
		return dataDeAbertura.getMonth().equals(LocalDate.now().getMonth());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDeAbertura == null) ? 0 : dataDeAbertura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (dataDeAbertura == null) {
			if (other.dataDeAbertura != null)
				return false;
		} else if (!dataDeAbertura.equals(other.dataDeAbertura))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	
}
