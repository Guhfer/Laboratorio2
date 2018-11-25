package view;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorario {

	public static void main(String[] args) {
		
		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId londres = ZoneId.of("Europe/London");
		ZoneId moscou = ZoneId.of("Europe/Moscow");
		ZoneId toquio = ZoneId.of("Asia/Tokyo");
		ZoneId alaska = ZoneId.of("US/Alaska");
		
		System.out.println("São Paulo: " + ZonedDateTime.now(saoPaulo));
		System.out.println("Londres: " + ZonedDateTime.now(londres));
		System.out.println("Moscou: " + ZonedDateTime.now(moscou));
		System.out.println("Tóquio: " + ZonedDateTime.now(toquio));
		System.out.println("Alaska: " + ZonedDateTime.now(alaska));
	}
}
