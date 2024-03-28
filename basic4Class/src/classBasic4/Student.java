package classBasic4;

public class Student {
	
	//필
	String name;    //인스턴스 필드, 객체를 만드는(인스턴스화) 행위를 통해서 사용되는 것이 좋다.
	
	static String schoolName="미금고"; //정적(static) 필드, Student에 바로 접근해서 사용하는 필드
	
	
	//생
	public Student() {
	
	}
	
	
	public Student(String name) {
		this.name=name;
	}
	
	//메(동사)  //메서드도 두가지가 있다. 인스턴스 메서드, static 메서드
	// 리턴타입 앞에 아무것도 없으면 인스턴스 메서드, static 붙으명 static 메서드
	void study(){ //인스턴스 메서드, 인스턴스화 행위를 통해서 사용
		System.out.println("공부한다.");
	}

	
	static void staticMethod() { //static 메서드, 클래스명.메서드명() 사용
		System.out.println("static 공부한다.");
	}
	
	
	
}
