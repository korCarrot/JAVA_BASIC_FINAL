package inheritance;

// 스마트폰(자식)은 폰(부모)이다.
public class SmartPhone extends Phone {

	// 필
	boolean wifi;

	// 생
	public SmartPhone() {
		System.out.println(super.color);
		//super(); //컴파일 과정에서 자동 추가, 생략 가능
	}
	
	
	public SmartPhone(String model, String color){
		super(model,color); //컴파일 과정에서 자동 추가, 생략 가능
//		this.model=model;
//		this.color=color;
	}
	
	

	// 메
	void internet() {
		System.out.println("인터넷 연결");
	}

	void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
}
