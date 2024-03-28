package exam03_4_2_anonymous;

import exam03_4_2_anonymous.Button.ClickListener;

public class ButtonTest2 {

	public static void main(String[] args) {
		
		Button button2=new Button();
		
		ClickListener clickListener = null;
		button2.setClickListener(new ClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼 2 클릭함");
				
			}
			
		});
		
		
		button2.click();

	}

}
