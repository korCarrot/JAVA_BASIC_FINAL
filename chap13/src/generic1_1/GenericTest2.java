package generic1_1;

public class GenericTest2 {

	public static void main(String[] args) {
		Product<Tv,String>	product1 =new Product<Tv,String>();
		
		System.out.println(product1);
		System.out.println(product1.toString());
		
		product1.setProduct(new Tv());
		product1.setModel("스마트 TV");
//		
//		
		Tv tv=product1.getProduct();
		String tvModel=product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvModel);
		
		System.out.println("=============");
		
		Product<Car,Integer> product2 =new Product<>();
		System.out.println(product2);
		System.out.println(product2.toString());
		//product2.setProduct(new Tv());
		product2.setProduct(new Car());
		product2.setModel(111);
		
		Car car=product2.getProduct();
		int model=product2.getModel();
		
		System.out.println(car);
		System.out.println(model);
		
	}

}
