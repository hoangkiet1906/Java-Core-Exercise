import java.util.Calendar;

public class Bai15 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	      	System.out.println("Thoi gian: "); 
	      	System.out.format("%tB %te, %tY%n", c, c, c);
	      	System.out.format("%tl:%tM %tp%n", c, c, c); 
	}

}
