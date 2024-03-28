package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {
	
	//1.4
	//2.2
	//3.4
	//4.3
	
	
	
	

	public static void main(String[] args) {
		List<String> list=Arrays.asList("This is a java book", "Lambda Expressions", "Java8 supports lambda expressions");
		//System.out.println(list);
		
		// 대소문자 상관없이 java라는 단어가 포함된 문자열만 필터링해서 출력
		
//		Stream stream = list.stream().filter((x)->{return x.equalsIgnoreCase("java");}).peek((x)->{System.out.println(x);});
		
		
		list.stream().filter((x)->{return x.contains("java");}).forEach((x)->{System.out.println(x);});
		System.out.println("===============");
		list.stream().filter((x)->{return x.toLowerCase().contains("java");}).forEach((x)->{System.out.println(x);});
		
	}

}