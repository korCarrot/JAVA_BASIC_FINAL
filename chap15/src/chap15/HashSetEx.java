package chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		
		//집합(set) 순서 X, 중복 X
		Set<String> hashSets = new HashSet<String>();
		
		
		hashSets.add("hi");
		hashSets.add("hi");
		hashSets.add("hi2");
		hashSets.add("hi3");
		
//		hashSets.clear();
		
		//hashSets.remove("hi2");
		
		hashSets.add("hi4");
		System.out.println(hashSets.size());
		
		
		//가져오는 방법1
		for(String hashSet  : hashSets) {
			System.out.println(hashSet);
		}
		
		System.out.println("---------------");
		
		//가져오는 방법2 (Iterator로  만들어서 가져오기)
		
		Iterator<String> iterator=hashSets.iterator();
		
		System.out.println(iterator);
		
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
	}

}
