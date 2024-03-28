package methodEx;

public class Test4 {

	public static void main(String[] args) {


		// 별찍기 4 응용
		for (int i = 1; i < 8; i++) {

			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}

			
			System.out.println();

		}
		
		

	}

}
