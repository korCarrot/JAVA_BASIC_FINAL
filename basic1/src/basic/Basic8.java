package basic;

public class Basic8 {

	public static void main(String[] args) {
		
		
		String var1="A";
//		String var2='A';
		String var3="홍길동";
		
//		\   escape, 문자 그대로의 의미를 벗어난다
		
		System.out.println("'");
		System.out.println("\"");
		
		System.out.println('\'');
		
		System.out.println("\\");
		
		
		char ch1='\uac00';
		System.out.println(ch1);
		
		
		System.out.println("가" + "나");
		
		
		System.out.println(1 + "가");
		
		System.out.println("가");
		System.out.println("가    나");
		System.out.println("가\t나");
		System.out.println("a    b");
		System.out.println("a\tb");
		
		System.out.print("안녕\n반갑다");
		
		
	}

}
