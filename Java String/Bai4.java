public class Bai4 {
	public static void main (String[]args) {
		String str = "Hello world";
		System.out.println(str);
		int a = str.codePointCount(1,4);
		System.out.println("Value of codepoint: " + a);
	}
}
