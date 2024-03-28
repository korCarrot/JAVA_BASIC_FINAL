import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) {
		
		// try with resource문
		try(InputStream is = 	new FileInputStream("c:/Temp/test3.db");) {
//			InputStream is = 	new FileInputStream("c:/Temp/test3.db");
			
			//여러개이므로 반복문으로
			
			while(true) {
				
				int data=is.read();
				if(data == -1) {
					break;
				}
				System.out.print(data);
			}
			
			//is.close();
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}
	}

}