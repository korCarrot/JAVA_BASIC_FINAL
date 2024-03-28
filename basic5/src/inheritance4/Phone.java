package inheritance4;

public abstract class Phone {
	
	//
	String owner;
	
	//
	public Phone() {
	
	}

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	//
	
	
	abstract void bell();
	
	
	

	void turnOn(){
		System.out.println("폰 전원 켬");
	}
	
	
	void turnOff(){
		System.out.println("폰 전원 끔");
	}
}
