package aula_date_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class programa {

	public static void main(String[] args) throws ParseException{

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println(y1);
		System.out.println(y2);
	}

}
