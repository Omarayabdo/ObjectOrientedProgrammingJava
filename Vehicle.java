public abstract class Vehicle {
	
	public String name;
	public int numWheels;
	
	public Vehicle(String name, int numWheels) {
		this.name = name;this.numWheels = numWheels;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setNumWheels(int nW) {
		numWheels = nW;
	}
	public int getNumWheels() {
		return numWheels;
	}
}