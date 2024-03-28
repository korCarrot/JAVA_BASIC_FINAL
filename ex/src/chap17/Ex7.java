package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
	
	public static void main(String[] args) {
		 List<Member2> mList=Arrays.asList(new Member2("홍길동", "개발자"),
				new Member2("김나리", "디자이너"),
				new Member2("신용권", "개발자")
				);
		 
		 
		 List<Member2> list=  mList.stream().filter((x)->{return x.getJob().equals("개발자");}).collect(Collectors.toList());
		 //System.out.println(list);
		 list.stream().forEach((x)->{System.out.println(x.getName());});
	}

}
