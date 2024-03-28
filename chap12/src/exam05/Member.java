package exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@Data // @Getter @Setter @ToString  @RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor


//@RequiredArgsConstructor  //@RequiredArgsConstructor는 기본적으로 매개변수가 없는 생성자를 포함시키지만,  final 또는 @NonNull이 붙은 필드가 있다면 이 필드만 초기화 시키는 생성자를 포함시킨다.

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor 
public class Member {
	
	//final private String id;  //final은 변경할 수 없음(즉, setter가 만들어지지 않음)
	
	@NonNull
	private String id;  //@NonNull은 null이 아닌 다른 값으로 setter를 통해 변경할 수 있다.는 것
	
	
	//final private String id;
	
	
	private String name;
	private int age;
	
	

	
//	public Member(String id) {
//		super();
//		this.id = id;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
	
	
	
//	public Member() {
//	
//}
	
	
	
//	public Member(String id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	
	
	
//	@Override
//	public String toString() {		
//		return "회원 ID : " + this.id + "회원 이름 : "  + this.name + "회원 나이 : " + this.age ;
//	}
	
	
	
	
	

}
