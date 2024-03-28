package chap15;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		//저장할 공간, 리스트
		ArrayList<Board> arrLists	=new ArrayList<Board>();
		
		arrLists.add(new Board("제목1","내용1","글쓴이1"));
		arrLists.add(new Board("제목2","내용2","글쓴이3"));
		
		
		
		for(int i=0;i<arrLists.size();i++){
//			System.out.println(arrLists.get(i));
			System.out.println(arrLists.get(i).getSubject() + arrLists.get(i).getContent() + arrLists.get(i).getWriter());
		}
		
		System.out.println("-----------");
		
		for(Board boardlist : arrLists) {
			System.out.println(boardlist.getSubject() + boardlist.getContent() +  boardlist.getWriter());
		}
		
		
	}

}
