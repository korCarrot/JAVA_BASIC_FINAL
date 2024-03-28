
public class PrintEx {

	public static void main(String[] args) {
			
		
//		System.out.println("hi" + 3);
		
		System.out.printf("이것은 %d 입니다.\n", -1); //digit 또는 decimal 숫자(일반적으로는 10진수를 의미하는 것으로 받아들여집니다.)
//		System.out.println();
		System.out.printf("이것은 %c 입니다.\n", 'a'); //char
		System.out.printf("이것은 %s 입니다.\n", "hihi"); //string		
		System.out.printf("이것은 %f 입니다.", 3.14); // floating point number : f
		
		System.out.println("========================");
		
		System.out.printf("이것은 %d 입이고 저것은 %s입니다. \n", 3,"nice"); 
		
		System.out.printf("이것은 %.2f 입니다.\n", 3.56389);
		System.out.printf("이것은 %010.2f 입니다.", 3.56389);

	}

}
