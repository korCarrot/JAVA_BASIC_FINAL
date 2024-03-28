package interfaceEx3;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		
		myCar.run();
		
		System.out.println("=========");
		
		myCar.tire1=new KTire();
		myCar.run();
		
	}

}
