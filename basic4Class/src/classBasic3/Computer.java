package classBasic3;

public class Computer {

	
	// 클래스와 클래스 간에는 관계(사용, 부모-자식, 포함(부품)를 맺어야 서로 사용가능
	
	public static void main(String[] args) {
		
		
		//누적합
		
//		int total=0;
//		
//		for(int i=0;i<=5;i++) {   // 경우에 따라  X, 5(하나), 3,1(둘), 7,1,4(세개)
//			total+=i;
//		}
//
//		System.out.println(total);
				
		Accumulate accumulate=new Accumulate();		
		int result=accumulate.accu();
		System.out.println(result);
		
		accumulate.accu2(5);
		
		
		accumulate.accu3(3,1);
		
		System.out.println("=============");
		
//		int arr[]=new int[2];
//		arr[0]=3;
//		arr[1]=1;
		
//		int arr[]=new int[] {3,5};
		
//		int arr[]= {3,6};
		
		accumulate.accu4(new int[]{3,7, 4, 5});
		
//		accumulate.accu4({3,8});
		
		System.out.println("------------");
		accumulate.accu5(new int[]{3,4,5,6,6});
		accumulate.accu5(new int[]{});
		
		
		
		System.out.println("##########");
		//0부터 해당 숫자까지 누적	
		
		accumulate.accu6(5);
		accumulate.accu6(10);
		
		
		
	}

}
