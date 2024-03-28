package exam05;

public class SystemEx {

	public static void main(String[] args) {
		
		//System.err.print("hi");
		
//		System.exit(0);
//		
//		hi();
//		
//		System.out.println("hi");
		
		
//		long start=System.currentTimeMillis();
//		
//		
//		for(int i=0;i<1000000;i++) {
//			System.out.println("hi");
//		}
//		
//		long end=System.currentTimeMillis();
//		System.out.println(end-start);
		
		
		System.out.println("시스템 프로퍼터(자바 프로그램이 시작될 때 자동 설정되는 시스템의 속성 : \n" + System.getProperties());
		//System.out.println(System.getProperty("java.specification.version")); 
		System.out.println("=========================================");
		System.out.println("시스템 환경 : \n" + System.getenv());
		//System.out.println(System.getenv("HOMEPATH"));
		
		

	}
	
//	static void hi() {
//		System.out.println("hihi");
//	}

}
