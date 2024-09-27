package trabalhando_com_datas_em_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		// Manipulação de Data e Hora
		//Operações importantes
		// INSTANCIAÇÃO
		// FORMATÇÃO
		// OBTER DADOS DE UMA data-hora local
		// converter global para loca
		// calculos com data-hora
		
		//Principais tipos de Java(Versão 8+)
		
//   		Data-hora local
//				LocalDate
//				LocalDateTime
	//		Data-hora global
	//			instant
	//		Duração
	//			Duration
	//		Outros
	//			Zoneld
	//			ChronoUnit
		
		// Intanciação - 
		
		// Data-hora do instante atual (agora)
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 " + d01);
		
		// com horario
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 " + d02);
		
		// data-hora global instante atual
		Instant d03 = Instant.now();
		System.out.println("d03 " + d03);
		
		// Texto ISO 8601 para Data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("d04 " + d04);
		
		// Texto ISO 8601 com data e hora
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T14:21:26");
		System.out.println("d05 " + d05);
		
		// Texto ISO 8601 com instant (Padrão UTC)
		Instant d06 = Instant.parse("2022-07-20T14:21:26Z");
		System.out.println("d05 " + d06);
	
		// Texto ISO 8601 com time zone diferente do GMT
		Instant d07 = Instant.parse("2022-07-20T14:21:26-03:00");
		System.out.println("d07 " + d07);
		
		//Texto customizado e Data-hora
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", form1);
		LocalDateTime d09 = LocalDateTime.parse("21/07/2022 09:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

		System.out.println("d08 " + d08);
		System.out.println("d09 " + d09);
		
		// Instanciar data a partir dados isolados
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d10 " + d10);
		System.out.println("d11 " + d11);
		
	}

}
