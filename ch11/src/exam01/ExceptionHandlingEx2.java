package exam01;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {

		String str1 = null;

		int arr[] = new int[3];
		arr[0] = 3;
		arr[1] = 7;
		arr[2] = 9;

		// System.out.println(str1.length());

		try {

			//System.out.println(str1.length());
			System.out.println(arr[3]);

		} catch (NullPointerException e) {
			System.out.println("널임");
		} catch (ArrayIndexOutOfBoundsException e) { // 예외를 처리하는 영역

			System.out.println("배열 길이 벗어남");

		}

		System.out.println("####");
	}

}
