import java.text.DateFormatSymbols;
import java.util.Locale;

public class Bai12 {

	public static void main(String[] args) {
		DateFormatSymbols symmbols = new DateFormatSymbols(new Locale("en"));
		String[] dayNames = symmbols.getWeekdays();
		for(String s:dayNames) {
			System.out.println(s+"\n");
		}

	}

}
