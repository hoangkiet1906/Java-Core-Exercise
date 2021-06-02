import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai24 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();	
		System.out.println("\nDefault format of LocalDate="+date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		LocalDateTime dateTime = LocalDateTime.now();		
		System.out.println("Default format of LocalDateTime="+dateTime);		
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
   		Instant timestamp = Instant.now();		
		System.out.println("Default format of Instant="+timestamp);	
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = "+dt+"\n");
	}

}
