package interfaceEx;

public class Test {

	public static void main(String[] args) {

			//		new RemoteControl();
		
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
//		
		
		//변수(지역변수는 초기화) , 데이터 타입(기, 참(배열, 열거, 클래스, 인터페이스))
		
		RemoteControl remoteControl=null;
//		System.out.println(remoteControl);
		
		
		//System.out.println(new Television());
		remoteControl=new Television();
//		System.out.println(remoteControl);		
		remoteControl.turnOn();
		
//		remoteControl.setVolume(50);		
//	    remoteControl.setVolume(-5);
	    remoteControl.setVolume(7);
	    
	    System.out.println("-------------");
	    
	    
	    remoteControl.setMute(true);
	    
	    remoteControl.setMute(false);
	    
	    
	    System.out.println("###############");
	    
	    
	    
	    RemoteControl.changeBattery();
	    
	   // remoteControl.setVolume(7);
	    
	    //remoteControl.display(100);
	    //강제 형변환을 해서 인터페이스(상위개념)를 구현한 텔레비젼의 메서드에는 접근 가능  
	    Television tv=(Television) remoteControl;
	    
	    tv.display(100);
		
//	    System.out.println("================");
//	    
//		remoteControl=new Audio();
////		System.out.println(remoteControl);
//		remoteControl.turnOn();
//		remoteControl.setVolume(11);		
//	    remoteControl.setVolume(-1);
//	    remoteControl.setVolume(3);
	}

}
