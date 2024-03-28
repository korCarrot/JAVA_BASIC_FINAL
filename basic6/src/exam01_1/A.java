package exam01_1;

public class A {

	//필
	
	//생
	public A() {
		System.out.println("A 생성자 부분");
	}
	
	
	//메
	void useB(){
		
		B b=new B();
		System.out.println(b.field1);
		b.m1();
		
		System.out.println(B.field2);
		
		B.m2();
	}
	
	
	//인스턴스 멤버 클래스 B
	class B{
		
		//필(인, 스)
		int field1=1;		
		String str="hi";
		
		
		//Java 17부터 허용
		static int field2=2;
			
		
		//생
		public B() {
			System.out.println("B 생성자 부분22");
		}

		//메(인, 스)		
		void m1() {
			System.out.println("B-m1");
		}
		
		
		//Java 17부터 허용
		static void m2() {
			System.out.println("B-m2");
		}
		
		
		
	}
	
	
	
	
	
}
