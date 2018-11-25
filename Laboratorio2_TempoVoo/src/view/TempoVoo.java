package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import model.Viagem;

public class TempoVoo {

	public static void main(String[] args) {

		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId dubai = ZoneId.of("Asia/Dubai");
		ZoneId australia = ZoneId.of("Australia/Sydney");
		
		LocalDateTime emSP = LocalDateTime.of(2018, Month.MAY, 26, 1, 25);
		LocalDateTime emDB = LocalDateTime.of(2018, Month.MAY, 26, 22, 55);
		ZonedDateTime saidaSP = ZonedDateTime.of(emSP, saoPaulo);
		
		ZonedDateTime chegadaDB = ZonedDateTime.of(emDB, dubai);
		Duration duracao = Duration.between(saidaSP, chegadaDB);
		
		System.out.println("Duração Emirates: " + duracao);
		
		emSP = LocalDateTime.of(2018, Month.MAY, 26, 3, 15);
		emDB = LocalDateTime.of(2018, Month.MAY, 28, 0, 20);
		
		saidaSP = ZonedDateTime.of(emSP, saoPaulo);
		chegadaDB = ZonedDateTime.of(emDB, dubai);
		duracao = Duration.between(saidaSP, chegadaDB);
		
		System.out.println("Duração Emirates: " + duracao);
		
		LocalDateTime emAU = LocalDateTime.of(2018, Month.NOVEMBER, 27, 9, 55);
		emSP = LocalDateTime.of(2018, Month.NOVEMBER, 27, 18, 55);
		
		ZonedDateTime saidaAU = ZonedDateTime.of(emAU, australia);
		ZonedDateTime chegadaSP = ZonedDateTime.of(emSP, saoPaulo);
		
		duracao = Duration.between(saidaAU, chegadaSP);
		System.out.println("Duração São Paulo - Austrália: " + duracao);
		
		Viagem viagem = new Viagem();
		
		viagem.insereDados();
		
		viagem.calculoDuracao();
		
		
	}
}
