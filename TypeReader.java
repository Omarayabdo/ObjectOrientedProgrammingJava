
import java.util.Scanner;
	/*
	 * 
	 * java.util is a package used for getting inputs that contains very important types.
	 * Scanner is a flexible object that can be used a variety of ways.
	 */

public class TypeReader {
	/*
	 * Public means it can be used from different classes.
	 * TypeReader is the name of the class. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * main(is a method) takes an array of string arguments(sequence 
		   of characters that exist as an object), and does not return anything (void).
		 * Static is used for memory management and used for a constant variable or a method that 
		   is same for every instance of a class.
		 */
		
		System.out.print("Enter any number: "); // Asks user to type a number
		String number = scan.nextLine();
			/*
			 * Declares the variable "number"
			 * Setting the object "input" that was declared as a string earlier to "scan"(to use the Scanner input)
			   for the method ".nextLine()" which is going to send the input object to a certain line(next one)
			 */
		
		Long integer = Long.parseLong(number);
			/*
			 * Declares the variable "integer" as a 'long'type so anything can get stored in it by the user
			 * Long.parseLong() is a method parses the string argument as a signed decimal long.
			 */
		
		if (integer >= (-128) && integer <= 127) {
			System.out.println("That type of number is a byte.");
				/*
				 * IF the integer assigned by what the user inputs is between -128 AND(&&) 127, 
				   the program will print "That type of number is a byte."
				 */
		}
		else if (integer >= (-32768) && integer <= 32767) {
			System.out.println("That type of number is a short.");
				/*
				 * IF the program above does not get executed, ELSE IF the integer assigned by what the user inputs is between 
				   -32768 AND(&&) 32767, the program will print "That type of number is a short."
				 */
		}
		else if (integer >= (-2147482648) && integer <= 2147482647) {
			System.out.println("That type of number is an integer.");
				/*
				 * IF the program above does not get executed, ELSE IF the integer assigned by what the user inputs is between 
				   -2147482648 AND(&&) 2147482647, the program will print "That type of number is an integer."
				 */
		}
		else {
			System.out.println("That type of number is a long.");
				/*
				 * IF all the programs above did not get executed, ELSE the program will print "That type of number is an long."
				 */
		}
	}
}

/* Program asks user to enter a number and the program lets the user know what category type that number falls in.*/