import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarObjectClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here instead of Date() class we use Calendar class from java.util package. This calendar class gives more functions than Date class
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat d = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(d.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
