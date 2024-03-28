package interfaceEx2;

public class SmartTelevisionTest {

	public static void main(String[] args) {
		
		//SmartTelevision smartTelevision=new SmartTelevision();
		RemoteControl rc=new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		
		Seachable seachable=new SmartTelevision();
		seachable.search("http://www.naver.com");
	}

}
