package interfaceEx2;

public class Test {

	public static void main(String[] args) {
		
		InterfaceCImpl interfaceCImpl=new InterfaceCImpl();
		
		//System.out.println(interfaceCImpl);
		
		
		InterfaceA ia =	interfaceCImpl;
		ia.methodA();
		//ia.methodB();
		
		System.out.println("-----------");
		InterfaceB ib =	interfaceCImpl;
		
		//ib.methoaA();
		ib.methodB();
		System.out.println("-----------");
		
		
		InterfaceC ic=interfaceCImpl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
