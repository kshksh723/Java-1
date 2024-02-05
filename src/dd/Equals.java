package dd;

public class Equals {

	public static void main(String[] args) {
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		if(str1 == str2) {
			System.out.println("안녕하세요와 행복하세요 문자열이 같다");
			
		}
		String str3 = "안녕하세요";
		
		if(str1 == str3) {
			System.out.println("안녕하세요와 안녕하세요 문자열이 같다");
		}
	System.out.println("\n~~~~~~~~~~~~~");

	String str4 = new String("안녕하세요");
	String str5 = new String("안녕하세요");
	
	System.out.println("str4 : " + str4);
	System.out.println("str5 : " + str5);
	
	if(str4 == str5) {	//메모리상의 주소를 나타냄
		System.out.println("안녕하세요와 안녕하세요의 메모리 주소가 같습니다");
	}
	if(str4.equals(str5)) {
		System.out.println("str4의 문자열 값과 str5의 문자열값은 같다");
	}
	
	String str6 = "건강하세요";
	String str7 = "안녕하세요";
	String str8 = new String("부자되세요");
	String str9 = new String("부자되세요");
	
	if(str6.equals(str7)) {	//모두가 호환되어지는 equals..
		System.out.println("str6과 str7의 문자열값은 같습니다");
	}
	if(str8.equals(str9)) {
		System.out.println("str8과 str9의 문자열값은 같습니다");
		
	}
	if(str6.equals(str9)) {
		System.out.println("str6과 str9의 문자열값은 같습니다");
	}

	}

}
