public class Bai3 {
	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println(str);
		int a = str.codePointBefore(1);
		System.out.println("Str value 1 (unicode point): " + a);
	}

}
