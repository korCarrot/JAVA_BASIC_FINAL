package generic2;

public class GenericTest {

	public static void main(String[] args) {
		CarAgency carAgency=new CarAgency();
		//Car car=carAgency.rent();
		carAgency.rent1();
		Car car=carAgency.rent2();
		System.out.println(car);
		car.run();
		
		//carAgency.rent2().run();
		
		
		HomeAgency homeAgency=new HomeAgency();
		//Home home=homeAgency.rent();
		homeAgency.rent1();
		Home home=homeAgency.rent2();
		home.turnOnLight();
		
	}

}
