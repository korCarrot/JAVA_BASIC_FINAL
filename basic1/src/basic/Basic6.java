package basic;

public class Basic6 {

	public static void main(String[] args) {
		//변수는 값이 변하므로 변수를 선언할 경우 처음에 그냥 값을 넣고자 하면 숫자는 0으로 초기화 문자는 '',  ' ' , 문자열은 ""  " "
		
		int num1=0;
		
//		char ch1='';
		char ch1=' ';
		
		String st1="";
		
		// 컴파일러는 정수는 int, 실수는  double로 인식  
		float fl1=3.4F;
		System.out.println(fl1);
		
		
		double fl2=3.4;
		System.out.println(fl2);
		
		
		
		//정밀도
		float var1=0.1234567890123456789f;
		
		System.out.println(var1);
		
		double var2=0.1234567890123456789;
		
		System.out.println(var2);
		
		System.out.println("================================");
		
		//10의 거듭제곱 literal
		System.out.println(3e6);
		
		float var4=3e6F;
		System.out.println(var4);
		System.out.println("================================");
		
		System.out.println(2e-3);
		
		
		
		

	}

}
