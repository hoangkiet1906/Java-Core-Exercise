import java.time.Year;

public class Bai25 {

	public static void main(String[] args) {		
		Year yr = Year.now();
	     	System.out.println("\nCurrent Year: " + yr);  
	     	boolean isLeap = yr.isLeap();
	     	System.out.println("Is current year leap year? " + isLeap);  
	     	int length = yr.length();
	     	System.out.println("Length of the year: " + length+" days\n");
	}

}
