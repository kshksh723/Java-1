package dd;

public class example02_3 {

	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A'; 
		
		// 자동 타입 변환 
		{int inValue = byteValue;
		int intValue = charValue;
		short shortValue = charValue;		// char 타입의 양의 허용범위가 short 타입보다 더 큼
		double doubleValue = byteValue;
		
		System.out.println("\n~~~~~~~~~~~~\n");}
		
		
		// 강제 타입 변환
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		
		//1
		double var = (double)intValue;
		byte var = (byte)intValue;
		int var = (int)doubleValue;
		char var = (char)strValue;// 문자열을 char 타입으로 강제 형변환 할 수 없다
		
		
		
		// var 1부터 var 4까지 연산을 수행해서 int 타입 result 변수에 9가 저장되도록 빈칸에 들어갈 코드를 작성하시오
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.0";
		int result = 빈칸 ;
		System.out.println("result");
		
		System.out.println("\n~~~~~~~~\n");
		
	String str1 = 2+3+"";
	String str2 = 2+""+3;
	String str3 = ""+2+3;
	String str5 = 2 + 3 + 4 + "";  // "234"

	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str5);
	}

}

