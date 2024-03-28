package exam05;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		
		
		//전화번호부 패턴
		
		// 지역번호(02)거나 핸드폰번호(010)-3자리이거나 4자리-4자리
		
		String regEx="(02|010)-\\d{3,4}-\\d{4}";	
		
		
		System.out.println(Pattern.matches(regEx, "010-123-4567"));
		System.out.println(Pattern.matches(regEx, "032-333-2222"));
		
		//이메일 패턴
		
		String regEx2="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		System.out.println(Pattern.matches(regEx2, "abc@gmail.com"));
		System.out.println(Pattern.matches(regEx2, "abc@aa.co.kr"));
		
		//숫자(digit) \d
		
		//영어 대문자 
		
		//영어 소문자
		
		//한글 [ㄱ-힣]
		
		//결합[0-9a-zA-Zㄱ-힣]
		

	}

}
