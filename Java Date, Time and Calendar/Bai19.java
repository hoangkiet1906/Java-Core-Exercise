import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Bai19 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();    
	     	LocalDate userday = LocalDate.of(2015, Month.MAY, 15); 
	     	Period diff = Period.between(userday, today); 
	     	System.out.println("Chenh lech "+ userday +" va "+ today +": " 
	     	+ diff.getYears() +" Nam(s) va "+ diff.getMonths() +" Thang()s");
	}

}
