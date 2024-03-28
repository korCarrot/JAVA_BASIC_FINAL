package generic1;

public class ProductTest {

	public static void main(String[] args) {
		
		Product product=new Product();		
		product.kind= new Car();
		product.kind= new Tv();
		
		product.model="소나타";
		product.model=110;
		
		
		
		Product<Tv, Integer> product2=new Product<Tv, Integer>();	
		
		//product2.kind=new Car();
		product2.kind=new Tv();
		//product2.model="그랜저";
		product2.model=555;

	}

}
