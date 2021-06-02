import java.util.Calendar;

public class Bai6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH)+1;
		int year = cal.get(Calendar.YEAR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minutes = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("Date: "+day+"-"+month+"-"+year+"  "+hour+":"+minutes+":"+second);
		
	}

}
