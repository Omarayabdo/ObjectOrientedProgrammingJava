
public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private int age;
	
	public Person(String name, String address, String phoneNumber, int age, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Person: " + name;
	}
}
