package classBasic2;

public class StudentEx {

	public static void main(String[] args) {
	
//		System.out.println(new Student());
//		
//		
//		Student stu3=new Student("홍삼동");
//		
//		System.out.println(stu3.name);
		
		
		
		Student stu4=new Student(5);
		
		System.out.println(stu4);
		
		System.out.println(stu4.name);
		
		System.out.println(stu4.ban);
		
		
		Student stu5 = new Student("홍사동",1);		
		System.out.printf("이름:%s  반:%d ", stu5.name, stu5.ban);
		
		System.out.println();
		
		Student stu6 = new Student(3,"홍오동");		
		System.out.printf("이름:%s  반:%d ", stu6.name, stu6.ban);
		
		System.out.println();
		
		Student stu7 = new Student("홍육동","기타");		
		System.out.printf("이름:%s  취미:%s ", stu7.name, stu7.hobby);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
