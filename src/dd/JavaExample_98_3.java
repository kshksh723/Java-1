package dd;

import java.util.Scanner;

public class JavaExample_98_3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("1. 이름 : ");
		// scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리 : ");
		// scanner.nextLine();
		String ssn = scanner.nextLine();
		
		System.out.println("3. 전화번호 : ");
		// scanner.nextLine();
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		
		System.out.println("1. 이름 : " + name );
		System.out.println("2. 주민번호 앞 6자리 : " + ssn);
		System.out.println("3. 전화번호 : " + tel);
		
		
		

	}

}
