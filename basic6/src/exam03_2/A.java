package exam03_2;

public class A {

	String field="A-field";
	
	public A() {
	
	}
	
	void method() {
		System.out.println("A-method");
	}
	
	void printA() {
		System.out.println(this);
	}
	
	
	class B{
		
		String field="B-field";
		
		public B() {
		
		}
		
		void method() {
			System.out.println("B-method");
		}
		
		void printB(){
			System.out.println(this);
		}
		
		void printAA() {
			System.out.println(A.this);
			System.out.println("============");
			System.out.println();
//			System.out.println(A.this.field);
//			
			//A.this.method();
			
		}
		
		
	}
	
}
