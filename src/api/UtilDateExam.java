package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getDay());
		now.setMonth(11);
		System.out.println(now.getMonth()+1);
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String nowStr = format.format(now);
		System.out.println(nowStr);
	}

}
