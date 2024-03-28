package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx {

	public static void main(String[] args) {

		// new OutputStream(); 추상 클래스라 객체 만들 수 없음, 자식으로 만들어야 함
		// OutputStream 추상 클래스의 자식
		// FileOutputStream
		FileOutputStream fos2;
		try {

//			fos = new FileOutputStream("C:/ex/data/test4.txt");
			
			fos2 = new FileOutputStream("C:/ex/data/test5.db");

			byte a = 67;
			byte b = 68;
			
			try {
				fos2.write(a);
				fos2.write(b);
				fos2.close();
			} catch (IOException e) {
				System.out.println("입출력시 예외 발생");

			}

//			new FileOutputStream("C:\\ex\\data\\test3.txt");
//			new FileOutputStream("C:\ex\data\test3.txt");
		} catch (FileNotFoundException e) {
			System.out.println("폴더나 파일이 없네요");
		}

	}

}
