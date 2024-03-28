package classBasic2;

public class Car {
	//필드 : 차가 가지고 있는 속성(공간)
	
	String company="HD";
	
	String model;
	String color;
	
	int maxSpeed;
	
	
	//생
	public Car() {
	
	}
	
	Car(String model){
		this.model=model;
	}
	
	
	Car(String model,String color ){
		this.model=model;
		this.color=color;
	}
	
	Car(String model,String color, int maxSpeed ){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	

}
