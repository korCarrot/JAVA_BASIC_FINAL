package basic3;

public class ArrayEx7 {

	public static void main(String[] args) {

		// 1반의 학생 3명 국 영 수
		// 학생1 90 90 90 평균 90
		// 학생2 80 80 80 평균 80
		// 학생3 70 70 70 평균 70
		// 과목별 평균 80 80 80

		// 3명으로 늘어날 경우...

		// 반 평균 80.00나오도록 하려면

		// 1차원 배열
//		int stu1[] = new int[] { 90, 90, 90 };
//		int stu2[] = new int[] { 80, 80, 80 };
//		int stu3[] = new int[] { 70, 70, 70 };

		// 2차원 배열 선언과 값의 할당 동시
		int arr2D[][] = new int[][] { 
									  { 90, 90, 90 }, 
									  { 80, 80, 80, 80 }, 
									  { 70 } 
									};

		System.out.println("행의 길이 :" + arr2D.length);
		System.out.println(arr2D[0]);
		System.out.println(arr2D[0].length);
		System.out.println("1행의 길이(1행의 열의 길이):" + arr2D[0].length);
		System.out.println("2행의 길이(2행의 열의 길이):" + arr2D[1].length);
		System.out.println("3행의 길이(3행의 열의 길이):" + arr2D[2].length);

//		arr2D[0][0]=90;
//		arr2D[0][1]=90;
//		arr2D[0][2]=90;
////		
//		arr2D[1][0]=80;
//		arr2D[1][1]=80;
//		//arr2D[1][2]=80;
//		
//		arr2D[2][0]=70;
//		arr2D[2][1]=70;
//		arr2D[2][2]=70;

		// 틀

		for (int i = 0; i < arr2D.length; i++) { // 행

			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.printf("%d  ", arr2D[i][j]);
			}
			System.out.println();
		}

	}

}
