import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Bai23 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
	     	LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	     	Period period = today.until(lastDayOfYear);
	     	System.out.println();
	     	System.out.println("Months remaining in the year: "+period.getMonths());	
	     	System.out.println();
	}

}
