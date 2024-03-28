package generic2;

public class HomeAgency implements Rentable<Home>{

	@Override
	public void rent1() {
		System.out.println("집 빌려줌");
		//return new Home();
		
	}

	@Override
	public Home rent2() {
		
		return new Home();
	}

}
