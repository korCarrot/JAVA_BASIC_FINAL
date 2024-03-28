package classBasic3;

public class CarEx {

	public static void main(String[] args) {
		
//	   Car myCar=new Car();
//	   
//	   System.out.println(myCar.model + " " +myCar.color + "  " + myCar.maxSpeed);
//	   
//	   
//	   Car myCar2=new Car("에쿠스");
//	   
//	   System.out.println(myCar2.model + " " +myCar2.color + "  " + myCar2.maxSpeed);
//	   
//	   
//	   Car myCar3=new Car("르망", "녹색");
//	   
//	   System.out.println(myCar3.model + " " +myCar3.color + "  " + myCar3.maxSpeed);
		
		
		Car myCar=new Car();
		
		
//		myCar.roll1();
		// return type이 void가 아닌 경우 무조건 return type에 맞는 타입의 변수로 받으시기 바랍니다.
		int value=myCar.roll2();
		
		System.out.println(value);
		
		
	   
	}
	
	

}
