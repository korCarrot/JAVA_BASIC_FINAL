package interfaceEx3;

public class PromotionEx {

	public static void main(String[] args) {
		
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
//		System.out.println(b);		
		A a=null;
		System.out.println(a);
		
		a=b;		
		System.out.println(a);		
//      System.out.println(a==b);
		a=c;
		System.out.println(a);	
		
		a=d;
		a=e;
		
		
		
	}

}
