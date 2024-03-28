package package4;

import package3.A;

public class C {
	
	
	public C() {
	    A a=new A();
	    a.field1=8;
	    //a.field2=9;
	    //a.field3=5;
	    
	    a.method1();
//	    a.method2();
//	    a.method3();
	    
	}
	
	
	void method() {
		A a=new A();
		a.field1=7;
//		a.field2=9;
//	    a.field3=5;
		
		a.method1();
//	    a.method2();
//	    a.method3();
		
	}
	

}
