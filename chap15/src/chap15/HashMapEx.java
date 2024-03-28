package chap15;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		
//		HashMap<String, String> hashMaps = 	new HashMap<String, String>();
		
		HashMap<Integer, String> hashMaps = 	new HashMap<Integer, String>();
		
//		HashMap hashMaps = 	new HashMap();
		
		hashMaps.put(5, "apple");
		hashMaps.put(33, "banana");		
		hashMaps.put(666, "star");
		
		
//		for(String key : hashMaps) {
//			
//		}
		
					
		System.out.println( hashMaps.get("a")) ;
		System.out.println( hashMaps.get("b")) ;
		System.out.println( hashMaps.get("c")) ;
		System.out.println( hashMaps.get("s")) ;
		System.out.println( hashMaps.get(666)) ;
		
		System.out.println("----------------------");
		
		
		//전체를 다 가져오고자 할 경우, 키가 중요하므로 키만 뽑을 수 있는지 
		Set<Integer> keySets=hashMaps.keySet();
		
		for(int key : keySets) {
			//System.out.println(key);
			System.out.println(key + " : " + hashMaps.get(key));
		}
		
		
		
		
		
		

	}

}
