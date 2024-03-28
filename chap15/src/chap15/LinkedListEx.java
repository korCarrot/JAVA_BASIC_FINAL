package chap15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		
		
		List<String> arrLists=new ArrayList<String>();
		
		List<String> linkedLists=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			arrLists.add(0, "hi");
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime-startTime ); //
		
		startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			linkedLists.add(0, "hi");
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime-startTime ); // 
		
	}

}
