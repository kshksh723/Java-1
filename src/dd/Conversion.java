package dd;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputStr =  sc.nextLine();
		
		byte n = (byte)(Byte.parseByte(inputStr) + 10);
	}

}
