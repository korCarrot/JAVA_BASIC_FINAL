package control;

public class ContinueEx2 {

	public static void main(String[] args) {
		
		//continue  건너뛰다
		for(int i=1;i<=10;i++) {
					
			
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.printf("%d는 짝수다\n", i);
		}

	}

}