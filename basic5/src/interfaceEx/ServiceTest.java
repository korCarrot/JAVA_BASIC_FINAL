package interfaceEx;

public class ServiceTest {

	public static void main(String[] args) {
		//new Service();

		
//		ServiceImpl  serviceImpl =	new ServiceImpl();
		
		// 클래스 구현시 그 클래스가 구현한 인터페이스가 있을 경우
		// 인터페이스 변수로 타입을 선언 후 사용, 그래야 다양한 형태로 사용 가능
		
		Service service=new ServiceImpl();
		
		
		service.defaultMethod1();
		System.out.println("---------------");
		service.defaultMethod2();
		
		
		System.out.println("=====================");
		Service.staticMethod1();
		System.out.println("---------------");
		Service.staticMethod2();;
		
	}

}
