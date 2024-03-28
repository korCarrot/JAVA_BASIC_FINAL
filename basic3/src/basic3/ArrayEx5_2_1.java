package basic3;

public class ArrayEx5_2_1 {

	public static void main(String[] args) {
		// 과목별 평균 (과목별 총합, 학생의 수)
		int subTotal = 0;
		int arr2d[][] = new int[][] { { 90, 90, 90 }, { 80, 60,50 }, { 70, 40, 50 } };

//				System.out.print("첫 번째 과목 :  ");
//				int sub1Total=0;				

//		int cnt=0;
		for (int k = 0; k < arr2d.length; k++) {
			int sub1Total = 0;
			int cnt=0;
			for (int i = 0; i < arr2d[k].length; i++) {

				
				
				sub1Total = sub1Total + arr2d[i][k];
					cnt++;
					
					
			}
			double subAvg=  (double) sub1Total / cnt ;
			System.out.println();
			System.out.printf("과목별 누적합 %d   평균 : %.2f " ,  sub1Total, subAvg);
		}

//				for (int i = 0; i < arr2d.length; i++) {
//					System.out.print(arr2d[i][0] + " ");
////					sub1Total =sub1Total + arr2d[i][0];
//				}

//				for (int i = 0; i < arr2d.length; i++) {
//					System.out.print(arr2d[i][0] + " ");
//					sub1Total =sub1Total + arr2d[i][0];
//				}

//				double sub1Avg =  (double)sub1Total / arr2d[0].length;
//				System.out.printf("총점 : %d   평균:  %.2f \n" , sub1Total, sub1Avg);
//				

	}

}
