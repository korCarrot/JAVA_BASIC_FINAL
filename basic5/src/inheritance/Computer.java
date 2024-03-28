package inheritance;

public class Computer extends  Calculator{

	
	public Computer() {
	
	}
	
	//재정의(override)	
//	double areaCircle(double r){
//		System.out.println("자식의 areaCircle ");
//		 double result = Math.PI*r*r;
//		 return result;
//	}
	
	@Override  //어노테이션(annotation, 주석), @Override를 붙이면 컴파일 단계에서 정확히 오버라이딩 되었는지 체크하고, 문제가 있다면 컴파일 에러 출력
	double areaCircle(double r) {
		System.out.println("자식의 areaCircle ");
		 double result = Math.PI*r*r;
		 return result;
	}
	
	
}
