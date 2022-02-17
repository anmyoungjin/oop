package api;

import java.time.LocalDate;

public class LocalDateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate now2 = LocalDate.of(2021, 12, 31);
		System.out.println(now2.getDayOfWeek());
		
		 
	}

}
