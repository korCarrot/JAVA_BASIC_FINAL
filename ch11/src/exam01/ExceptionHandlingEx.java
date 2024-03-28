package exam01;

public class ExceptionHandlingEx {

	public static void main(String[] args) {

		String str1 = null;

		// System.out.println(str1.length());

		// 예외 처리

		// 예외가 날경우도 있고 안 날경우에 대하여 생각해보자!!!
		// 예외가 날지 안날지 모르므로 예외가 나는지 한번 시도해보자,,, try

		// 예외가 날 경우 잡아라 catch

		// 예외가 날 클래스 타입의 객체 를 괄호안에 넣어줌

		try { // 한 번 시도해봄  //예외가 날 수 도 있는 코드

			//str1 = "hi";
			System.out.println(str1.length());
		} catch (Exception e) {  //예외를 처리하는 영역
			System.out.println("예외 발생");
			System.out.println("null이 안되도록 하세요");
			 System.out.println(e);
			 System.out.println("=============");
			 System.out.println(e.getMessage());
			 e.printStackTrace();

		}finally {  // 무조건 하는 코드
			System.out.println("무조건 해라");
		}

	}

}
