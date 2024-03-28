package classBasic3;

public class Accumulate {

	//필
	
	//생
	public Accumulate() {
	
	}
	
	//메
	
	int accu() {
		int total = 0;

		for (int i = 0; i <= 5; i++) { // 경우에 따라 X, 1(하나), 1,2(둘), 1,2,3(세개)
			total += i;
		}

//		System.out.println(total);
		return total;
	}
	
	
	
	void accu2(int num1) {
		System.out.println(num1);
	}
	
	
	void accu3(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	
	//매개변수에 들어갈 수 있는 데이터 타입(기본형, 참조형))
	void accu4(int arr[]) {
		//메서드의 정의시 배열의 실제값이 뭐가 들어갈지 모름, 배열의 길이도 모름
		//호출하는 순간 실제값이 들어가므로, 호출시 배열의 길이가 정해짐
		
//		int result=arr[0]+arr[1];
//		System.out.println(result);
		
		
		int total = 0;

		for (int i = 0; i < arr.length; i++) { // 경우에 따라 X, 1(하나), 1,2(둘), 1,2,3(세개)
			total += arr[i];
		}
		System.out.println(total);
		
	}

	
	
	
	// 가변길이 매개변수 ...
	void accu5(int ... arr) {
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		
		int total = 0;

		for (int i = 0; i < arr.length; i++) { // 경우에 따라 X, 1(하나), 1,2(둘), 1,2,3(세개)
			total += arr[i];
		}
		System.out.println(total);
	}
	
	
	//0부터 해당 숫자까지 누적
	
	void accu6(int num) {
		System.out.println("들어온 숫자" + num);
		
		int total = 0;

		for (int i = 0; i <= num; i++) { 
			total += i;
		}
		System.out.println(total);
	}
	
	
	
	
}
