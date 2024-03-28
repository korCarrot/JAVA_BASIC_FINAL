package classBasic2;

public class KoreanEx {

	public static void main(String[] args) {

//		Korean kor1 = new Korean();
//		kor1.nation = "대한민국";
//		System.out.println(kor1.nation);
//		
//		Korean kor2 = new Korean("대한민국");
//		System.out.println(kor2.nation);
		
		
		Korean kor1 = new Korean();		
		System.out.println(kor1.nation);
		
		Korean kor2 = new Korean("홍사동");		
		System.out.println(kor2.nation+" " + kor2.name);
		
		Korean kor3 = new Korean("홍오동");		
		System.out.println(kor3.nation+ " " + kor3.name);
		
		
		Korean kor4=new Korean("홍육동", "000101-1234567");
		System.out.println(kor4.nation+ " " + kor4.name + kor4.ssn);
		
	}

}
