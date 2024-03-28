package classBasic2;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar=new Car("제네시스", "검정", 300);
		
		System.out.println(myCar.company +" " + myCar.model + " " +myCar.color + " " + myCar.maxSpeed);

//		System.out.println("===========");
//		
//		Car myCar2=new Car("하얀색", "그랜저", 300);
//		
//		System.out.println(myCar2.model + " " +myCar2.color);
	}

}
