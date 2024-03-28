package methodEx;

public class Test {

	public static void main(String[] args) {

		// 별찍기 1
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------------------");

		// 별찍기 2
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------------------");

		// 별찍기 3
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		System.out.println("=====================");
		

	}

}
