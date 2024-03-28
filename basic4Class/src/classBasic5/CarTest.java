package classBasic5;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
//		myCar.speed=60;		
		System.out.println("내 차의 현재 속력은 " +  myCar.speed);
		
		myCar.changeSpeed();
		
		System.out.println("내 차의 현재 속력은 " +  myCar.speed);
	}

}
