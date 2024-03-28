package methodEx;

public class FunTest {

	
	
	public static void main(String[] args) {
		
//		sunja1();
		//sunja2("사탕");
//		String gift=sunja3();
//		System.out.println(gift);
		
		String gift=sunja4("과자");
		System.out.println(gift);
	}
	
	static void sunja1() {
		System.out.println("hiwwe");
	}
	
	static void sunja2(String gift) {
		System.out.println(gift);
	}
	
	static String sunja3() {
		return "초콜렛";
	}
	
	static String sunja4(String gift) {
		System.out.println(gift);
		return "탕후루";
	}

}
