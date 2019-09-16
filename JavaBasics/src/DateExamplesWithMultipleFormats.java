import java.text.SimpleDateFormat;
import java.util.Date;


public class DateExamplesWithMultipleFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Req: Show current date & time with required formats. */
		
		Date d = new Date();
		
		System.out.println(d.toString()); //Here toString() method is used to convert date into normal string.
		
		//CASE 1: Get Date in MM/dd/YYYY
		
		SimpleDateFormat d1 = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(d1.format(d));
		
		//CASE 2: Get Date & Time both in MM/dd/YYYY hh:mm:ss
		SimpleDateFormat d2 = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(d2.format(d));
	}

}
