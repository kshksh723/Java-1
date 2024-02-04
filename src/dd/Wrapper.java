package dd;

public class Wrapper {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("ch=>" + ch);
		System.out.println((ch + 1));
		System.out.println((char) (ch - 32));
		// a : 97, 97-32 = 65, A의 값 : 65
		
		
		Character chr = Character.valueOf('a');
		System.out.println("chr => " + chr);

	}

}
