package exam03_1;

public class A {

	// 필(인,스), 타입(기,참(배,열,클,인), 접근제어자(퍼,프,디,피)
	int field1;
	static int field2;

	// 생
	public A() {

	}

	// 메(인,스)
	void method1() {
		System.out.println("A-m1");
	}

	static void method2() {
		System.out.println("A-m2");
	}

	
	static class C {
		
		static int aa=4;
//		field1=3;
		//field2=5;
		 //method1();
		void method() {
			//field1=3;
			field2=5;
			System.out.println(field2);
			// method1() ;
			method2();
		}
	}

}
