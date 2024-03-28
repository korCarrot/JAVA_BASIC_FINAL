package exam03_2;

public class ATest {

	public static void main(String[] args) {
		
		//System.out.println(new A());
		
		A a=new A();
		
		
		//System.out.println(a);
		
//		System.out.println(a.field);
//		a.method();
		
		//6f2b958e
		//System.out.println(new A());
		
		//new A().printA(); //6f2b958e
		
		
//		A.B ab =a.new B();
//		System.out.println(ab.field);
//		ab.method();
		
		//System.out.println(a.new B()); //1eb44e46
		
		//a.new B().printB(); //1eb44e46
		
		System.out.println("------------");
		
		a.new B().printAA();  //1eb44e46 : A 자기 자신 주소
		
	
	}

}
