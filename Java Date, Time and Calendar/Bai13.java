import java.util.Calendar;

public class Bai13 {
	public static void main(String [] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of the week: "+dayOfWeek);
	}
}
