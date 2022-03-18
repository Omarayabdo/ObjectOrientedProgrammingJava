
import java.util.Scanner;

public class GasConsumption {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		double min, mph, mpg;
		
		System.out.println("Enter the number of minutes: ");
		min = stdin.nextDouble();
		
		System.out.println("Enter the constant speed of the car (m/h): ");
		mph = stdin.nextDouble();
		
		System.out.println("Enter the fuel efficiency of the car (m/g): ");
		mpg = stdin.nextDouble();
		
		System.out.println("Consumed gas for the period (in gallons):" + (min/60)*mph*(1/mpg));
	}

}
