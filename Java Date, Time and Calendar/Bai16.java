import java.util.Calendar;
import java.util.Date;

public class Bai16 {

	public static void main(String[] args) {
		int noOfDays = 14;
		Calendar cal = Calendar.getInstance();
		Date cDate = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date = cal.getTime();
		System.out.println("Now: "+cDate);
		System.out.println("After 2 week: "+date);

	}

}
