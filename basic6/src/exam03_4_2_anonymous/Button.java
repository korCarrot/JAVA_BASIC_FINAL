package exam03_4_2_anonymous;

public class Button {
	
	
	//포함
	private ClickListener clickListener;
	
	
	//이벤트 등록
	void setClickListener(ClickListener clickListener){
		this.clickListener=clickListener;
	}
	
	
	//클릭
	
	void click(){
		this.clickListener.onClick();
	}
	
	
	//인터페이스 클릭할경우 일어날(Listen) 때(on) 일에 대한 이벤트(인터페이스로 선언)
	
	interface ClickListener{
		
		//추
		abstract void onClick();
	}
	
}
