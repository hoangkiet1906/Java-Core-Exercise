import java.util.Calendar;

public class Bai11 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int month= cal.get(Calendar.MONTH)+1;
		int dayofmonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Days in Month: "+month+" la: "+dayofmonth);

	}

}
