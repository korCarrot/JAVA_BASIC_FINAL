package jungsuk.ch03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'a';
		
//		System.out.println((char)(ch + 32));
//
//		
//		
//		
//		System.out.println(ch >= 'A' && ch <= 'Z');
		
		
		System.out.println( (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32): ch);
	}

}
