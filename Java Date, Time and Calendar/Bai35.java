import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai35 {

	public static void main(String[] args) {
		try {    
		      String originalString = "2018-04-07 00:40:00";
		      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
		      String newstr = new SimpleDateFormat("dd/MM/yyyy, H:mm:ss").format(date);
		       System.out.println("\n"+newstr+"\n");
		      } 
		    catch (ParseException e) {
		    //Handle exception here
		     e.printStackTrace();
	}

	}
}
