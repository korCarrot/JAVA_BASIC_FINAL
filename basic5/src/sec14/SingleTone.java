package sec14;

public class SingleTone {
	
	//필
	
	private static SingleTone singleTone= new SingleTone();
	
	
	//생
	
	private SingleTone() {
	
	}
	
	//메
	public static SingleTone getInstance(){
		return singleTone;
	}

}
