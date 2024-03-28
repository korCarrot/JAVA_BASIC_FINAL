package exam02;

public class A {
	
	//필
	
	//생성자도 일종의 메서드, 메서드 영역은 우리가 local, 그 안에 있는 클래스는 로컬 클래스
	public A() {
		
		//B b=new B();
		
		class B{
			public B() {
			
			}
		}
		
		
		//로컬 객체 생성
		B b=new B();
	}
	
	
	//메
	void method(){
		//B b=new B();
		//로컬 클래스
		class B{
			
		}
		//로컬 객체 생성
		B b=new B();
	}
	
	
	
	
	

}
