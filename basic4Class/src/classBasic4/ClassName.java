package classBasic4;

public class ClassName {

	// 필

	// 인스턴스 필드
	int field1;
	// static 필드
	static int field2;

	// 생
	public ClassName() {

	}
	
	
	static {
		//field1=5;
		//method1();
		field2=6;
		method2();
	}
	

	// 메
	// 인스턴스 메서드
	void method1() {
		this.field1=10;
	}

	// static 메서드
	static void method2() {
//		this.field1=13;

//		this.method1();
	}

}
