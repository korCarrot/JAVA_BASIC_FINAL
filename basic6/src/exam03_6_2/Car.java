package exam03_6_2;

public class Car {

	void run() {

		Tire ktire = new Tire() {
			@Override
			void roll() {
				System.out.println("금호 타이어가 굴러감");
			}
		};
		
		
		Tire htire = new Tire() {
			@Override
			void roll() {
				System.out.println("한국 타이어가 굴러감");
			}
		};
		
		
		ktire.roll();
		htire.roll();

	}
}
