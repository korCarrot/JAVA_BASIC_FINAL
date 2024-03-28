package sec02_1;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx1 {

	public static void main(String[] args) {

		try (Reader os = new FileReader("c:/Temp/test7.txt");) {

//			int data = os.read();
//			System.out.println(data);

			while (true) {

				int data = os.read();
				if (data == -1) {
					break;
				}
				
				System.out.print((char)data);

			}

		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}
