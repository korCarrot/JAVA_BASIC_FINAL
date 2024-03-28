import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
	
		//입력을 하기 위해서 Scanner라는 클래스(틀)를 이용해야 한다.				
		
		//틀(클레스)에서 객체(object)를 만드는 행위를 한 후에 거기서 만들어진 그 객체를 가지고 입력을 해야한다.				
		//어떤 새로운(new) 공간에 만들고 나면 결국 변수에 주소값을 저장하는 행위( = ) 를 해야 함		
		//만들 때 어떤 인수를 넣어주고 만들어야할 때도 있다.(컴퓨터(시스템)의 입력장치  System.in이라는 스트림) 
		
		Scanner scanner=new Scanner(System.in);
		
//		String value=scanner.next();  //한 단어 입력시 
//		System.out.println("==================");
//		System.out.println(value);		
		
//		String value2=scanner.nextLine();  // 한 줄 입력시
//		System.out.println("==================");
//		System.out.println(value2);		
		
//		int value3=scanner.nextInt();  // 숫자 입력시
//		System.out.println("==================");
//		System.out.println(value3 + 1);
		
		
		String str=scanner.next();  //한 단어 입력시 
		int num=Integer.parseInt(str);
		System.out.println("==================");
		System.out.println(num + 1);
		
	}

}
