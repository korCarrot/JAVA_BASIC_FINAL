package basic3;

public class ArrayEx5 {

	public static void main(String[] args) {

		// 1반의 학생 3명 국 영 수
		// 학생1 90 90 90 평균 90
		// 학생2 80 80 80 평균 80
		// 학생3 70 70 70 평균 70
		// 과목별 평균 80 80 80

		// 3명으로 늘어날 경우...

		// 반 평균 80.00나오도록 하려면

		int stu1[] = new int[] { 90, 90, 90 };
		int stu2[] = new int[] { 80, 80, 80 };
		int stu3[] = new int[] { 70, 70, 70 };

		int total1 = 0;
		for (int i = 0; i < stu1.length; i++) {
			total1 = total1 + stu1[i];
		}

		double avg1 = (double) total1 / stu1.length;
		System.out.printf("총점 : %d    평균 : %.2f \n", total1, avg1);

		System.out.println("================================");

		int total2 = 0;
		for (int i = 0; i < stu2.length; i++) {
			total2 = total2 + stu2[i];
		}

		double avg2 = (double) total2 / stu2.length;
		System.out.printf("총점 : %d    평균 : %.2f \n", total2, avg2);

		System.out.println("================================");
		
		int total3 = 0;
		for (int i = 0; i < stu3.length; i++) {
			total3 = total3 + stu3[i];
		}

		double avg3 = (double) total3 / stu3.length;
		System.out.printf("총점 : %d    평균 : %.2f \n", total3, avg3);

		System.out.println("================================");

	}

}
