import java.util.Scanner;
//Package that allows functions to be used

public class StudentCredits {
//Public : can be used from any code
//class "StudentCredits" : name of the class 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//initalizing the scanner(records user input) 
		//System.in is whatever the user inputs, scanner records
		
		System.out.println("Enter the number of credits you are taking this semester: ");
		//Ask user the number of credits being taken this semester
		int credits = in.nextInt();
		//What ever the integer the user inputs, gets recorded into the object credits
		
		if (credits >= 12 && credits <= 25) {
		//If the user inputs a number between 12 and 25...
			System.out.println("You are a full time student that takes " + credits + " credits.");
			//The program will print that that amount of credits is a full time student.
		}
		else if (credits >=1 && credits < 12) {
		//If the user inputs a number between 1 and 12...
			System.out.println("You are a part time student that takes " + credits + " credits.");
			//The program will print that that amount of credits is a part time student.
		}
		else {	
		//Anything else inputted that isnt between 12 and 25 or 1 and 12...
			System.out.println("Incorrect number of credits. " + credits + " credits is not a logical amount of credits.");
			//It will let the user know that they typed an incorrect number of credits
		}
			
		in.close();
	}
}