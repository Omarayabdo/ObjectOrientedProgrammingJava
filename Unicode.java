
import java.util.Scanner;
	/*
	 * java.util is a package used for getting inputs that contains very important types.
	 * Scanner is a flexible object that can be used a variety of ways.
	 */

public class Unicode {
	/*
	 * Public means it can be used from different classes.
	 * Unicode is the name of the class. 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			/*
			 * main(is a method) takes an array of string arguments(sequence 
			   of characters that exist as an object), and does not return anything (void).
			 * Static is used for memory management and used for a constant variable or a method that 
			   is same for every instance of a class.
			 */
		
		System.out.println("What string would you like to know in Unicode? ");
			/*
			 * The program will start by asking "What string would you like to know in Unicode? "
			 */
		
		String a = scan.next();
			/*
			 * Assigning the variable 'a' as a type string and places the 
			   cursor in the same line after reading the input(scan.next())
			 */
		
		for(int i = 0; i < a.length(); i++) {
			/* 
			 * for is an infinite loop that runs code in (), in this case,
			   for the int object set as 'i' is 0
			   the length of the string is bigger than 1, the program will execute.
			*/
			
			char ch = a.charAt(i);
			/*
			 * Declares variable 'ch' as a method returns the character 
			   at the specified index in a string.
			 */
			int value = ch;
			System.out.print(value);
		}

	}

}

// Program asks user to enter a string and then program returns the Unicode. 