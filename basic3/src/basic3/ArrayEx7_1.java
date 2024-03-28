package basic3;

public class ArrayEx7_1 {

	public static void main(String[] args) {

		// 2차원 배열 ( 3 X 3 ) 성적
		// 학생 3명 3과목

//		int arr[]=new int[]{70,80,90};
//		arr[0]=70;

		// 참조(배열, 열거, 클래스, 인터페이스)

		int arr2d[][] = new int[][] { { 70, 80 }, { 70, 80, 90 }, { 70, 80, 90, 100} };

//		arr2d[0][0]=70;

//				{{70,80,90}, 
//				{70,80,90}, 
//				{70,80,90}};

		for (int i = 0; i < arr2d.length; i++) {

			for (int j = 0; j < arr2d[i].length; j++) {
//				System.out.printf("%d%d ", i, j);
				System.out.printf("%d ", arr2d[i][j]);
			}
			System.out.println();
		}

	}

}
