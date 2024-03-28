package basic3;

public class SubjectAverages {

	public static void main(String[] args) {
		 //       학생1    학생2   학생3
		//과목 1    90     80      70
		//과목 2    90             40
		//과목 3    90     60      50
		
 		
		//과목별  (행을 과목으로 열을 학생이름)
		int arr2d[][] = { { 90, 80},
				          { 90, 40, 70, 70 },
				          { 90, 60, 50 } };

		
		System.out.println(getMaxSubjectCount(arr2d));
		
		// 각 과목의 성적을 저장할 배열
		double subjectAverages[] = new double[getMaxSubjectCount(arr2d)];
		
		System.out.println((double) arr2d[0].length);
		System.out.println((double) arr2d[1].length);
		System.out.println((double) arr2d[2].length);

		// 각 과목별 성적 합산 및 행의 길이로 나누어 평균 계산
		for (int i = 0; i < arr2d.length; i++) {
			int tot=0;
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.printf("총합 : %d" ,  tot += arr2d[i][j] );
//				subjectAverages[j] += arr2d[i][j] / (double) arr2d[i].length;
			}
			System.out.printf("총합 : %d \n" ,  tot);
			
			double avg =   tot  /  (double) arr2d[i].length;
			System.out.printf("평균 %.2f:  \n" ,  avg);
		}

		// 결과 출력
//		for (int i = 0; i < subjectAverages.length; i++) {
//			System.out.printf("과목 %d : 평균 %.2f:  \n" , (i + 1), subjectAverages[i]);
//		}
	}

	// 배열에서 가장 큰 행의 길이를 반환하는 메서드
	private static int getMaxSubjectCount(int[][] arr) {
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > maxCount) {
				maxCount = arr[i].length;
			}
		}
		return maxCount;
	}

}
