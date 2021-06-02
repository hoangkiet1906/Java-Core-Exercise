import java.time.LocalTime;

public class Bai15 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(3);
		System.out.println("+3 hour now: "+newTime);

	}

}
