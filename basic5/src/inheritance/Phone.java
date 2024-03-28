package inheritance;

public class Phone {
	
	//접근 제어자(modifier) : public protected private
	
	
	//필 : 인스턴스 필드, static 필드
	String model;
	String color="green";
	
	//생
	Phone(){
		System.out.println("Phone() 생성자 실행##");
	}
	
	
	Phone(String model, String color){
		this.model=model;
		this.color=color;
		System.out.println("2개짜리 부모 생성자 실행");
	}
	
	//메
	void bell(){
		System.out.println("벨이 울림");
	}

}
