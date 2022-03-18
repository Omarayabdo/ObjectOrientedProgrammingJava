
public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, int age, String email, double salary, String title) 
	{
		super(name, address, phoneNumber, age, email, salary);
		this.title = title;
	}
	
	public String toString() {
		return "Staff: " + super.toString(); 
	}
}
