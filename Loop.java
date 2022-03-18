import java.util.Scanner;

public class Loop {
	public static void main (String[] args) {
		System.out.println("Kilograms  Pounds");
		//Header of the table
		
		//Use for loop when you know start point and end point.
		//In this case, start point is 1 and end point is 199.
		for (int i = 1; i < 200; i += 2) {
		/* First value is 1(starting value) so I intialize the integer i = 1 in the for loop
		   i < 200(terminating condition), prefered i < 200 over i <= 199, both will stop at 199. 
		   less than the end point + 1 for the terminating conditon */
		/* In lab instructions, the interval goes up by 2 each time can be
		   written as i = i + 2 or i += 2 to increment by 2 for the interval */
			
			System.out.printf("%d           %.1f", i, i * 2.2);
			//printf = "print format" which means it will format the string in a certain way
			// argument and then type
			// in this program "%d", i is putting i in the print with an arguemnt of %d(digit because its an int)
			// in this program "%.1f", i is putting i * 2.2 in the print with an arguemnt of %.1f(float in the tenth place)
			// i * 2.2 because that is the conversion
			
			System.out.println();
		}
	}
}
