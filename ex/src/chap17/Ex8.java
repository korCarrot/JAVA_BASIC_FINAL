package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex8 {
	
	public static void main(String[] args) {
		 List<Member2> mList=Arrays.asList(new Member2("홍길동", "개발자"),
				new Member2("김나리", "디자이너"),
				new Member2("신용권", "개발자")
				);
		 
		 
		 Map<String, List<Member2>>  map=mList.stream().collect(Collectors.groupingBy( (x)->{return x.getJob();}));
		 
		 System.out.println("[개발자]");
		 
		 map.get("개발자").stream().forEach((x)->{System.out.println(x.getName());});
		 
		 
		 System.out.println("[디자이너]");
		 
		 map.get("디자이너").stream().forEach((x)->{System.out.println(x.getName());});
		 
	}

}
