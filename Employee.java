
public class Employee extends Person {
	
	private double salary;
	private myDate dateHired;
	
	public Employee(String name, String address, String phoneNumber, int age, String email, double salary) {
		super(name, address, phoneNumber, age, email);
		this.salary = salary;
		this.dateHired = new myDate();
	}
	
	public myDate getDateHired() {
		return dateHired;
	}
	
	public String toString() {
		return "Employee: " + super.toString(); 
	}
}
