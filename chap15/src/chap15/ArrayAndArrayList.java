package chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		// 배열
		
		// 4개 저장 동일한 데이터 타입 로 23, 10, 48, 15 배열로 저장 후 출력해 보세요...
		
		
//		int arr[]=new int[4];
//		
//		//System.out.println(arr[0]);
//		
//		arr[0]=23;
//		arr[1]=10;
//		arr[2]=48;
//		arr[3]=15;
		
		
		//int arr[]=new int[] {23,10,48,15};
		//int arr[]={23, 10, 48}; // 48을 추가하고자 한다. "hi"
		int arr[]=new int[3];
		//추가 23과 10사이에 5를 추가하고자 하 경우  
		arr[0]=23;
		arr[1]=5;
		arr[2]=48;
		
		System.out.println(Arrays.toString(arr));
		//arr[3]=48;
		//System.out.println(arr[0]);
		
//		arr[0]=23;
//		arr[1]=10;
//		arr[2]=48;
//		arr[3]=15;
		System.out.println(arr.toString());
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==========");
		
		// 배열(단점은 추가, 삭제시 시간이 더 걸림)을 극복하기 위한 자료 구조로 리스트(List) - ArrayList를 사용해보자.....
		//List<Integer> list=new ArrayList<Integer>();
		List list=new ArrayList();
		//System.out.println(list);
		//System.out.println(list.toString());
		boolean result=list.add(23);
		//System.out.println(result);		
		list.add(10);		
		list.add(48);
		
		list.add(1, 5);
		System.out.println("제거전" + list);
		list.remove(2);
		System.out.println("-----제거 후 ------");
		System.out.println(list);
		//System.out.println(list.size());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println(list);
//		list.add(15);
//		System.out.println(list);		
//		list.add("hi");
//		System.out.println(list);
		
		
		
	}

}
