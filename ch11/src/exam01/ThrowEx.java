package exam01;

public class ThrowEx {

	
	// throws는 예외를 처리하지 않고 나몰라라 던져버린 것임, 예외가 안 날경우 순간 모면, 그래서 만약 예외가 나면 예외 발생함
	public static void main(String[] args) throws ClassNotFoundException{
		
		
	//앞으로 클래스명을 찾는 경우 문자열로 넣는 경우 패키지명.클래스명까지 해야 정확하게 클래스명을 인식합니다.
			
//			try {
//				Class obj=Class.forName("java.lang.String");
//				
//				System.out.println(obj);
//			} catch (ClassNotFoundException e) {
//			
//				e.printStackTrace();
//			}
			
				Class obj=Class.forName("java.lang.String2");
				
				System.out.println(obj);
			
			
			
		System.out.println("hi");
	}
	
	


}
