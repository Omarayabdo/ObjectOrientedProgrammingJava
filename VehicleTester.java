public class VehicleTester {
	public static void main(String [] args) {
		
		MotorizedVehicle beep = new MotorizedVehicle("Omar", 4, 3);
		System.out.println(beep.getName() + " " + beep.getNumWheels() + " " + beep.getHorsePower());
	
	}
}