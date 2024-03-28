package sec03;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) {
		
		
		// 디렉토리 만들경우 
		//File dir=new File("e:/test4/twodir/file1");
		File dir=new File("e:/test5");
		
		System.out.println(dir);
		
		//System.out.println(dir.mkdir());
		// 하위 경로까지 하고자 할 경우에는 mkdirs()
		System.out.println(dir.mkdirs());
		
		// 파일 만들 경우
		File file=new File("e:/test5/testfile.txt");
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
