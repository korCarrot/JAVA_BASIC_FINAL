package generic2;

public class CarAgency implements Rentable<Car>{

	@Override
	public void rent1() {
		System.out.println("차 빌려줌");
		//return new Car();
	}

	@Override
	public Car rent2() {
		
		return new Car();
	}

}
