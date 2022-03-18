public class MotorizedVehicle extends Vehicle {
	
	private double volumeDisplacement;
	
	public MotorizedVehicle(String name, int numWheels, double volumeDisplacement) {
		super(name, numWheels);this.volumeDisplacement = volumeDisplacement;
	}
	public double getHorsePower() {
		return volumeDisplacement * super.getNumWheels();
	}
}