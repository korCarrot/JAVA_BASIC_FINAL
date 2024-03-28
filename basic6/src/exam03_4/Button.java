package exam03_4;

public class Button {
	
	private ClickListener clickListener;
	
	
	//이벤트(클릭) 등록 메서드
	public void setClickListener(ClickListener clickListener){
		this.clickListener=clickListener;
	}
	
	
	//클릭하는 메서드
	void click(){
		this.clickListener.onClick();
	}
	
	
	
	
	//긴밀한 관계를 맺는 인터페이스 선언	
	static interface ClickListener{
		abstract void onClick();
	}

}
