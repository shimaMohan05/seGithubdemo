package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(df.format(now));
		
		

	}

}
