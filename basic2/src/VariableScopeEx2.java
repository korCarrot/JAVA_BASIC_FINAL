
public class VariableScopeEx2 {
	
	static int var1=5;
	
	static void hi(){
		System.out.println(var1);
		System.out.println("안녕");
	}
	
	public static void main(String[] args) {
		
//		System.out.println(var1);
		
//		int v1=20;
//		if(true) {
////			int v1=20;
//			System.out.println("hi");
//			System.out.println(v1);
//		}
//		
//		System.out.println("hi2");
//		//System.out.println(v1); 에러나는 이유는 v1이라는 변수는 if문의 영역에서 선언되었으므로 그 안에서만 사용이 가능
//		System.out.println(v1); 
		
		hi();
	}

	
	
}
