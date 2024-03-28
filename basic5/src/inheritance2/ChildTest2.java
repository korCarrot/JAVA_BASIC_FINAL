package inheritance2;

public class ChildTest2 {

	public static void main(String[] args) {
		
		
		
		// 첫번째 경우 
		Parent parent=new Parent();		
		System.out.println(parent);  //6f2b958e		

		//Child child=(Child)parent;		
		
		Child child=null;		
		System.out.println(child);		
		System.out.println("==================");
//		child=(Child)parent;		
//		System.out.println(child);
		
		// 두번째 경우
		
		Child child2=new Child();
		System.out.println(child2);		
		Parent parent2= null;			
		parent2=child2;
		System.out.println(parent2); //1c4af82c
		
		System.out.println("######################");
		
		//parent2.method3();
		
		//강제 형변환
		//자식 타입 변수 = (자식 타입)부모 타입 객체;
		
		//Child child3=(Child)parent2;
		
		
		// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능
		// 만약 자식 타입에 선언된 필드와 메서드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환해야 한다.
		Child child3=(Child)parent2;
		System.out.println(child3);
		child3.method3();
		
		
		
		
	}

}
