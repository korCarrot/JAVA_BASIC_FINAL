package basic3;

public class ArrayEx5_2 {

	public static void main(String[] args) {

		// 1반의 학생 3명 국 영 수
		// 학생1 90 90 90 평균 90
		// 학생2 80 80 80 평균 80
		// 학생3 70 70 70 평균 70
		// 과목별 평균 80 80 80

		// 3명으로 늘어날 경우...

		// 반 평균 80.00나오도록 하려면

//		int arr2d[][] = new int[][] { { 90, 90, 90 }, { 80, 80 }, { 70, 70, 70 } };
		// 학생별 평균 (학생별 총합, 학생별 과목의 수)

//		for (int i = 0; i < arr2d.length; i++) {
//
//			int stuTotal = 0;
//
//			for (int j = 0; j < arr2d[i].length; j++) {
////				System.out.printf("%d %d   ", i, j);
////				System.out.printf("%d ", arr2d[i][j]);
//				stuTotal = stuTotal + arr2d[i][j];
//			}
//
//			double stuAvg = (double) stuTotal / arr2d[i].length;
////			System.out.println("학생별 총합 : " + stuTotal);
////			System.out.printf("학생별 총합 : %d, 학생별 평균 : %.2f\n", stuTotal, stuAvg);
//		}

		// 과목별 평균 (과목별 총합, 학생의 수)
		int subTotal = 0;
		int arr2d[][] = new int[][] { { 90, 90, 90 },
			                          { 80, 60 }, 
			                          { 70, 40, 50 } };

		System.out.print("첫 번째 과목 :  ");
		int sub1Total=0;
		for (int i = 0; i < arr2d.length; i++) {
			System.out.print(arr2d[i][0] + " ");
			sub1Total =sub1Total + arr2d[i][0];
		}
		double sub1Avg =  (double)sub1Total / arr2d[0].length;
		System.out.printf("총점 : %d   평균:  %.2f \n" , sub1Total, sub1Avg);
		
		
		// 전체 평균  (전체의 갯수  : 행 X 열 )
		int total=0;
		int cnt=0;
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				total += arr2d[i][j];
				cnt++;
			}
		}
		System.out.println("갯수:" + cnt);
//		double totalAvg= (double )total /  (arr2d.length * arr2d[0].length) ;
		double totalAvg= (double )total /  cnt ;
		System.out.printf("총점 :%d  평균 :%.2f" , total, totalAvg);
		
		

	}

}
