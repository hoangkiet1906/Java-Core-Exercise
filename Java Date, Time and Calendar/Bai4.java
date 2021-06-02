import java.util.Calendar;

public class bai4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Thoi gian hien tai: "+cal.getTime());
		int Maxyear = cal.getActualMinimum(Calendar.YEAR);
		int Maxmonth = cal.getActualMinimum(Calendar.MONTH);
		int Maxweek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
		int Maxdate = cal.getActualMinimum(Calendar.DATE);
		System.out.println("Min Nam: "+Maxyear);
		System.out.println("Min Thang: "+Maxmonth);
		System.out.println("Min Tuan: "+Maxweek);
		System.out.println("Min Ngay: "+Maxdate);

	}

}
