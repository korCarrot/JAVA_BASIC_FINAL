package methodEx;

public class Test3 {

	public static void main(String[] args) {

		// for안에 for, for
		// 별찍기 4
		String str=""; 
		for (int i = 1; i < 8; i++) {
			
			for (int j = 7; j>=i; j--) {
//				System.out.print("@");
				str+=" ";
			}
		
			for (int j = 0; j < 2*i-1; j++) {
//				System.out.print("*");
				str+="*";
			}				
			
//			for (int j = 3; j >=i; j--) {
//				System.out.print("#");
//			}
			str += "\n";

		}
		
		System.out.println(str);
		
	}
	
	

}
