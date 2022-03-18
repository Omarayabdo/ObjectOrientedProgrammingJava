import java.util.Scanner;
//Importing package to be able to record user inputs

public class ComputerPriceCalculator {
//Type of class(Public: can be used from different classes/programs)
//Name of this class is "ComputerPriceCalculator"

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		//Allowing program to record what user inputs and declaring it as the object "in"
	
		
		System.out.println("Welcome to Omar's Computer Store! I will calculate the price of your computer based on");
		System.out.println("                       CPU, GHz, Disk Type, and Disk Size                             ");
		System.out.println("                                                                                      ");
		
		System.out.println("The base price for the computers I sell is: $1000                                     ");
		System.out.println("Here are your options to choose from:                                                 ");
		System.out.println("                                                                                      ");
		System.out.println("                                - CPU -                                               ");
		System.out.println("                   AMD = + $175         Intel = + $200                                ");
		System.out.println("                                                                                      ");
		System.out.println("                                - GHz -                                               ");
		System.out.println("        1 GHz or less than 2 GHz is an additional = + $80                             ");
		System.out.println("                 2 GHz or Higher is an additional = + $150                            ");
		System.out.println("                                                                                      ");
		System.out.println("                              - Disk Size -                                           ");
		System.out.println("                   Each gigabyte of disk space = + $2                                 ");
		System.out.println("                                                                                      ");	
		System.out.println("                              - Disk Type -                                           ");
		System.out.println("                 HDD = + $100              SSD = + $225                               ");
		System.out.println("                                                                                      ");
		System.out.println("                                                                                      ");
		
		
		String CPU, diskType;
		double GHz, diskSize;
		double price = 1000;
		float incorrect = -1;
		//Declaring CPU and diskType objects as String types
		//Declaring gHz and diskSize objects as double types
		//"," makes code shoreter and easier to read
		//"," take place instead of writing 2 lines of, example String, and combines it
		
	//CPU//
		System.out.print(" Lets start with CPU, which would you like to buy for your computer?      :        ");
		//Ask about which CPU user is choosing
		CPU = stdin.nextLine();
		//Whatever user enters for CPU will be stored in object "CPU"
		if (CPU.equals("Intel")) 
		//If user enters Intell for CPU...
			price = price + 200; 
		
			//The $200 will be add to $1000
		else if (CPU.equals("AMD")) 
		//If user enters AMD for CPU...
			price = price + 150; 
			//The $150 will be add to $1000
		else 
			System.out.println("Sorry! we do not offer " + CPU + " in our store or you may have misspelled it."); 
		
	//GHz//
		System.out.print("  What about the GHz? GHz is pretty important for a quality computer!     :        ");
		//Asks about how much GHz user would like
		GHz = stdin.nextDouble();
		//Whatever user enters for GHz will be stored in object "GHz"
		if (GHz >= 2)
			//If user enters 2 or more GHz...
			price = price + 150;
			//The $150 will be add to $1000
		else if (GHz >= 1)
		//If user enters a number between 1 and 2 including 1 GHz...
			price = price + 80;
			//The $80 will be add to $1000
		else
			System.out.println("Unfortunately we do not sell " + GHz + "GHz in our store.");
		
	//Disk Size//
		System.out.print("   What are you considering for the disk size?                            :        ");
		//This asks what the user would like for disk size
		diskSize = stdin.nextDouble();
		//Whatever user enters for disk size will be stored in object "diskSize"
		if (diskSize > 0)
		//If the disk size the user inputs is bigger than 0...
			price = price + (diskSize * 2);
			//The price will be added to what the user entered times two
		else
			System.out.println("Woah! that " + diskSize + " is not sold at any of my stores.");
		
	//Disk Type//
		System.out.print("     Would you like a HDD or SSD disk type?                               :        ");
		//The user will be asked which disk type they would want for their computer
		diskType = stdin.next();
		//Whatever user enters for the disk type will be stored in object "diskType"
		if (diskType.equals("SSD"))
		//If user enters SSD for their disk type...
			price = price + 225;
			//The $255 will be add to $1000
		else if (diskType.equals("HDD"))
		//If user enters HDD for their disk type...
			price = price + 100;
			//The $100 will be add to $1000
		else
			System.out.println("Aw man! we are not holders of " + diskType + ", sorry for the inconvienience or you may have misspelled it.");
		

		System.out.println("                                                       ");
		
		if (CPU.equals("Intel") || CPU.equals("AMD") && GHz >= 2 || GHz >= 1 && diskSize > 0 && diskType.equals("SSD") || diskType.equals("HDD")) {
			System.out.println("Nice choices! your total only comes out to be $" + price);}
		else {
			System.out.print(incorrect);}
	
		
		stdin.close();
	}

}
