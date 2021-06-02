public class Bai18 {

	public static void main(String[] args) {
		int year = 2018;
		System.out.println();        
	        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	               System.out.println("Nam " + year + " la nam nhuan");
	        else
	               System.out.println("Nam " + year + " khong phai la nam nhuan");
	               System.out.println();
	}

}
