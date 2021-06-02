public class Bai13 {

	public static void main(String[] args) {
		String str1="Hello World";
		String str2="Hello Java";
		String str3="Hello World";
		boolean check1=str1.equals(str2);
		boolean check2=str1.equals(str3);
		System.out.println(str2+" = "+str1+" ? "+check1);
		System.out.println(str3+" = "+str1+" ? "+check2);
	}

}
