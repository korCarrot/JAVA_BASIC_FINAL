package control2;

public class NestedFor {

	public static void main(String[] args) {
		
		
		for(int i=2;i<=9;i++) {   //행
			
			for(int j=1;j<=9;j++) {   //열
				System.out.print(i+"X" +j + "=" + i*j + "     ");
			}
			System.out.println();
		}

	}

}
