import java.util.Calendar;

public class Bai8 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println(cal.getTime());
		System.out.println();

	}

}
