
public class TestPerson {
	
	public static void main (String [] args) {
		Person person = new Person("Omar", "4 Haskin Pl Beacon NY 12508", "8452939530", 18, "omar.abdo@stonybrook.edu");
		
		Student student = new Student("Omar Amr", "81 Abrag Othman Tower 12 Cairo", "022526160", 19, "omarayabdo@gmail.com", Student.FRESHMAN);
		
		Employee employee = new Employee("Omar Yehia", "101 Matteawan Rd Beacon NY 12508", "8458386900", 20, "abdo.o@beaconk12.org", 35000);
	
		Faculty faculty = new Faculty("Omar Abdo", "455 Fishkill Ave Beacon NY 12508", "8458380263", 21, "abdo.o@azpeople.org", 15000, "7:30am to 1:30pm", 9);
		
		Staff staff = new Staff("Omar Amr Abdo", "142 6th October No. 4 Giza", "0101993600", 22, "omarayabdo@gmail.com", 1200000, "CEO of Engineers");
	
	System.out.println(person.toString());
	System.out.println(student.toString());
	System.out.println(employee.toString());
	System.out.println(faculty.toString());
	System.out.println(staff.toString());
	}
}