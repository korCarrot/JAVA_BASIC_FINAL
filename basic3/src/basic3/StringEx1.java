package basic3;

public class StringEx1 {

	public static void main(String[] args) {
		//문자 추출
		String ssn="9506244230123";
		
//		System.out.println(ssn.length());
				
		//camelCase
//		int ssnLength=ssn.length();		
//		System.out.println(ssnLength);
//		
//		
//		System.out.println(ssn.charAt(0));
//		System.out.println(ssn.charAt(6));
		
		char sung = ssn.charAt(6);
		System.out.println(sung);
		System.out.println(sung + 1);
		
		//1이나 3이면 남성
		
		System.out.println(sung == '1');
		
		System.out.println((sung == '1' || sung == '3'));
 		//2이나 4이면 여성
		
		
		if((sung == '1' || sung == '3')) {
			System.out.println("남");
		}else {
			System.out.println("여");
		}
		
		
		
		
		
		
		
	}

}
