import java.time.YearMonth;

public class Bai10 {
	public static void main(String[] args) {
		YearMonth y = YearMonth.of(2018, 4);
		String firstDay = y.atDay(1).getDayOfWeek().name();
		String lastDay = y.atEndOfMonth().getDayOfWeek().name();
		System.out.println(firstDay);
		System.out.println(lastDay);

	}

}
