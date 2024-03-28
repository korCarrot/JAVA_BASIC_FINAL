package alg;

public class MaxMinValue {

	public static void main(String[] args) {

		// 최대값
		// 범위가 정해져야 찾을 수 있다.
		// 공간이 한정(배열)
		// for 돌리면서 각각을 비교해서 해당되는 값을 최대값 변수에 넣어놈

		// 최대값 초기화

//		System.out.println(Integer.MIN_VALUE);

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

//		// 주어진 배열과 최대값 비교
//		int arr[]=new int[] {1,5,3,8,2};
//		
////		if(arr[0] > max) {
////			max=arr[0];
////		}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] > max) {
//				max=arr[i];
//			}
//			
//		}
//		
//		System.out.println(max);

		// 주어진 배열과 최소값 비교
		int arr[] = new int[] { 1, 5, 3, 8, 2 };
//		if (arr[0] < min) {
//			min = arr[0];
//		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println(min);
	}
}