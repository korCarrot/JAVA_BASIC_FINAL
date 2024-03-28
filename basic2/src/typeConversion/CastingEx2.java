package typeConversion;

public class CastingEx2 {
	
	
	public static void main(String[] args) {
		
		
		
		// float 타입끼리의 연산, 잘 사용은 안됨		
		float result = 1.2f + 3.4f;
		System.out.println(result);
		

		//실수에 대한 강제 형 변환
		
		//실수에 대한 연산은 반드시 double을 사용
		double result2 = 1.2 + 3.4;
		
		System.out.println(result2);
		
		
		//float와 double 연산
		
		double result3=1.2f + 3.4;
		System.out.println(result3);
		
		
		
	}

}
