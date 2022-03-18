import java.util.Scanner;

public class DistintNums {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int Counter = 0, input;
		//Declaring those two variables as int; giving Counter a starting point of 0 or setting its value to 0 
		int[] Numbers = new int[10];
		//Creating Array: Type(int) + [] + Name of Array = new Type(int) + [Size of Array]
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Enter Number %d: ", i);
			//Formatted print; %d means integer; , i means thats the variable being used in the format
			input = stdin.nextInt();
			
			if (!ArrayContains(input, Numbers)) {
				Numbers[Counter] = input;
				Counter++;
			}
		} 
		
		System.out.println(" ");
		
		for (int i = 0; i < Counter; i++) {
			System.out.print(Numbers[i] + " ");
		}	
		stdin.close();
	}

	
public static boolean ArrayContains(int Target, int[] Array) {
	//Method to Search if the Array has certain numbers using a for loop
	//Static so no need to call it
	//Boolean to return true or false; return true if array has number("Target")
	//If Target is in Array, return true; if not, false
		for (int i = 0; i < Array.length; i++) {
		//Loop starting point at 0 will increment when the value i is less than the number of elements in the array
			if (Target == Array[i]) 
			//This means that the Target number is in the array
				return true;
				//Boolean allows you to return true
		}
		//Otherwise, because its a boolean, it will undertand to return false 
		return false;
	}


}