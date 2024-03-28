package operateEx;

public class OverFlowUnderFlowEx {

	public static void main(String[] args) {
		
		byte var1=127;
		
//		int var2=var1+1;
		
		//오버플로우(overflow)
		var1++;
		
		System.out.println(var1);
		
		
		byte var2=-128;
		
		//언더플로우(underflow)
		var2--;
		
		System.out.println(var2);
		

	}

}
