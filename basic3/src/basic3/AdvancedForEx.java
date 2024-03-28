package basic3;

public class AdvancedForEx {

	public static void main(String args[]) {
		
//		int arr[]=new int[] {1,2,3};
		int arrs[]={5,8,2};
		String strs[]={"서울","경기","인천"};
		
		
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		
		System.out.println("=================");
		
		
		//향상된 for문(배열에서 사용)
		
		for(int arr:arrs) {
			System.out.println(arr);
		}
		System.out.println("=================");
		
		for(String str:strs) {
			System.out.println(str);
		}
	}

}
