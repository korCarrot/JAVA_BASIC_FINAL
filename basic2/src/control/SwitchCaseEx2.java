package control;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		
		int menu=33;
		
		switch(menu) {
			case 1 ->{
				System.out.println("짜장");
			}			
			case 2 ->{
				System.out.println("짬뽕");
			}
			case 3 ->{
				System.out.println("볶음밥");
			}
			
			case 4 ->{
				System.out.println("탕수육");
			}				
			
			default ->{
				System.out.println("1,2,3,4번 중에서만 고르세요");
			}
				
		}
	}

}
