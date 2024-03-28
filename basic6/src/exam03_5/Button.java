package exam03_5;

public class Button {
	
	//필
	
	private ClickListener clickListener;	
	
	
	//정의한 이벤트를 버튼에 등록
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click(){
		this.clickListener.onClick();
	}

	//버튼에 등록할 이벤트를 정의(긴밀한 관계로 중첩 인터페이스)	
	interface ClickListener{		
		
		abstract void onClick();
	}

}
