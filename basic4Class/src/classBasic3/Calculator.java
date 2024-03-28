package classBasic3;

public class Calculator {
	
	//필
	
	//생
	public Calculator() {
	
	}
	
	//메소드를 정의
	// 두 수가 들어갈 변수(매개변수) 넣어서 더한후에 반환하는 그런 기능의 함수를 정의
	void add(int num1, int num2) {
		int result=num1 + num2;
		System.out.println(result);
	}

	
	int add2(int num1, int num2) {
		int result=num1 + num2;
		return result;
	}	
	
	
	//정사각형 넓이
	
	double areaRectangle(double width){
		double result=width*width;
		return result;
	}
	
	
	//직사각형 넓이(메서드 overloading : 매개변수의 타입, 개수, 순서가 다른 메서드를 여러개 선언하는 것)
	
	double areaRectangle(double width, double height){
		double result=width*height;
		return result;
	}
	
	
	
	double areaRectangle(int width, double height){
		double result=width*height;
		return result;
	}
	
}
