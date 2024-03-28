package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) {

		try (OutputStream fos = new FileOutputStream("C:/TEMP/object.dat");

				ObjectOutputStream oos = new ObjectOutputStream(fos);

				InputStream fis = new FileInputStream("C:/TEMP/object.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			// 객체 생성
			Member m1 = new Member("hong", "홍길동", 30);

			// 객체를 역직렬화해서 파일에 저장
			oos.writeObject(m1);
			
			Member m2=(Member) ois.readObject();
			System.out.println(m2.getId()+m2.getName()+m2.getAge());

		} catch (Exception e) {
			//System.out.println("파일 관련 예외");
			e.printStackTrace();
		}

	}
}
