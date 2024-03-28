package control;

public class SwitchCaseEx {

	public static void main(String[] args) {

//		int menu=1;
//		double menu=1.0;

//		char menu='A';
		String grade = "B";
		int score1 = 0;

		switch (grade) {
//			case "A":
//				score1=100;
//				break;
//			case "B":
//				int result=100-20;
//				score1=result;
//				break;
//			default:
//				score1=60;

		case "A" -> {
			score1 = 100;
		}

		case "B" -> {
			int result = 100 - 20;
			score1 = result;
		}

		default -> {
			score1 = 60;
		}

		}

		System.out.println(score1);

	}

}
