
public class Loop3 {
	
	public static void main (String[] args) {
		
		System.out.println("Miles		Kilometers");
		
		final double KMtoMiles = 1.689;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "		" + i * KMtoMiles);
			/* First value is 1(starting value) so I intialize the integer i = 1 in the for loop
			   i < 11(terminating condition), prefered i < 11 over i <= 10, both will stop at 10. 
			   less than the end point + 1 for the terminating conditon */
			/* In lab instructions, the interval goes up by 1 each time can be
			   written as i = i + 1 or i ++ to increment by 1 for the interval */
		}
		
	}

}
