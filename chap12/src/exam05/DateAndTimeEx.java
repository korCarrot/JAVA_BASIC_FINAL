package exam05;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//import java.sql.Date;

//import java.util.Date;

public class DateAndTimeEx {

	public static void main(String[] args) {
		//System.out.println(new Date());
		
		
		
		Date date=new Date();
//		System.out.println(date);
//		System.out.println(date.toString());
//		System.out.println(date.toGMTString());		
//		System.out.println(date.getYear());
//		System.out.println(2024-1900);		
			
		//간단한 날짜 형식으로 나타내주는 클래스와 함께 사용
	
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		//System.out.println(simpleDateFormat);
		
		String nowDate=simpleDateFormat.format(date);
		System.out.println(nowDate);
		
		System.out.println("===========");
		
		
		
		//new LocalDateTime();
		
		//System.out.println(LocalDateTime.now());
		LocalDateTime nowdate2=LocalDateTime.now();
	
		DateTimeFormatter  dtf=DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
	
		String time=dtf.format(nowdate2);
		System.out.println(time);
	
		
	}

}
