package basic3;

public class FunEx1 {
	
	void method1(){
		System.out.println("m1");
	}
	
	static void smethod1(){
		System.out.println("s-m1");
	}
	public static void main(String[] args) {
		FunEx1 ex1=new FunEx1();
		
		ex1.method1();
		
		
		FunEx1.smethod1();

		
		System.out.println("===========");
		
		
		//System.out.println(ex1.method1);
		
	}

}
