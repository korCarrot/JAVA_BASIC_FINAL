package interfaceEx2;

public class SmartTelevision extends   Television   implements RemoteControl, Seachable   {

	@Override
	public void turnOn() {
		System.out.println( "스마트 TV 켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println( "스마트 TV 끔");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "검색");
		
	}

	

}
