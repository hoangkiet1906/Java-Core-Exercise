public class Bai9 {
	public static void main(String[] args) {
		String str1="abcdef", str2="defghij";
		CharSequence check="defghij";
		System.out.println("So sanh str 1 "+str1 +" and " + check +": "+ str1.contentEquals(check));
		System.out.println("So sanh str 2 "+str2 +" and " + check +": "+ str2.contentEquals(check));
	}

}
