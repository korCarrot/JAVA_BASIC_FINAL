package basic3;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//1명의 학새 국 영 수  85 95 87

		//3명으로 늘어날 경우...
		
		//평균 구하기
		
		int arr[]=new int[] {81,91,84};
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==========");
		// 평균 구하는 방법 : 
		//   1)과목의 총합(누적합)과 과목의 수(arr.length)
		//   2) (double)총합 / 과목의 수
		
		int total=0;
		for(int  i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		System.out.println(total);
		
		double avg= (double)total / arr.length;
		
		System.out.printf("%.2f", avg);
	}

}
