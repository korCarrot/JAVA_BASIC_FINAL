package exam02_1;

public class A {

	//B b = new B();

	// 메소드 안의 로컬 클래스는 메서드 영역 안에서 객체를 만들어서 로컬 클래스 안으로 접근 후 사용
	void useB() {
		
		System.out.println("useB메서드 실행 1 ");
		
		//B b=new B();
		
		class B {
			
			//B b=new B();
			
			// 필
			int field1 = 1;
			static int field2 = 2;

			// 생

			public B() {
				System.out.println("B 생성자 실행");
			}

			// 메
			void m1() {
				System.out.println("B-m1");
			}

			static void m2() {
				System.out.println("B-m2");
			}

		}
		
		
		System.out.println("useB메서드 실행 2");
		
		B b=new B();
		System.out.println(b.field1);
		System.out.println(b.field2);
		b.m1();
		b.m2();
		
	}

//	void useBmethod(){
//		class B{
//			
//		}
//	}

}
