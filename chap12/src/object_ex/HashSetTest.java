package object_ex;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//자료를 저장하기 위해서 여러분이 자료 구조를 선정해야 함
		//대부분 배열(사이즈 정해짐)과 리스트(사이즈가 정해지지 않음) 사용
		//중복 되지 않게 저장하고자 할 경우에는 HashSet 사용,그러므로 HashSet 객체를 먼저 만들어야 함
		
		
		HashSet hashSet=new HashSet();
		
		//hashSet 자료 구조에 저장할 자료를 먼저 만듦
		
		Student stu1=new Student(1,"홍일동");
		Student stu2=new Student(1,"홍일동");
//		Student stu2=new Student(2,"홍이동");
		
		//HashSet을 이용할 경우 동등 객체는 중복 저장하지 않음
		hashSet.add(stu1);
		hashSet.add(stu2);
		System.out.println(hashSet.size());
	}

}
