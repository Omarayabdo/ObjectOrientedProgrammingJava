
import java.util.Scanner;
	/*
	 * java.util is a package used for getting inputs that contains very important types.
	 * Scanner is a flexible object that can be used a variety of ways.
	 */

public class LegalIdenifier {																
	/*																					      // What are legal identifiers? What can Java understand and not understand?
 	 * Public means can be used from anywhere (different classes,programs)					     // Identifiers are anything thats being named in the program. (ex: variables)
	 * LegalIdenifier is the name of this particular class.             					 // Rules -
	 */					     																 	//	contain only letters, numbers, '_'(underscore), and cannot begin with a digit. 
																							 // Legal Examples   : myVariable, my_class, my4Var
																							 // Illegal Examples : 4myVariables, my class, my!Var, @#$myClass
	
	public static void main(String[] args) {
		/*
		 * An important "function" of that code that uses a method(main) to collect many
		   string arguments (sequence of objects that exist as an object). 
		 * This particular line does not return (void)
		 * Static is used for storing memory and used for a constant variable or a method that 
		   is same for every instance of a class
		 */
		
		Scanner scan = new Scanner(System.in);
			/*
			 * Scanner is a user input that, in this program, is using the "scan" object and setting it 
			   equal to "new Scanner(System.in)" which allows the the object to become an input.
			 */
		
		String input;
			/*
			 * This declares a string(sequence of character) called "input"
			 */
		
		boolean valid = true;
			/*
			 * boolean is a method that was imported from java.util package, its job is setting objects 
			   as true or false.
			 * valid is the object that the boolean is set to equal true.
			 */
		
		System.out.print("Type in an Identifier: ");
			/*
			 * Print to user "Type in an Identifier"
			 */
		
		input = scan.nextLine();
			/*
			 * Setting the object "input" that was declared as a string earlier to "scan"(to use the Scanner input)
			   for the method ".nextLine()" which is going to send the input object to a certain line(next one)
			 */
		
		if (!( (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') ||  //if is a method imported from java.util, "!" is a NOT gate, "&&" is AND, "||" is OR.
			   (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') ||  //input(object declared).char() a method that returns char of the first character is 'a' in this case, to 'z'
			   (input.charAt(0) == '_')								  //input(object declared).char() returns char of the first character is 'A' in line 55, to 'Z'
			   		)) {
				System.out.println("Invalid Identifier! The first character of the identifier must be a letter, number,"
						+ " or '_'. You had a: " + input.charAt(0));
				valid = false;
				/*
				 * IF everything in () is true, the program will print to user invalid identifier
				   and will set the valid object as the boolean false because if the identifier is
				   NOT a letter between a AND z OR a letter between A AND Z OR an underscore, than it 
				   is not an identifier that the program can understand.
				 */
		}
		for(int i = 1; i < input.length(); i++) {	/*for is an infinite loop that runs code in (), in this case, for the int object set as 'i' is 1
													   the length of the string is bigger than 1, the program will execute.*/
			if (!(  (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') ||
					(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') ||
					(input.charAt(i) == '_') ||
					(input.charAt(i) >= '0' && input.charAt(i) <= '9')
					   		)) {
					System.out.println("Invalid Identifier(s)! Invalid character(s) in identifier. "
								+ "You had a: " + input.charAt(i));
						valid = false;
		}
		System.out.println("Valid Indentifier! Cool name!");
		/*
		 * If the user types an identifier name that DOES begin with a letter between a and z or a letter 
		   between A and Z or an underscore, than it is an identifier that the program can understand and will
		   print "Valid Identifier! Cool name!".
		 */
		}
	}
}

/* Program asks user to enter an Identifier and then determines if the users input is legal or illegal.*/
