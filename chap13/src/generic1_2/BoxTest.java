package generic1_2;

public class BoxTest {

	public static void main(String[] args) {
		Box box=new Box();		
		box.content="hihi";
		box.content=5;
		
		Box<String, Integer> box2	=new Box<String, Integer>();
		box2.content="hih";
		//box2.content=243;
		box2.amount=24;
		//box2.amount="jkdk";
	}

}
