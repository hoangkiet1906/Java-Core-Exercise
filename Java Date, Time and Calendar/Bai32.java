import java.time.LocalDate;
import java.time.Period;

public class Bai32 {

	public static void main(String[] args) {
		
        LocalDate pdate = LocalDate.of(1998, 11, 21);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);
     	System.out.printf("toi %d tuoi, %d thang and %d ngay.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
