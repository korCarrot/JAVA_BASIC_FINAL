package generic1;

public class GenericTest {

	public static void main(String[] args) {
		
		//결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
		//Box<String>를 데이터 타입으로 보는 것이 편함
		
		Box<String> box=new Box<>();

		box.content="hi";
		
		Box<Integer> box2=new Box<Integer>();
		box2.content=1;
	}

}
