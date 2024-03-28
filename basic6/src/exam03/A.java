package exam03;

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

	// 클(인, 스)
	class B {
		 // field1=100;
		// method1();
		// field2=10;
		// method2();
		void method() {
			field1 = 1000;
			System.out.println(field1);
//			method1();
//			field2 = 100;
//			System.out.println(field2);
//			method2();
		}

	}

	static class C {
	}

}
