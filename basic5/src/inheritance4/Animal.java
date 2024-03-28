package inheritance4;

public abstract class Animal {
	
	//Animal 부모 , Bird/Insect/Fish 자식
	
	//메서드(함수)는 두 부분으로 나뉘다.
	
	// 선언부와 구현부
	
	// 선언부 void sound()	
	// 구현부 {	System.out.println("운다."); }
	
	// 구현(실체)부가 없는 메서드를 추상(abstract) 메서드 abstract void sound();
	
	//추상메서드가 있는 메서드는 추상 클래스여야 함
	
	abstract void sound();
	
	
	
	void breathe(){
		System.out.println("숨쉰다.");
	}

}
