package dd;

import java.util.Scanner;

public class Scanner_1 {
	public static void main(String[] args) {
		
		// 문장
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		// nextLine() 메서드는 항상 문자열을 반환합니다. 
		
		System.out.println("입력한 문장 => " + inputStr);
		
		// 정수
		int inputNum = sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("입력한 정수 => " + inputNum);
		
		
		// 실수
		// float inputFlt = sc.nextFloat();
		double inputDb1 = sc.nextDouble();
		
		System.out.println("입력한 실수 => " + inputDb1);
		
		// 단어를 입력하세요
		String input_word = sc.next();
		System.out.println("입력한 단어 => " + input_word);
		
		
		// 새로운 문장
		String input_str2 = sc.nextLine(); //enter까지 입력 됌
		System.out.println("입력한 문장 => " + input_str2);
		sc.close();
		
		
	
		
	}
	
}
