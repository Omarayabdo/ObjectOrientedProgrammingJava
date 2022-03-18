import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		
		System.out.println("Kilograms  Pounds  Pounds  Kilograms");
		
		double pound1, kilograms;
		int pound2 = 20;
		
		for (int i = 1; i < 200; i += 2) {
		/* First value is 1(starting value) so I intialize the integer i = 1 in the for loop
		   i < 200(terminating condition), prefered i < 200 over i <= 199, both will stop at 199. 
		   less than the end point + 1 for the terminating conditon */
		/* In lab instructions, the interval goes up by 2 each time can be
		   written as i = i + 2 or i += 2 to increment by 2 for the interval */
		
			pound1 = i * 2.2;
			// declaring pound as an object equals i * 2.2
			
			kilograms = pound2 / 2.2;
			// declaring kilograms as an object equals pound2(declared originally as 20) divided by 2.2 (conversion)
			System.out.printf(" %d        %.1f        %d         %.2f", i, pound1, pound2, kilograms);
			//printf = "print format" which means it will format the string in a certain way
			// argument and then type
			// in this program "%d", i is putting i in the print with an arguemnt of %d(digit because its an int)
			// in this program "%.1f", i is putting i * 2.2 in the print with an arguemnt of %.1f(float in the tenth place)
			// in this program "%.2f", i is putting i * 2.2 in the print with an arguemnt of %.2f(float in the hundreth place)
			// i * 2.2 because that is the conversion
			System.out.println();
			pound2 += 5; 
			// pound2 increments by 5
		}
		
	}
}
