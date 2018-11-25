package view;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import model.Boleto;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long sequencia;
		double multa;
		double juros;
		Boleto boleto;
		NumberFormat formater = NumberFormat.getCurrencyInstance(Locale.getDefault());
		formater.setMaximumFractionDigits(2);
		
		System.out.println("Informe a ultima sequencia númerica do boleto:");
		sequencia = input.nextLong();
		
		System.out.println("Informe a multa:");
		multa = input.nextDouble();
		
		System.out.println("Informe o juros:");
		juros = input.nextDouble();
		
		boleto = new Boleto(sequencia, juros, multa);
		
		String valor = formater.format(boleto.getValor());
		String vMulta = formater.format(boleto.getMulta());
		String valorMulta = formater.format(boleto.getMulta() + boleto.getValor());
		
		System.out.println("Data de Vencimento: " + boleto.getVencimento());
		System.out.println("Valor: " + valor);
		//77240000015075
		
		System.out.println("Valor da multa: " + vMulta);
		
		System.out.println("Valor a pagar: " + valorMulta);
		
		
	}
}
