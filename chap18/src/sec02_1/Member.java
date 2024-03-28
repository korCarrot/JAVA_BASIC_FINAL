package sec02_1;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Serializable{
//public class Member {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8064340003791424998L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	String id;
	String name;
	
	transient int age;  // transient 직렬화 대상에서 제외됨
	
	
	public String toString(){
		return this.id + ", " + this.name;
	}
}
