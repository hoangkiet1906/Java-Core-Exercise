public class Bai14 {

	public static void main(String[] args) {
		String str1="Hello World";
		String str2="Hello Java";
		String str3="hello world";
		boolean check1=str1.equalsIgnoreCase(str2);
		boolean check2=str1.equalsIgnoreCase(str3);
		System.out.println(str2+" = "+str1+" ? "+check1);
		System.out.println(str3+" = "+str1+" ? "+check2);
	}

}
