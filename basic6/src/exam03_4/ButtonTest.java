package exam03_4;

import exam03_4.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		// 버튼을 만들어야 클릭을 할 수 있음

		// 버튼 객체가 있어야 함

		Button okbutton = new Button();

		// Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스

		// 로컬 클래스(ClickListener인터페이스를 구현한 OkClickListener)

		class OkClickListener implements Button.ClickListener {

			public OkClickListener() {

			}

			@Override
			public void onClick() {
				System.out.println("Ok 버튼 클릭");
			}
		}

		ClickListener clickListener = new OkClickListener();

		okbutton.setClickListener(clickListener);

		okbutton.click();

		System.out.println("==================================");

		//// 로컬 클래스(ClickListener인터페이스를 구현한 CancelClickListener)

		class CancelClickListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancle 버튼 클릭");

			}

		}

		Button cancelbutton = new Button();

		//ClickListener clickListener2 = new CancelClickListener();

		cancelbutton.setClickListener(new CancelClickListener());

		cancelbutton.click();

	}

}
