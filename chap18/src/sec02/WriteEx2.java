package sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx2 {

	
	
	public static void main(String[] args) {
		
		try {
			//OutputStream은 내부에 작은 buffer를 가지고 있다.
			//write() 메서드가 호출되면 버퍼(데이터를 일시적으로 저장하고 필요한 경우에 한 번에 처리할 수 있도록 도와줍니다)에 
			//바이트를 우선 저장하고, 버퍼가 차면 순서대로 바이트를 출력
			//flush()메서드는 내부 버퍼에 잔류하는 모든 바이트를 출력하고 버퍼를 비우는 역할
			//내부 버퍼를 사용하는 이유는 출력 성능을 향상하기 위해
			//출력 스트림을 더 이상 사용하지 않을 경우 close() 호출해서 출력 스트림이 사용했던 메모리를 해제하는 것이 좋다.
			OutputStream  fos2 = new FileOutputStream("C:/ex/data/test7.txt");

//			byte a = 69;
//			byte b = 70;
			
			//
			
			byte arrByte [] = {71,72,73,74 };
			
//				fos2.write(a);
//				fos2.write(b);
				fos2.write(arrByte);
				fos2.close(); // 입출력 시스템은 하드웨어 자원(resource)이므로 공유함, 그러므로 다른 프로세스가 사용하도록 반납한다는 개념이 있음, 그러므로 사용했으면 반드시 닫아줘야 함
			


		} catch (Exception e) {
			System.out.println("파일 관련(폴더나 파일명, 입출력 관련) 에러");
		}

	}

}
