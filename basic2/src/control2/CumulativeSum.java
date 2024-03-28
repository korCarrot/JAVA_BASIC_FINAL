package control2;

public class CumulativeSum {
	
	public static void main(String[] args) {
		
		
		//1 부터 10까지 누적해서 총합 
		
		
		//1
		//1+2
		//3이라는 결과값을 저장할 공간(변수명)를 생각해내셨나?
		//그 새로운 변수(3)값과 +3이라는 결과 6
		
		//
		int total=0;
		
		//반복문 사용
		
		//틀
		
		for(int i=1;i<=100;i++) {
			//System.out.println(i);
			total=total+i;
		}
		
		System.out.println(total);
		
		
	}

}
