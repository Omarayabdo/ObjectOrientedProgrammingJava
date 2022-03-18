
import java.util.Scanner;
//Importing package

public class AutoInsurancePrice {
//Type of class, class name
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ability to record or take in user inputs
		
		System.out.println("This program will calculate your auto insurance price!");
		System.out.println(" ");
		
		System.out.print("      Enter the premium     :  ");
		double premium = in.nextDouble();
		//Declaring whatever the user inputs to their premium as the object "premium" and recording it as a double
		double premiumpercentage = 1;
		//Declaring the object "premiumpercentage" as a double thats equal to 1
		
		System.out.print("        Enter the age       :  ");
		int age = in.nextInt();
		//Declaring whatever the user inputs to their age as the object "age" and recording it as an integer
		
		System.out.print("      Enter the gender(F/M) :  ");
		String gender = in.next();
		//Declaring whatever the user inputs to their gender as the object "gender" and recording it as a string
		//When you use a String type, you can only use .next() or .nextLine(), no such thing as .nextString()
		
		if (age >= 18 && age < 21) {
		//If user enters an age that is between 18 and 21 including 18...
			if (gender.equals("male")) {
				//If age is between 18 and 21 including 18 and user also enters male...
				premiumpercentage = 1;
				//premiumpercentage is equal to 1 which is stored and will be used later in the program
			}
				else {
					//If age is between 18 and 21 including 18 and user also enters female...
					premiumpercentage = 0.90;
					//premiumpercentage is equal to 0.90 which is stored and will be used later in the program
				}
		} 
		else if (age >= 21 && age < 30) {
		//If user enters an age that is between 21 and 30 including 21...
				premiumpercentage = 0.75;
				//premiumpercentage is equal to 0.90 which is stored and will be used later in the program
				//Gender is not relevent in this statement,  only ages between 21 and 30 including 21 matters
		}
		else if (age >= 30 && age < 60) {
		//If user enters an age that is between 30 and 60 including 30...
			if (gender.equals("male")) {
			//If age is between 30 and 60 including 30 and user also enters male..
				premiumpercentage = 0.60;
				//premiumpercentage is equal to 0.60 which is stored and will be used later in the program
			}
			else {
			//If age is between 30 and 60 including 30 and user also enters female...
				premiumpercentage = 0.70;
				//premiumpercentage is equal to 0.70 which is stored and will be used later in the program
			}
		}
		else if (age >= 60) {
		//If user enters an age greater than or equal to 60...
			premiumpercentage = 1;
			//premiumpercentage is equal to 1 which is stored and will be used later in the program
			//Gender is not relevent in this statement, only ages 60 and up matters
		}
		else {
		//If age is a negative number or less than 18...
			premium = -1;
			//premium is equal to -1 which is stored and will be used later in the program
			//Gender is not relevent in this statement, if you are younger than 18, premium is -1

		}
		
		System.out.println(" ");
		System.out.println("Your auto incurance price is " + premium*premiumpercentage);
		//Prints "Your auto incurance price is " then calculates by mutlipling premim and percentage based on age (and gender)

		in.close();
	}

}
/* This program will calculated the user's auto incurance price based of what the use inputs as their
   premium, age, and gender*/
