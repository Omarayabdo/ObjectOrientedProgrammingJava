
public class Student extends Person {
	
	private int status;
	
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	public Student(String name, String address, String phoneNumber, int age, String email, int status) {
		super(name, address, phoneNumber, age, email);
		this.status = status;
	}
	
	public String toString() {
		return "Student: " + super.toString(); 
	}
}
