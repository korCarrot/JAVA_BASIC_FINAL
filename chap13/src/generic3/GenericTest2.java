package generic3;

public class GenericTest2 {

	static <T extends Number> boolean compare(T num1, T num2 ) {
		
		
		System.out.println(num1.getClass().getName());
		
		double n1=num1.doubleValue();
		double n2=num2.doubleValue();
		
		boolean result =  (n1 == n2)? true: false;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
//		boolean result=compare(10, 10);
//		System.out.println(result);

		boolean result2=compare(10, 20);
		System.out.println(result2);
		
//		boolean result3=compare(10.5, 10.5);
//		
//		System.out.println(result3);
		
		
		boolean result4=compare(10.5, 10.5);
		
		System.out.println(result4);
	}

}
