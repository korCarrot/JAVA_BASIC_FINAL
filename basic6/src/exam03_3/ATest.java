package exam03_3;

class A {

	class B {

		void printAA() {
			System.out.println(A.this);
		}

	}

}

public class ATest {

	public static void main(String[] args) {
		
		new A().new B().printAA(); //1eb44e46
		
		System.out.println("=============");
		System.out.println(new A());

	}

}
