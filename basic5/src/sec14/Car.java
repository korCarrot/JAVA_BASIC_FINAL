package sec14;

public class Car {
	
	private int speed;
	
	private boolean stop;

	
	// 필드가 private일 경우 Getter/Setter 메소드라는 방법을 통해서 
	//                      접근 / 수정   할 수 있게 함
	
	//Getter(값 반환)
	public int getSpeed(){
		return speed;
			//return this.speed;
	}
	
	
	//Setter(값 설정)
	public void setSpeed(int speed){
//		this.speed=speed;
		//속력은 음수가 나올 수 없으므로
		if(speed < 0) {
			this.speed=0;
		}else {
			this.speed=speed;	
		}
		
	}
	
	
	//Getter
	public boolean isStop(){
		return stop;
//		return this.stop;
	}
	
	//Setter
	public void setStop(boolean stop){
		this.stop=stop;		
		if(stop == true) {
			this.speed=0;
		}
	}
	
}
