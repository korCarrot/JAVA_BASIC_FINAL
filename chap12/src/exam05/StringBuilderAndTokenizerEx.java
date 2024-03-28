package exam05;

import java.util.StringTokenizer;

public class StringBuilderAndTokenizerEx {

	public static void main(String[] args) {

		String str1="hi";
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		//System.out.println(str1.hashCode());
//		System.out.println(System.identityHashCode(str1));
		
		str1="nice";
		
		//System.out.println(str1.hashCode());
//		System.out.println(System.identityHashCode(str1));
		
		
		System.out.println("===============");
		//공간의 효과적 사용 StringBuilder
		
		//System.out.println(new StringBuilder());
		
		StringBuilder strbuiler=new StringBuilder();
		System.out.println(System.identityHashCode(strbuiler));
				
		strbuiler.append("DEF").insert(0, "ABC").delete(3, 4);
		
		System.out.println(strbuiler);
		System.out.println(strbuiler.toString());
		
//		strbuiler.append("DEF");
//		System.out.println(System.identityHashCode(strbuiler));
//		System.out.println(strbuiler);
//		strbuiler.insert(0, "ABC");
//		System.out.println(strbuiler);
//		strbuiler.delete(3,4);
//		System.out.println(strbuiler);
		
		
		
		
		System.out.println("---------");
		
		
		//구분자 : delimeter, seperator(기본값 공백), 대부문 콤마로 많이 쪼갬(그럼 콤마를 구분자로 넣어야 됨)
		
		String str2="홍길동,김길동/박길동";
		
		//StringTokenizer stringTokenizer=new StringTokenizer(str2);
		StringTokenizer stringTokenizer=new StringTokenizer(str2,"/,");
		//기본값이 공백
		
		//System.out.println(stringTokenizer);
		//반복(갯수 X), 조건은 끝날때까지.. 다음 토큰이 있냐?
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
