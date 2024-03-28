package exam03_6;

public class Car {

	//타이어의 자식 클래스를 바로 만들 수 있음, 어떻게 ? 익명으로 자식클래스 만들 수 있음 
	// 중괄호(익명 클래스)를 하는 순간 Tire가 부모 클래스가 되고, 중괄호는 이름이 없는 자식 클래스가 됨
	Tire ktire=new Tire(){
		@Override
		void roll() {
			System.out.println("금호 타이어가 굴러감");
		}
	};
	
	Tire htire=new Tire(){
		@Override
		void roll() {
			System.out.println("한국 타이어가 굴러감");
		}
	};
	
	
	void run() {
		ktire.roll();
		htire.roll();
	}
}
