package object_ex;

public class StudentEx {

	public static void main(String[] args) {
		
	Student stu1=new Student(1,"홍길동");
	
	Student stu2=new Student(1,"홍길동");
	
	
	
	System.out.println(stu1.hashCode());
	System.out.println(stu2.hashCode());
	
	System.out.println(stu1.equals(stu2));
	
	if( stu1.hashCode() == stu2.hashCode()) {
		if(stu1.equals(stu2)) {
			System.out.println("동등 객체");
		}else {
			System.out.println("데이터가 다름");
		}
		
	}
	
	
	
	
//	System.out.println(stu1.hashCode());
//	
//	//재정의 전 hashCode
//	System.out.println(stu1.hashCode());
////	System.out.println(stu1.getNo());
//
//	System.out.println("=============");
//	
//	
//	//
//	System.out.println(stu1.hashCode());
	}
}
