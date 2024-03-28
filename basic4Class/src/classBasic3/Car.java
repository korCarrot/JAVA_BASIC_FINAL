package classBasic3;

public class Car {
	//필드 : 차가 가지고 있는 속성(공간)
	
	String company="HD";
	
	String model;
	String color;
	
	int maxSpeed;
	
	
	//생
	public Car() {
//		this("제네시스");
//		this("아반테","파란");
//		this("소나타", "노랑",200);
	}
	
	
	Car(String model){
//		this.model=model;
		this(model, "은색", 250);
	}
	
	
	Car(String model,String color ){
//		this.model=model;
//		this.color=color;
		this(model, color, 400);
	}
	
	Car(String model,String color, int maxSpeed ){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	
	//메소드(함수), 함수는 기능, 기능은 동작, 동사에 해당
	
//	리턴타입 메소드명() {
//		
//	}
	
	
	//void를 제외한 나머지는 return 함수 안에 넣어놓으시고 일단 해당타입 초기값(0(기본형)이나 null(참조형)으로 만들어 놓으세요
	//return
	
	//메서드(함수) 정의시 실행부에는 하나의 기능 있는 것이 좋다.
	
	//메소드 정의1 void인 경우
	void roll1() {
		System.out.println("차가 달린다.");
//		System.out.println("차가 달린다2..");
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(i);
//		}
		
	}
	
	//메소드 정의2 기본 타입(bsil fd cb)인 경우
	
	int roll2(){
		
		return 1;
	}
	
	double roll3(){
		return 0.0;
	}
	
	boolean roll4(){
		return false;
	}
	
	
	//메소드 정의3 참조형(배열, 열거, 클래스, 인터페이스)
		
	int[] roll5() {
		return null;
	}
	
	String[] roll51() {
		return null;
	}
	
	String roll6() {
		return null;
	}
	
	Car roll7() {
		return null;
	}
	

}
