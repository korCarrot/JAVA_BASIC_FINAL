package inheritance;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		
		
		new SmartPhone();
		
		System.out.println("------------");
		System.out.println(new Phone());
		System.out.println(new SmartPhone());
		System.out.println("============");
//		Phone phone=new Phone();
		SmartPhone smphone=new SmartPhone();
		
//		System.out.println(phone);
		System.out.println(smphone);
		
		Phone phone = smphone;
		
		System.out.println(phone);
		System.out.println(smphone);
		
//		new SmartPhone();
		
		//SmartPhone myPhone=new SmartPhone();
		SmartPhone myPhone=new SmartPhone("갤럭시2", "은색2");
		
//		myPhone.model = "G-S24";
//		myPhone.color ="black";
//		
		System.out.println(myPhone.model + myPhone.color );
//		
//		myPhone.bell();
//				
//		System.out.println(myPhone.wifi);
//		
//		
//		myPhone.setWifi(true);
//		
//		myPhone.internet();
	}

}
