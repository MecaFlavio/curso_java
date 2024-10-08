package trabalhando_com_datas_em_java;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {
		
		//Iterando tempo em uma data-hora para gerar outra data-hora
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate " + pastWeekLocalDate );
		System.out.println("nextWeekLocalDate " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime " + pastWeekLocalDateTime );
		System.out.println("nextWeekLocalDateTime " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeeInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant " + pastWeekInstant);
		System.out.println("nextWeekInstant " + nextWeeInstant);
		
		//Duração entre datas com Duration
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		//Nessessário converter LocalDate para LocalDateTime 
		//Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d06);		
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		
	}

}