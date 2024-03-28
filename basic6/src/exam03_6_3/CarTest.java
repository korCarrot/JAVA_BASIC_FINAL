package exam03_6_3;

public class CarTest {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.run(new Tire() {
			@Override
			void roll() {
				System.out.println("금호 타이어 굴러감");
			}
		});
		
		myCar.run(new Tire() {
			@Override
			void roll() {
				System.out.println("한국 타이어 굴러감");
			}
		});
	}

}
