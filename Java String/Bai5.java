public class Bai5 {
	public static void main(String[]args) {
		String str1="Hello World";
		String str2="Hello Java";
		System.out.println("str 1: "+str1);
		System.out.println("str 2: "+str2);
		int rs = str1.compareTo(str2);
		if(rs<0) {
			System.out.println(str1 +" less than " +str2);
		}
		if(rs==0) {
			System.out.println(str1+" equals " +str2);
		}
		if(rs>0) {
			System.out.println(str1+" more than "+str2);
		}
	}
}
