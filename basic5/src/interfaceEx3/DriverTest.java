package interfaceEx3;

public class DriverTest {

	public static void main(String[] args) {
		
		//new Vehicle();
		
		Driver driver=new Driver();
		
//		driver.drive(new Bus());
//		
//		driver.drive(new Taxi());
		
		Bus bus=new Bus();
		driver.drive(bus);
		
		Taxi taxi=new Taxi();
		driver.drive(taxi);

	}

}
