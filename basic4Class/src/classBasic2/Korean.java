package classBasic2;

public class Korean {
	
	//필드
	
	String nation="대한민국";
	String name;
	String ssn;
	
	//생
	//기본 생성자
	public Korean() {
	
	}
	
//	public Korean(String nation) {
//		this.nation=nation;
//	}
	
	// 생성자의 형태는 매개변수 타입이 다르던가, 매개변수의 갯수나 순서가 달라야 함(생성자 overloading)
	public Korean(String name) {
		this.name=name;
	}
	
	
	public Korean(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	
	
	
	
	
	//메

}
