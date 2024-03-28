package exam03_5;

import exam03_5.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		
		
		//버튼 객체(2개, ok, cancel)
		
		Button okbutton=new Button();
		
		Button cancelbutton=new Button();
		
		
		ClickListener clickListener = null;
		
		//버튼 클릭을 위해 ClickListener를 구현한 클래스 필요
		
		class OkListener implements ClickListener{

			@Override
			public void onClick() {
				System.out.println("ok 버튼");				
			}
			
		}
		
		okbutton.setClickListener(new OkListener());	
		okbutton.click();
		
		
		class CancelListener implements ClickListener{

			@Override
			public void onClick() {
				System.out.println("cancel 버튼");				
			}
			
		}
		
		cancelbutton.setClickListener(new CancelListener());	
		cancelbutton.click();

	}

}
