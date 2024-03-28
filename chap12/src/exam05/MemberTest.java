package exam05;

public class MemberTest {

	public static void main(String[] args) {
		
		
		Member m =new Member("333");
		//Member m1=	new Member("111", "홍일동", 22);
//		
		
		//new Member();
		//Member m1 =new Member("222");
		
		
		//System.out.println(m1.getId());
//		System.out.println(m1.getName());
//		System.out.println(m1.getAge());
//		
		
	
//		System.out.println(m1);
		System.out.println(m.toString());
		//System.out.println(m1.toString());
		
		m.setId("444");
		System.out.println( m.getId());
		
		
		try {
			m.setId(null);	
		}catch(Exception e) {
			System.out.println("@NonNull임");
		}
		
		
	}

}
