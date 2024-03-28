package chap15;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		List<Board> boardLists = new Vector<Board>();
		//List<Board> boardLists = new ArrayList<Board>(); 갯수에서 오류가 남

		Thread threadA = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					boardLists.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}

			}

		});

		Thread threadB = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					boardLists.add(new Board("제목#" + i, "내용#" + i, "글쓴이#" + i));
				}

			}

		});
		
		
		threadA.start();
		threadB.start();
		
		
		
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			
		}
		
		
		for (Board board : boardLists) {
			System.out.println(board.getSubject() + board.getContent() + board.getWriter());
		}

		System.out.println(boardLists.size());
	}

}
