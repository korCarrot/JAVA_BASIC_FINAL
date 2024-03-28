package exam01;

public class ATest {

	public static void main(String[] args) {
		
		A a=new A();
		
		//System.out.println(a);
		
		//System.out.println(a.new B());
		
		
		A.B ab	= a.new B();  //1eb44e46
		
		//System.out.println(a.new B());
		//System.out.println(ab);
		
		
		
		System.out.println("=============");
		
		A.BB abb = new A.BB(); //1c4af82c
		
		System.out.println(abb);
		
	}

}
