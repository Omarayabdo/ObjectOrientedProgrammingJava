
import java.util.Scanner; 
						/*
						 * Scanner is a class in Java which is a "flexible" object(set to anything) 
							and java.util is a package used for getting the input of the primitive types like 
							int, double, etc. and strings
						*/

public class TempConverter {
						/*
						 * Public is a method means that it can be used in different classes and 
						anywhere in the program. For this program, the class being used is TempConverter
						 */
	
	public static void main(String[] args) {
						/*
						 * Core method of the code, main(is a method) takes an array of string arguments(sequence 
						   of characters that exist as an object), and does not return anything (void).
						 * Static is used for memory management and used for a constant variable or a method that 
						   is same for every instance of a class.
						 */
		
		Scanner scan = new Scanner(System.in);
					/*
					 * Scanner is a user input that, in this program, is using the "scan" object and setting it 
					   equal to "new Scanner(System.in)" which allows the the object to become an input.
					 */
		
		System.out.print("Enter a degree in Celsius: ");
					/*
					 * System.out.print prints to user whatever is in the ""
					 */
		
		double celsiusTemp = scan.nextDouble();
					/*
					 * Double          = decimal numbers(float but stores more bits, 64 bit), holds 15 decimal places.
					 * celsiusTemp     = creating a new object and the "=" sets the objects value
					 * scan.nextDouble = "scan." is declaring object that was created earlier. "nextDouble()" is
					                     a method that returns the double(decimal number) scanned from the 
					                     user inputs.
					*/
		
		double fahrenheitTemp = (9.0/5)*celsiusTemp + 32;
					/*
					 * fahrenheitTemp = 
					   creating a new object and the "=" sets the objects value, in this case, takes
					   (9.0/5), multiplies what the user inputed, and then adds 32.
					*/
		
		System.out.println("The fahrenheit temprature is " + fahrenheitTemp);
					/*
					 * Prints to the user whatever is in the "" but also adding the + includes the object calculated 
					   from the fahrenhietTemp object to be calculated and printing the final result.
					*/
	}

}
			
/* Program asks user to enter a degrees in Celsius, program converts to degrees to 
   Fahrenhiet and finally returns it to user. End of program.*/
