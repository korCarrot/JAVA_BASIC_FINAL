package inheritance3;

public class DriverTest {

	public static void main(String[] args) {
		
		
		Driver driver=new Driver();
		Vehicle vehicle=new Vehicle();
		driver.drive(vehicle);
		
		//자동형변환 
	//  부모타입 변수= 자식 타입 객체;  자동 타입 변환이 일어남
		
		//Bus bus=new Bus();
//		vehicle=bus;
		
		//driver.drive(bus);
		driver.drive(new Bus());
		
		Taxi taxi=new Taxi();
		driver.drive(taxi);
	}

}
