package basic3;

public class IndexOfContainsEx {

	public static void main(String args[]) {
	
//		String subject="자바 파이썬 프로그래밍 자라 파이썬";
		
		
		//문자를 찾을 수도 있고, 문자열을 찾을 수도 있다.
		//찾았을 경우 그 위치(index)가 나옴
		
		
//		int location=subject.indexOf('자');
//		System.out.println(location);

		
//		int location2=subject.indexOf("프로그래밍");
//		System.out.println(location2);
		
		
		//찾고자 문자, 문자열이 없는 경우 -1이 반환
//		int location3=subject.indexOf("가");
//		int location3=subject.indexOf("파이썬", 10);
//		System.out.println(location3);
		
//		int location=subject.indexOf("자바스크립트");
//		System.out.println(location);
//
//		int location2=subject.indexOf("자바 스크립트");
//		System.out.println(location);
		
//		System.out.println(location2 == -1);
//		//해당 문자나 문자열(자바스크립트)가 없으면 없다.라고 코딩
//		
//		if(location2 != -1) {
//			System.out.println(" 찾았다.");
//		}else {
//			System.out.println("못 찾았다.");
//		}
		
		
//		System.out.println("===========================");
//		
//		
//		
		String subject="자바\\파이썬\\프로그래밍\\자라\\파이썬";
		int num=subject.lastIndexOf("\\");
		System.out.println(num);
		
		System.out.println(subject.substring(num+1));
		System.out.println(subject.substring(0,num));
//		String[] strArr=subject.split(" ");
//		System.out.println(strArr);
//		
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i]);
//		}
		
		
	}

}
