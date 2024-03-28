package classBasic3;

public class CalculatorEx2 {

	public static void main(String[] args) {
		
		
		Calculator calculator=new Calculator();
		double result=calculator.areaRectangle(10);
		System.out.println(result);
		
		
		double result2=calculator.areaRectangle(10, 5);
		System.out.println(result2);
		
		
		double result3=calculator.areaRectangle(10.5, 5);
		System.out.println(result3);
	}

}
