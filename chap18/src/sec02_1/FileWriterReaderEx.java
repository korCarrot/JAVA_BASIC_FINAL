package sec02_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriterReaderEx {

	public static void main(String[] args) {

		try (   Writer writer = new FileWriter("c:/Temp/test12.txt");
				Reader reader = new FileReader("c:/Temp/test12.txt");) {

			
			
			char data[]=new char[5];  // 읽은 문자를 저장할 배열 공간 만들기
			
			writer.write("가나다\n라마바");
			writer.flush(); // 쓴 객체를 비워주면서 내보내기..., 코드가 빠질 경우 버퍼에 있는 것이 나가지 않으므로 -1 나옴
			
			while (true) {

				int num = reader.read(data);
				//System.out.println(num);
				for(int i=0;i<num;i++) {
					System.out.print(data[i]);
				}
				
				if (num == -1) {
					break;
				}
				
				

//				System.out.print((char) data);

			}

		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}
