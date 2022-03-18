//5 METHODS 

import java.util.Scanner;

public class WeightConverter {
			
				final double Kilograms_To_Pounds = 2.2;
				// 1 kilogram = 2.2 pounds
				final double Miles_To_Kilometers = 1.60934;
				// 1 mile = 1.60934 kilometers
				
		public static void main (String[] args) {
		//main method that will run the program
			
			PrintMenu();
			//The method that has all the calculations, user inputs, menu of choices, and final statement
			
		}
		
//METHOD 1//
		public static void PrintMenu() {
		//Creating a new method
			Scanner stdin = new Scanner(System.in);
			//Method created by java.util.Scanner, "Scanner," 
			//Creating stdin to allow what the user inputs to be used as a function in the program
			WeightConverter ObjectConverter = new WeightConverter();
			//NAME METHOD  +   NAME OF OBJECT  +  APPLY METHOD
			//Method created by me, "WeightConverter,"
			
			//MENU TABLE
			System.out.println("(A) ~ Convert Pounds to Kilograms");	//Choice A
			System.out.println("(B) ~ Convert Kilograms to Pounds");	//Choice B
			System.out.println("(C) ~ Convert Kilometers to Miles");	//Choice C
			System.out.println("(D) ~ Convert Miles to Kilometers");	//Choice D
			System.out.println("(E) ~ Exit");							//Choice E
			
			System.out.print("Enter your option: ");
			//Asking User to choose a choice
			char letter = stdin.next().charAt(0);
			//Whatever the user inputs gets stored into the object character "letter"
			System.out.println("");
			
			double UserQuantity, Calculator = 0;
			//Declaring variable UserQuantity and Calculator as a type double equals 0
			
			if (letter == 'A') {
			//If the user enters the character A
				System.out.print("Enter quantity in Pounds: ");
				//Program will ask user to enter a quantity
				UserQuantity = stdin.nextInt();
				//The quantity the user enters will be stored in the type double object "UserQuantity" 
				System.out.println("");
				Calculator = ObjectConverter.PoundsToKilograms(UserQuantity);
			   /*I want the variable "Calculator" to be the result of the UserQantity converted
				In order to do that, I must set "Calculator" to the original method that has the calculations,
				and have what the user inputed(UserQuantity) used as a variable in the conversion calculator.
				VARIABLE =  OBJECT THAT IS IN CLASS . METHOD THAT HAS FUNCTION (WHAT USER INPUTED TO BE INCLUDED IN FUNCTION)*/
				System.out.printf("%.2f Ibs is %.2f in Kgs\n", UserQuantity, Calculator);
			  /*The method "PrintMenu" will print 2 decimal points(float) of what the user inputed(the pounds)
				and 2 decimal points of the conversion calculated (the kilograms) */
				//"\n" = new line within statement.
			}
			
			else if (letter == 'B') {
			//If the user enters the character B
				System.out.print("Enter quantity in Kilograms: ");
				UserQuantity = stdin.nextInt();
				//The quantity the user enters will be stored in the type double object "UserQuantity" 
				System.out.println("");
				Calculator = ObjectConverter.KilogramsToPounds(UserQuantity);
				/*I want the variable "Calculator" to be the result of the UserQantity converted
				In order to do that, I must set "Calculator" to the original method that has the calculations,
				and have what the user inputed(UserQuantity) used as a variable in the conversion calculator.
				VARIABLE =  OBJECT THAT IS IN CLASS . METHOD THAT HAS FUNCTION (WHAT USER INPUTED TO BE INCLUDED IN FUNCTION)*/
				System.out.printf("%.2f Kgs is %.2f in Ibs\n", UserQuantity, Calculator);
			  /*The method "PrintMenu" will print 2 decimal points(float) of what the user inputed(the Kilograms)
				and 2 decimal points of the conversion calculated (the pounds) */
			}
			
			else if (letter == 'C') {
			//If the user enters the character C
				System.out.print("Enter quantity in Kilometers: ");
				UserQuantity = stdin.nextInt();
				//The quantity the user enters will be stored in the type double object "UserQuantity" 
				System.out.println("");
				Calculator = ObjectConverter.KilometersToMiles(UserQuantity);
				/*I want the variable "Calculator" to be the result of the UserQantity converted
				In order to do that, I must set "Calculator" to the original method that has the calculations,
				and have what the user inputed(UserQuantity) used as a variable in the conversion calculator.
				VARIABLE =  OBJECT THAT IS IN CLASS . METHOD THAT HAS FUNCTION (WHAT USER INPUTED TO BE INCLUDED IN FUNCTION)*/
				System.out.printf("%.2f KMs is %.2f in M\n", UserQuantity, Calculator);
			  /*The method "PrintMenu" will print 2 decimal points(float) of what the user inputed(the Kilometers)
				and 2 decimal points of the conversion calculated (the Miles) */
			
			}
			
			else if (letter == 'D') {
			//If the user enters the character D
				System.out.print("Enter quantity in Miles: ");
				UserQuantity = stdin.nextInt();
				//The quantity the user enters will be stored in the type double object "UserQuantity" 
				System.out.println("");
				Calculator = ObjectConverter.MilesToKilometers(UserQuantity);
				/*I want the variable "Calculator" to be the result of the UserQantity converted
				In order to do that, I must set "Calculator" to the original method that has the calculations,
				and have what the user inputed(UserQuantity) used as a variable in the conversion calculator.
				VARIABLE =  OBJECT THAT IS IN CLASS . METHOD THAT HAS FUNCTION (WHAT USER INPUTED TO BE INCLUDED IN FUNCTION)*/
				System.out.printf("%.2f M is %.2f in KMs\n", UserQuantity, Calculator);
			  /*The method "PrintMenu" will print 2 decimal points(float) of what the user inputed(the Miles)
				and 2 decimal points of the conversion calculated (the Kilometers) */
				
			}
			
			else if (letter == 'E') {
			//If the user enters the character E
				System.out.print("Exiting the program.");
				//The method "PrintMenu" program will print "Exiting program"
				System.out.println("");
			}
			else {
			//If anything else gets printed outside the options given
				System.out.print("Invalid input.");
				//The program in the "PrintMenu" method will print "Invalid input"
			}
			
			
			stdin.close();
		}
		
//METHOD 2//
		public double PoundsToKilograms(double Pounds) {
		//declaring method header
		//Public allows method to be used through out the program and other classes	
		//Double is the primitive type of the method output
		//double Pounds is declaring the object "Pounds" as a double
			return Pounds / Kilograms_To_Pounds;
			//Return means that when this method is being declared, 
			//Kilograms_To_Pounds = 2.2
		}
		
//METHOD 3//
		public double KilogramsToPounds(double Kilograms) {
		//declaring method header
		//declaring method header
		//Public allows method to be used through out the program and other classes	
		//Double is the primitive type of the method output
		//double Kilograms is declaring the object "Kilograms" as a double
			return Kilograms * Kilograms_To_Pounds;
			//Return means that when this method is being declared, 
			//Kilograms_To_Pounds = 2.2
		}
		
//METHOD 4//
		public double KilometersToMiles(double Kilometers) {
		//declaring method header
		//Public allows method to be used through out the program and other classes	
		//Double is the primitive type of the method output
		//double Kilometers is declaring the object "Kilometers" as a double
			return Kilometers / Miles_To_Kilometers;
			//Return means that when this method is being declared, 
			//Kilograms_To_Pounds = 2.2
		}

//METHOD 5//
		public double MilesToKilometers(double Kilometers) {
		//declaring method header
		//Public allows method to be used through out the program and other classes	
		//Double is the primitive type of the method output
		//double Kilometers is declaring the object "Kilometers" as a double
			return Kilometers / Miles_To_Kilometers;
			//Return means that when this method is being declared, 
			//Kilograms_To_Pounds = 2.2
			}
}
