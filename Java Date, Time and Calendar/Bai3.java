import java.util.Calendar;

public class Bai3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Time now: "+cal.getTime());
		int Maxyear = cal.getActualMaximum(Calendar.YEAR);
		int Maxmonth = cal.getActualMaximum(Calendar.MONTH);
		int Maxweek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int Maxdate = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Max Year: "+Maxyear);
		System.out.println("Max Month: "+Maxmonth);
		System.out.println("Max Week: "+Maxweek);
		System.out.println("Max Date: "+Maxdate);
	}

}
