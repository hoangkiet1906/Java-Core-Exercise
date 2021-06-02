public class Bai11 {

	public static void main(String[] args) {
		char[] arr= new char[] {'a','b','c','d'};
		String str = String.copyValueOf(arr,2,3);
		System.out.println(str);
	}

}
