import java.util.GregorianCalendar;

public class myDate {
	
	private int day;
	private int month;
	private int year;
	
	public myDate() {
		GregorianCalendar calender = new GregorianCalendar();
		year = calender.get(GregorianCalendar.YEAR);
		month = calender.get(GregorianCalendar.MONTH);
		day = calender.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public int getYear() {
		return year;
	}
}
