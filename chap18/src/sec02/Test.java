package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		
		//System.out.println("hi");
		
		try {
			OutputStream os= new FileOutputStream("C:/ex/data/test10.txt");
			
//			os.write(65);
//			os.write(66);
			
//			byte arr[]= new byte[0];
//			arr[0]= 72;
//			arr[1]= 73;
//			arr[2]= 74;
					
//			byte arr[]= {67,68,69,70,71};
			byte arr[]= {65,66,67};
			//byte arr[]= {};
//			os.flush();
			os.write(arr);
//			os.write(arr, 0, 5);
			
			os.flush();
			
			InputStream is = 	new FileInputStream("C:/ex/data/test10.txt");
			
			FileReader reader=new FileReader("C:/ex/data/test10.txt");
			
			
			
			
			
			while(true) {
				int result=is.read();
				
				if(result == -1) {
					break;
				}
				char ch=(char)is.read();    //1byte에만 데이터가 들어 있으므로 DF만 출력됨
				System.out.print(ch);
			}
			
			
//			while(is.read() != -1) {
//				char ch=(char)is.read();
//				System.out.print(ch);
//			} 
			
			//int result=is.read();  // read()메소드는  입력스트림(is)으로부터 1byte를 읽고 int(4byte) 타입으로 리턴, 리턴된 4byte 중 끝 1byte에만 데이터가 들어 있음
			
			//int result2=is.read(arr); // read(arr) 메서드는 주어진 배열의 길이만큼 바이트를 읽고 배열에 저장한 다음 읽은 바이트 수를 리턴
			
			// 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read() 메서드는 -1을 리턴 
			
			//System.out.println(result);
			
			is.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}

}
