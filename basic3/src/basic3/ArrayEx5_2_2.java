package basic3;

public class ArrayEx5_2_2 {

	public static void main(String[] args) {
//		int arr2d[][] = { { 90, 90, 90 },
//				          { 80, 60 },
//				          { 70, 40, 50 } };

		int arr2d[][] = { { 90, 80, 70 },
							{ 90, 40 },
							{ 90, 60, 50 } };
		
		// 2차원 배열의 길이(행의 길이)
		System.out.println(arr2d.length);
		
		// 2차원 배열의 길이(열의 길이)
		
		for(int i=0;i<arr2d.length;i++) {
			System.out.println("각 행의 길이" + arr2d[i].length);			
		}
		
		
		// 각 과목의 성적을 저장할 배열
		
		 int subjectScores[]= new int[arr2d[0].length];	
		

//
//        // 각 학생의 성적을 반복하면서 과목별 성적 합산
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                subjectScores[j] += arr2d[i][j];
//                System.out.println("열의 길이 :"  + arr2d.length);
            }
        }

        // 결과 출력
        
        double subAvg=0.0;
        for (int i = 0; i < subjectScores.length; i++) {
            System.out.print("과목 " + (i + 1) + " 총합: " + subjectScores[i] + " ");                   
            System.out.println("과목 " + (i + 1) + " 평균: " + (double)subjectScores[i] /  arr2d[i].length);
        }
        
        
//        System.out.println( (double )subjectScores[0] /3);    
//        System.out.println( (double )subjectScores[1] /3);
//        System.out.println( (double )subjectScores[2] /2);
        
        

	}

}
