import java.time.LocalDate;

public class Bai22 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
	     	System.out.println("\nCurrent Date: "+today);
	     	System.out.println("10 days ago "+today.plusDays(-10));
	     	System.out.println("10 days after "+today.plusDays(10)+"\n");
	}

}
