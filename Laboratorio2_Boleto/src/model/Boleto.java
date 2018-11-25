package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Boleto {
	
	private long numeros;
	private LocalDate dataVencimento;
	private double valor;
	private double juros;
	private double multa;
	
	public Boleto(long numeros, double juros, double multa) {
		this.numeros = numeros;
		this.juros = juros;
		this.multa = multa;
		extrairValor(numeros);
		extrairVencimento(numeros);
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	
	public double getValor() {
		return valor;
	}
	
	private void extrairValor(long nro) {
		long value;
		value = (long) (nro% Math.pow(10, 10));
		this.valor = value/100.0;
	}
	
	private void extrairVencimento(long nro) {
		int dias;
		dias = (int) (nro/Math.pow(10, 10));
		LocalDate dataBase = LocalDate.of(1997, Month.OCTOBER, 07);
		this.dataVencimento = dataBase.plusDays(dias);
	}
	
	public double getMulta() {
		double ret = 0;
		int duracao = dataVencimento.until(LocalDate.now()).getDays();
		
		if(duracao > 0) 
			ret = multa + calcularJuros(duracao);
		
		return ret;
	}
	
	private double calcularJuros(int d) {
		
		return valor*(Math.pow(1+(juros/100), d));
		
	}
	
	public String getVencimento() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataVencimento.format(formatter);
	}
}
