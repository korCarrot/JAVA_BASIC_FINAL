package sec14;

public class CarUse {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
//		myCar.speed=50;
		
		
		int result=myCar.getSpeed();
		System.out.println(result);
		
		
		myCar.setSpeed(50);
		
		int result2=myCar.getSpeed();
		System.out.println("현재 속도는"+result2);
		
		
//		System.out.println(myCar.isStop());
//		
//		myCar.setSpeed(-30);
//		
//		System.out.println(myCar.getSpeed());
		
		//멈춤
//		myCar.isStop();
//		
		if(myCar.isStop() != true) {
			myCar.setStop(true);
		}
//		
		System.out.println("현재 속도는" +myCar.getSpeed());
	}

}
