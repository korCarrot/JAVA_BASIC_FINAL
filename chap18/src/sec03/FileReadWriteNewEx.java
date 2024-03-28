package sec03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteNewEx {

	public static void main(String[] args) {
		
		//파일과 경로 관련 처리는 nio의  Paths와 Files를 주로 이용
		
		
		// 파일 만들고 데이터 집어 넣기
//		String data= "hi\n안녕하세요";
//		
//		Path path=Paths.get("C:/TEMP/work/hi1.txt");
		Path path2=Paths.get("C:/ex/data/panda.jpg");
		
		//System.out.println(path);
		
		//CharSequence는 읽을 수 있는 char 값의 시퀀스입니다.
		
	
		try {
//			Files.writeString(path, data, Charset.forName("UTF-8"));	//파일에 CharSequence를 씁니다. 문자는 UTF-8 문자 세트를 사용하여 바이트로 인코딩됩니다.
			
	
		//파일 정보 얻기
//			String fileInfo=Files.probeContentType(path);
			String fileInfo=Files.probeContentType(path2);
			System.out.println(fileInfo);
			
		//파일 읽기 	
			
//			String content=Files.readString(path,  Charset.forName("UTF-8"));
//			System.out.println(content);
			
			
			FileOutputStream out= new FileOutputStream("C:/TEMP/work2/copypanda.jpg"); 
			Files.copy(path2, out);
		} catch (IOException e) {
			System.out.println("파일을 만드는 도중 오류");
		} 
		
	}

}
