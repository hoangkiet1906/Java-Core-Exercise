public class Bai10 {
	public static void main(String[] args) {
		String str1="abcdef", str2="defghi";
		StringBuffer check=new StringBuffer(str1);
		System.out.println("So sanh str 1 "+str1 +" va " + check +": "+ str1.contentEquals(check));
		System.out.println("So sanh str 2 "+str2 +" va " + check +": "+ str2.contentEquals(check));
	}

}
