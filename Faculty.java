import java.util.Calendar;

public class Faculty extends Employee {
	private String officeHours;
	private int rank;
	
	public Faculty(String name, String address, String phoneNumber, int age, String email, double salary, String officeHours, int rank) {
		super(name, address, phoneNumber, age, email, salary);
		this.officeHours = officeHours;
		
		if (rank >= 1 && rank <= 10)
			this.rank = rank;
		else
			this.rank = 1;
	}
	
	public int salaryRange(int rank) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int years = year - getDateHired().getYear();
		int rankYear = rank * year;
		
		if (rankYear < 10) 
			return 1;
		else if (rankYear >= 10 && rankYear < 20) 
			return 2;
		else if (rankYear >= 20) 
			return 3;
		return -1;
	}
	
	public String toString() {
		return "Faculty: " + super.toString(); 
	}
}
